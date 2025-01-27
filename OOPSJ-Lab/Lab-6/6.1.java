import java.util.*;
class main {
    public static void main(String args[]) {
        Scanner nums = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + i + "th element: ");
            arr[i] = nums.nextInt();
        }
        System.out.println("Your array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Try accessing array out of bound");
        try{
            System.out.println("7th ellement: "+arr[7]);
        }
       catch(ArrayIndexOutOfBoundsException e){
        // catch(Exception e){
            System.out.println("Catch block :"+e);
        }finally{
            nums.close();
        }
    }
}