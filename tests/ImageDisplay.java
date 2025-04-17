import javax.swing.*;
import java.awt.*;

public class ImageDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load the image
        ImageIcon imageIcon = new ImageIcon("image.jpg"); // Make sure this file exists
        JLabel label = new JLabel(imageIcon);

        frame.add(label);
        frame.setVisible(true);
    }
}
