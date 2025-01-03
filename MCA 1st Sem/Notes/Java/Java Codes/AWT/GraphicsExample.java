import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsExample extends JPanel {

    // Override the paintComponent method
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // Call the superclass method to ensure proper rendering

  // Set the font for drawing text
        Font font = new Font("Arial", Font.BOLD, 24); // Font name, style, size
        g.setFont(font);

        // Set the color for the text
        g.setColor(Color.BLACK);

        // Draw text at the specified position
        g.drawString("Hello, Java!", 50, 10);

        // Set the color for the shape
        g.setColor(Color.BLUE);

        // Draw various shapes
        g.fillRect(50, 50, 200, 100); // Rectangle (x, y, width, height)
        g.setColor(Color.RED);
        g.fillOval(50, 200, 100, 100); // Oval (x, y, width, height)

        
        // Draw a line
        g.setColor(Color.GREEN);
        g.drawLine(50, 50, 250, 150); // Line (x1, y1, x2, y2)
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        GraphicsExample panel = new GraphicsExample();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
