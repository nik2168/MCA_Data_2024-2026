import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {

    // Declare the text field to display the result
    private JTextField textField;

    // Store the operator and operands
    private String operator = "";
    private double num1 = 0.0;
    private boolean startNew = true;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator().createAndShowGUI());
    }

    // Method to create and show the GUI
    public void createAndShowGUI() {
        // Create the main frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        frame.setLayout(new BorderLayout());

        // Create a text field to display the result
        textField = new JTextField();
        textField.setFont(new Font("Arial", Font.PLAIN, 24));
        textField.setEditable(false);
        frame.add(textField, BorderLayout.NORTH);

        // Create a panel with GridLayout for the buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 3, 3));

        // Create the buttons
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.PLAIN, 20));
            button.addActionListener(new ButtonClickListener());
            panel.add(button);
        }

        // Add panel to the frame
        frame.add(panel, BorderLayout.CENTER);

        // Make the frame visible
        frame.setVisible(true);
    }

    // ActionListener for button clicks
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // If the user clicks on a number or operator
            if (command.matches("[0-9]") || command.equals(".")) {
                if (startNew) {
                    textField.setText("");
                    startNew = false;
                }
                textField.setText(textField.getText() + command);
            }
            // If the user clicks on an operator
            else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
                operator = command;
                num1 = Double.parseDouble(textField.getText());
                textField.setText("");
            }
            // If the user clicks "="
            else if (command.equals("=")) {
                double num2 = Double.parseDouble(textField.getText());
                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
                startNew = true;
            }
        }
    }
}
