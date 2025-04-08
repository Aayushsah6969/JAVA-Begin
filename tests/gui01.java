import javax.swing.*;
import java.awt.event.*;

class Main{
	public static void main(String ar[]){
		JFrame frame = new JFrame("My Title");
        frame.setSize(300, 300);
        frame.setLayout(null);
		JLabel lable = new JLabel("");
		JButton button = new JButton("Click me");
        lable.setBounds(100, 50, 150, 30);
        button.setBounds(100, 100, 100, 30);
		frame.add(lable);
		frame.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("Button Clicked");
				lable.setText("Button is Clicked");
			}
		});
        frame.setVisible(true);
	}
}