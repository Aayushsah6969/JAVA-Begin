import java.util.*;
public class array_search {
    
    static int search( int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int max(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={33, 6, 77, 23, 54, 86, 44, 7, 34, 67};
        System.out.println("Enter element to search: ");
        Scanner input = new Scanner(System.in);
        int key = input.nextInt();
        int index = search(arr, key);
        if(index == -1){
            System.out.println("Element not found in array");
        }else{
            System.out.println("Value found at index "+index);
            System.out.println("Value found at position "+(index+1));
        }
        int maximum = max(arr);
        System.out.println("Maximum value in array is "+maximum);
    }
}
