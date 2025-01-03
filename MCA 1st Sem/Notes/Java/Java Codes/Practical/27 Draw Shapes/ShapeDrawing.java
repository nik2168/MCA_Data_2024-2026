import javax.swing.*;
import java.awt.*;

public class ShapeDrawing extends JPanel {

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the superclass method to ensure proper painting

        // Set color for the shapes
        g.setColor(Color.BLUE);

        // Draw a line
        g.drawLine(50, 50, 200, 50);  // x1, y1, x2, y2

        // Draw a rectangle
        g.setColor(Color.RED);
        g.drawRect(50, 100, 200, 100);  // x, y, width, height

        // Draw an oval
        g.setColor(Color.ORANGE);
        g.drawOval(50, 250, 200, 100);  // x, y, width, height

    }

    public static void main(String[] args) {
        // Create a JFrame to display the shapes
        JFrame frame = new JFrame("Graphics Drawing Example");
        ShapeDrawing panel = new ShapeDrawing();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);  // Set the size of the window
        frame.add(panel);  // Add the custom panel to the frame
        frame.setVisible(true);  // Make the frame visible
    }
}
