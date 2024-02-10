import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame implements ActionListener {
    private JTextField nameField, emailField;
    private JPasswordField passwordField;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(1250, 850);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");

        // Create text fields
        nameField = new JTextField();
        emailField = new JTextField();
        passwordField = new JPasswordField();

        // Create submit button
        JButton submitButton = new JButton("Submit");

        // Add action listener to the submit button
        submitButton.addActionListener(this);

        // Set absolute positions
        nameLabel.setBounds(20, 30, 80, 25);
        nameField.setBounds(120, 30, 200, 25);
        emailLabel.setBounds(20, 60, 80, 25);
        emailField.setBounds(120, 60, 200, 25);
        passwordLabel.setBounds(20, 90, 80, 25);
        passwordField.setBounds(120, 90, 200, 25);
        submitButton.setBounds(20, 120, 80, 25);

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());

        // Display the entered information in the console
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistrationForm registrationForm = new RegistrationForm();
            registrationForm.setLayout(null);
            registrationForm.setVisible(true);
        });
    }
}
