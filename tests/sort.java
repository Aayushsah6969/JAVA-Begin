import java.util.Arrays;

class ArrayOperations {
    void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
    
    void search(int[] arr, int key) {
        int index = Arrays.binarySearch(arr, key);
        System.out.println("Element found at index: " + index);
    }
}
class Main {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9};
        ArrayOperations obj = new ArrayOperations();
        obj.sort(arr);
        obj.search(arr, 3);
    }
}
