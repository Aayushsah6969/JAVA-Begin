
/*InputStreamReader read=new InputStreamReader(System.in);
This statement creates an object of InputStreamReader type to
accumulate streamlined bit pattern from from the input device.
*/
/*
BufferedReader in=new BufferedReader(read);
This statement is used to create an object 'in' of BufferedReader type to store the input data entered from the keyboard temporarily.
*/
//For Integer number (same for float and double)
import java.io.*;

class In1 {
    public static void main(String ar[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        int a;
        System.out.println("Enter the number");
        a = Integer.parseInt(in.readLine());
        int b = 10 + a;
        System.out.println("Value of b=" + b);
    }
}