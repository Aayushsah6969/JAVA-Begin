import java.util.*;
public class array2 {
    public static void main(String args[]){
        Scanner nums = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter "+i+"th element: ");
            arr[i]= nums.nextInt();
        }
        System.out.println("Your array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
