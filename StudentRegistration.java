import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegisterFrame extends JFrame implements ActionListener {
    JTextField nameField;
    JRadioButton male, female;
    JCheckBox apple, samsung, redmi, oneplus;
    JComboBox<String> colorBox;
    JButton saveButton;

    RegisterFrame() {
        setTitle("Register");
        setSize(350, 300);
        setLayout(new GridLayout(6, 2, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        // Gender
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);
        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        // Model
        add(new JLabel("Model:"));
        JPanel modelPanel = new JPanel();
        apple = new JCheckBox("Apple");
        samsung = new JCheckBox("Samsung");
        redmi = new JCheckBox("Redmi");
        oneplus = new JCheckBox("OnePlus");
        modelPanel.add(apple);
        modelPanel.add(samsung);
        modelPanel.add(redmi);
        modelPanel.add(oneplus);
        add(modelPanel);

        // Color (Dropdown)
        add(new JLabel("Color:"));
        String[] colors = {"Black", "White", "Blue", "Red"};
        colorBox = new JComboBox<>(colors);
        add(colorBox);

        // Save button
        add(new JLabel(""));
        saveButton = new JButton("Save");
        saveButton.addActionListener(this);
        add(saveButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get data from inputs
        String name = nameField.getText();
        String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "Not Selected");

        StringBuilder models = new StringBuilder();
        if (apple.isSelected()) models.append("Apple, ");
        if (samsung.isSelected()) models.append("Samsung, ");
        if (redmi.isSelected()) models.append("Redmi, ");
        if (oneplus.isSelected()) models.append("OnePlus, ");
        if (models.length() > 0)
            models.delete(models.length() - 2, models.length()); // remove last comma

        String color = (String) colorBox.getSelectedItem();

        // Open Display Frame
        new DisplayFrame(name, gender, models.toString(), color);
    }
}

class DisplayFrame extends JFrame {
    DisplayFrame(String name, String gender, String models, String color) {
        setTitle("Display");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea displayArea = new JTextArea(6, 25);
        displayArea.setEditable(false);
        displayArea.setText("Name: " + name +
                "\nGender: " + gender +
                "\nModel: " + models +
                "\nColor: " + color);

        add(new JLabel(new ImageIcon(
                UIManager.getIcon("OptionPane.informationIcon").toString()))); // simple placeholder icon
        add(displayArea);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(ae -> dispose());
        add(okButton);

        setVisible(true);
    }
}

public class StudentRegistration {
    public static void main(String[] args) {
        new RegisterFrame();
    }
}
