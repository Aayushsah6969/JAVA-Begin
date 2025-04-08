import javax.swing.*;

public class MyFirstGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My GUI Window");
        JLabel label = new JLabel("Hello GUI World!");
        
        frame.add(label);          // Add label to window
        frame.setSize(300, 200);   // Set size
        frame.setLayout(null);     // No default layout
        label.setBounds(1000, 50, 150, 30);  // x, y, width, height
        frame.setVisible(true);    // Show the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
