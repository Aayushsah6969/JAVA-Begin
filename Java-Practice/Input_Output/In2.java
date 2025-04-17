
//For character
import java.io.*;

class In2 {
    public static void main(String ar[]) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        char a;
        System.out.println("Enter the character");
        a = (char) (in.read());
        System.out.println("Value of a=" + a);
    }
}