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
    # Ask the user for the directory path
    directory = input("Enter the directory path where you want to delete .class files: ")

    # Check if the directory exists
    if os.path.isdir(directory):
        delete_class_files(directory)
    else:
        print("The specified directory does not exist.")
