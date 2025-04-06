import java.io.*;

public class IO1 {
    public static void main(String args[]) throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        System.out.println("Enter your name");

        String name = br.readLine();
        int c = Integer.parseInt(name);
        int d = 10 + c;
        System.out.println("sum=" + d);
        // System.out.println("Welcome "+name);
    }
}