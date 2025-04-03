//Example of displaying image on the button
import javax.swing.*;      
public class ButtonExample2{    
ButtonExample2(){    
JFrame f=new JFrame("Button Example");            
JButton b=new JButton(new ImageIcon("C:\\KIITlogo.png"));    
b.setBounds(10,10,440,350);    
f.add(b);    
f.setSize(300,400);    
f.setLayout(null);    
f.setVisible(true);    
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }         
public static void main(String[] args) {    
    new ButtonExample2();    
}    
}    