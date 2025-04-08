// Simplified Java JList Example
import javax.swing.*;

public class ListExample {
     ListExample() {
          JFrame f = new JFrame();
          String[] items = {"Item1", "Item2", "Item3", "Item4"}; // Array of items
          JList<String> list = new JList<>(items); // Directly initialize JList with the array
          list.setBounds(100, 100, 75, 75);
          f.add(list);
          f.setSize(400, 400);
          f.setLayout(null);
          f.setVisible(true);
     }

     public static void main(String args[]) {
          new ListExample();
     }
}