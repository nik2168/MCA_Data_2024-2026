
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

@SuppressWarnings("removal")
public class ArithmeticCalculatorApplet extends Applet implements ActionListener {

    // Declare components
    TextField display;
    Button[] numberButtons = new Button[10];
    Button add, subtract, multiply, divide, equal, clear, decimal;
    double num1, num2, result;
    char operator;
    
    @Override
    public void init() {
        // Set layout of the applet
        setLayout(new BorderLayout());
        
        // Create the text field to display the result
        display = new TextField();
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        display.setEditable(false);
        add(display, BorderLayout.NORTH);
        
        // Panel to hold the buttons for the calculator
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        
        // Create number buttons and add action listeners
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new Button(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            panel.add(numberButtons[i]);
        }
        
        // Create operation buttons and add action listeners
        add = new Button("+");
        subtract = new Button("-");
        multiply = new Button("*");
        divide = new Button("/");
        equal = new Button("=");
        clear = new Button("C");
        decimal = new Button(".");
        
        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        decimal.addActionListener(this);
        
        // Add operation buttons to the panel
        panel.add(add);
        panel.add(subtract);
        panel.add(multiply);
        panel.add(divide);
        panel.add(decimal);
        panel.add(equal);
        panel.add(clear);
        
        // Add the panel to the applet
        add(panel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        // If a number button is clicked, append the number to the display
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            display.setText(display.getText() + command);
        }
        // If an operation button is clicked
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
            num1 = Double.parseDouble(display.getText());
            operator = command.charAt(0);  // Store the operator
            display.setText("");  // Clear the display for the second number
        }
        // If the "=" button is clicked, calculate the result
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        display.setText("Error");
                        return;
                    }
                    break;
            }
            display.setText(String.valueOf(result));  // Display the result
        }
        // If the "C" button is clicked, clear the display
        else if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = ' ';
        }
    }
}

