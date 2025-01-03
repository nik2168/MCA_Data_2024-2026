
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AddThreeNumber {
    public static void main(String[] args) {
        Frame f = new Frame("Addition Of Three Number");

        TextField t1 = new TextField(10);
        TextField t2 = new TextField(10);
        TextField t3 = new TextField(10);
        TextField t4 = new TextField(10);

        Label l1 = new Label("First Number : ");
        Label l2 = new Label("First Number : ");
        Label l3 = new Label("First Number : ");

        Label result = new Label("Result : ");

        Button b = new Button("Add");


        f.setLayout(new FlowLayout());

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(result);
        f.add(t4);

        f.add(b);

     // Add ActionListener to handle button clicks
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Try-catch block to handle potential input errors
                try {
                    // Parse numbers from the text fields
                    double num1 = Double.parseDouble(t1.getText());
                    double num2 = Double.parseDouble(t2.getText());
                    double num3 = Double.parseDouble(t3.getText());

                    // Calculate the sum
                    double sum = num1 + num2 + num3;

                    // Display the result in the result label
                    t4.setText(""+sum);
                } catch (NumberFormatException ex) {
                    // If there is an error in parsing, show an error message
                    t4.setText("Please enter valid numbers.");
                }
            }
        });


        f.setSize(500, 500);
        f.setVisible(true);

    }
}
