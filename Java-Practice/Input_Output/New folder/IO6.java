import java.io.FileWriter;
import java.io.IOException;
public class IO6 {
    public static void main(String[] argv) {
        try {
            FileWriter wr = new FileWriter("D:\\input.txt"); 
            Integer arr[] = {10, 20, 30, 40, 50};
            int len = arr.length;
            for (int i = 0; i < len; i++) {
                wr.write(arr[i] + "\t");
            }
            wr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}