import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {
    // Declare UI components
    JTextField nameField, rollField, cgpaField, emailField;
    JComboBox<String> branchBox;
    JLabel outputLabel;
    JButton submitButton, resetButton, colorButton;
    JPanel panel;

    // Constructor to set up the GUI
    public StudentForm() {
        // Frame properties
        setTitle("Student Registration");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel and set layout
        panel = new JPanel();
        panel.setLayout(new GridLayout(9, 2));
        panel.setBackground(Color.GREEN);

        // Add components to the panel
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Roll No:"));
        rollField = new JTextField();
        panel.add(rollField);

        panel.add(new JLabel("CGPA:"));
        cgpaField = new JTextField();
        panel.add(cgpaField);

        panel.add(new JLabel("Branch:"));
        String[] branches = {"CSE", "IT", "CS", "EEE"};
        branchBox = new JComboBox<>(branches);
        panel.add(branchBox);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        // Buttons
        submitButton = new JButton("SUBMIT");
        resetButton = new JButton("RESET");
        colorButton = new JButton("COLOR");

        panel.add(submitButton);
        panel.add(resetButton);
        panel.add(colorButton);

        // Output label
        panel.add(new JLabel("Result:"));
        outputLabel = new JLabel();
        panel.add(outputLabel);

        // Add panel to frame
        add(panel);

        // Add action listeners
        submitButton.addActionListener(this);
        resetButton.addActionListener(this);
        colorButton.addActionListener(this);

        // Make frame visible
        setVisible(true);
    }

    // Handle button actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            handleSubmit();
        } else if (e.getSource() == resetButton) {
            handleReset();
        } else if (e.getSource() == colorButton) {
            handleColorChange();
        }
    }

    // Handle submit button action
    private void handleSubmit() {
        try {
            String name = nameField.getText();
            String roll = rollField.getText();
            String cgpaText = cgpaField.getText();
            String email = emailField.getText();
            String branch = (String) branchBox.getSelectedItem();

            // Validation
            if (roll.length() < 7 || roll.length() > 8) {
                throw new Exception("Roll number must be 7 or 8 digits.");
            }

            double cgpa = Double.parseDouble(cgpaText);
            if (cgpa < 6.0 || cgpa > 10.0) {
                throw new Exception("CGPA must be between 6.0 and 10.0");
            }

            if (!email.contains("@") || !email.contains(".")) {
                throw new Exception("Invalid email format.");
            }

            // Display data
            outputLabel.setText("<html>Name: " + name + "<br>Roll: " + roll +
                    "<br>CGPA: " + cgpa + "<br>Branch: " + branch +
                    "<br>Email: " + email + "</html>");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    // Handle reset button action
    private void handleReset() {
        nameField.setText("");
        rollField.setText("");
        cgpaField.setText("");
        emailField.setText("");
        branchBox.setSelectedIndex(0);
        outputLabel.setText("");
    }

    // Handle color button action
    private void handleColorChange() {
        Color currentColor = panel.getBackground();
        if (currentColor == Color.GREEN) {
            panel.setBackground(Color.PINK);
        } else {
            panel.setBackground(Color.GREEN);
        }
    }

    // Main method to run the application
    public static void main(String[] args) {
        new StudentForm();
    }
}
