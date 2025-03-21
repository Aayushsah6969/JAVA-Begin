import os

def delete_class_files(directory):
    # Walk through the directory and its subdirectories
    for root, dirs, files in os.walk(directory):
        for file in files:
            # Check if the file has a '.class' extension
            if file.endswith('.class'):
                file_path = os.path.join(root, file)
                try:
                    os.remove(file_path)
                    print(f"Deleted: {file_path}")
                except Exception as e:
                    print(f"Error deleting {file_path}: {e}")

if __name__ == "__main__":
    # Get the parent directory of the current script
    parent_directory = os.path.dirname(os.path.abspath(__file__))

    # Walk through all directories within the parent directory
    for root, dirs, files in os.walk(parent_directory):
        for dir in dirs:
            dir_path = os.path.join(root, dir)
            delete_class_files(dir_path)
