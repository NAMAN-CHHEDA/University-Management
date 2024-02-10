import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonDemo extends JFrame {
    private JLabel label;

    public ButtonDemo() {
        setTitle("Button Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        // Create label
        label = new JLabel("Press a button");

        // Add action listeners to buttons
        button1.addActionListener(new ButtonClickListener("Button 1"));
        button2.addActionListener(new ButtonClickListener("Button 2"));
        button3.addActionListener(new ButtonClickListener("Button 3"));
        button4.addActionListener(new ButtonClickListener("Button 4"));

        // Create layout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(label);
    }

    private class ButtonClickListener implements ActionListener {
        private String buttonText;

        public ButtonClickListener(String buttonText) {
            this.buttonText = buttonText;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setText("Button pressed: " + buttonText);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ButtonDemo buttonDemo = new ButtonDemo();
            buttonDemo.setVisible(true);
        });
    }
}
