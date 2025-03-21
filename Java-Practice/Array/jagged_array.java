/*
Jagged Arrays in Java
In Java, a jagged array is an array of arrays where each row of the array can have a different number of columns. This contrasts with a regular two-dimensional array, where each row has the same number of columns.
*/
//Java Program to illustrate the jagged array  
class jagged_array{  
    public static void main(String[] args){  
        //declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  
            for(int j=0; j<arr[i].length; j++)  
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
    }  
}  
/*Output:

0 1 2
3 4 5 6
7 8
*/