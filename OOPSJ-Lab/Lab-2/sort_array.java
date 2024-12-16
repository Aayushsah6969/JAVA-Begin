import java.util.*;
public class sort_array {
    public static void main(String args[]){
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = size.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+i+"th element: ");
            arr[i]=size.nextInt();
        }
        for(int i=0; i<n; i++){
            for(int j=i;j<n-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }    
}
