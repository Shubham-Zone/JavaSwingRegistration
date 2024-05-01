import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
    private JTextField firstNameField, lastNameField, emailField;
    private JPasswordField passwordField;
    private JButton registerButton;

    public RegistrationForm() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(5, 2));

        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        registerButton = new JButton("Register");

        // Add components to the frame
        add(firstNameLabel);
        add(firstNameField);
        add(lastNameLabel);
        add(lastNameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Placeholder for spacing
        add(registerButton);

        // Add action listener to the register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration logic here
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String email = emailField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);
                
                // For demonstration purposes, just printing the data
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RegistrationForm form = new RegistrationForm();
                form.setVisible(true);
            }
        });
    }
}