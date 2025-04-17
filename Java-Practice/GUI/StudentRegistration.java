import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame {

    // Components
    JTextField nameField, rollField, cgpaField, emailField;
    JComboBox<String> branchBox;
    JLabel resultLabel;

    // Constructor
    public StudentRegistration() {
        setTitle("University Event Registration");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Use null layout for absolute positioning

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(200, 50, 200, 30);
        add(nameField);

        // Roll No
        JLabel rollLabel = new JLabel("Roll No:");
        rollLabel.setBounds(50, 100, 100, 30);
        add(rollLabel);

        rollField = new JTextField();
        rollField.setBounds(200, 100, 200, 30);
        add(rollField);

        // CGPA
        JLabel cgpaLabel = new JLabel("CGPA:");
        cgpaLabel.setBounds(50, 150, 100, 30);
        add(cgpaLabel);

        cgpaField = new JTextField();
        cgpaField.setBounds(200, 150, 200, 30);
        add(cgpaField);

        // Branch
        JLabel branchLabel = new JLabel("Branch:");
        branchLabel.setBounds(50, 200, 100, 30);
        add(branchLabel);

        String[] branches = {"CSE", "IT", "CS", "EEE"};
        branchBox = new JComboBox<>(branches);
        branchBox.setBounds(200, 200, 200, 30);
        add(branchBox);

        // Email
        JLabel emailLabel = new JLabel("Email ID:");
        emailLabel.setBounds(50, 250, 100, 30);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(200, 250, 200, 30);
        add(emailField);

        // Buttons
        JButton submitBtn = new JButton("SUBMIT");
        submitBtn.setBounds(50, 300, 100, 30);
        add(submitBtn);

        JButton resetBtn = new JButton("RESET");
        resetBtn.setBounds(200, 300, 100, 30);
        add(resetBtn);

        JButton colorBtn = new JButton("COLOR");
        colorBtn.setBounds(350, 300, 100, 30);
        add(colorBtn);

        // Result display
        JLabel resultTextLabel = new JLabel("Result:");
        resultTextLabel.setBounds(50, 350, 100, 30);
        add(resultTextLabel);

        resultLabel = new JLabel();
        resultLabel.setBounds(200, 350, 300, 100);
        add(resultLabel);

        // Button Listeners
        submitBtn.addActionListener(e -> {
            try {
                String name = nameField.getText();
                String roll = rollField.getText();
                String cgpaText = cgpaField.getText();
                String branch = (String) branchBox.getSelectedItem();
                String email = emailField.getText();

                // Validation
                if (roll.length() < 7 || roll.length() > 8)
                    throw new Exception("Roll number must be 7 or 8 digits.");

                double cgpa = Double.parseDouble(cgpaText);
                if (cgpa < 6.0 || cgpa > 10.0)
                    throw new Exception("CGPA must be between 6.0 and 10.0");

                if (!email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$"))
                    throw new Exception("Invalid email format.");

                // Show Result
                resultLabel.setText("<html>Name: " + name + "<br>Roll: " + roll +
                        "<br>CGPA: " + cgpa + "<br>Branch: " + branch + "<br>Email: " + email + "</html>");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Validation Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        resetBtn.addActionListener(e -> {
            nameField.setText("");
            rollField.setText("");
            cgpaField.setText("");
            emailField.setText("");
            branchBox.setSelectedIndex(0);
            resultLabel.setText("");
        });

        colorBtn.addActionListener(e -> {
            Color currentColor = getContentPane().getBackground();
            if (currentColor.equals(Color.GREEN))
                getContentPane().setBackground(Color.PINK);
            else
                getContentPane().setBackground(Color.GREEN);
        });

        // Set initial background color
        getContentPane().setBackground(Color.GREEN);

        setVisible(true);
    }

    // Main
    public static void main(String[] args) {
        new StudentRegistration();
    }
}
