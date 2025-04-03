/*
Swing is a Java Foundation Classes (JFC) library and a GUI (Graphical User Interface) toolkit used to build desktop-based applications with a rich set of components, built on top of the Abstract Window Toolkit (AWT) and entirely written in Java.
*/
/*
JFrame is a fundamental class in Java Swing used to create a window on the screen. It serves as a top-level container that provides a base window for adding various components such as menu bars, panels, labels, text fields, buttons, and more. Almost every Swing application starts with a JFrame window.
*/
/*
In general, to detect when the user clicks an onscreen button (or does the keyboard equivalent), a program must have an object that implements the ActionListener interface. The program must register this object as an action listener on the button (the event source), using the addActionListener method.
*/
/*
The listener interface for receiving action events. The class that is interested in processing an action event implements this interface, and the object created with that class is registered with a component, using the component's addActionListener method.
*/
/*
The actionPerformed method is a central aspect of handling event-driven programming concepts. It is part of the ActionListener interface and helps manage user interactions with GUI components.
*/

//Java JButton Example with ActionListener
import java.awt.event.*;  
import javax.swing.*;    
public class ButtonExample {  
public static void main(String[] args) {  
    JFrame f=new JFrame();  
    final JTextField tf=new JTextField();  
    tf.setBounds(50,50,250,40);  
    JButton b=new JButton("Click Here");  
    b.setBounds(50,100,95,30);  
    b.addActionListener(new ActionListener(){  
  public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to KIIT UNIVERSITY");  
        }  
    });  
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
}
}  