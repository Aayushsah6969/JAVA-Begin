
//For String
import java.io.*;

class In3 {
    public static void main(String ar[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String a;
        System.out.println("Enter the String");
        a = in.readLine();
        System.out.println("Value of a= " + a);
    }
}