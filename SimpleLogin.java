import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleLogin extends JFrame implements ActionListener {
    JTextField userField;
    JPasswordField passField;
    JButton loginButton;

    SimpleLogin() {
        setTitle("Swing Application");
        setSize(300, 180);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Username Label and Text Field
        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(40, 30, 80, 25);
        add(userLabel);

        userField = new JTextField();
        userField.setBounds(130, 30, 120, 25);
        add(userField);

        // Password Label and Password Field
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(40, 70, 80, 25);
        add(passLabel);

        passField = new JPasswordField();
        passField.setBounds(130, 70, 120, 25);
        add(passField);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setBounds(100, 110, 80, 25);
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        if (username.equals("Karunya") && password.equals("Karunya")) {
            JOptionPane.showMessageDialog(this, "Login Successful!", "Message", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed!", "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new SimpleLogin();
    }
}
