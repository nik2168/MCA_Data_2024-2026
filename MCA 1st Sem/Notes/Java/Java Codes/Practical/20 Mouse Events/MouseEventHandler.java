import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventHandler extends JFrame implements MouseListener, MouseMotionListener {
    
    private JLabel label;
    
    public MouseEventHandler() {
        // Set up the frame
        setTitle("Mouse Event Handler");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label to show mouse event details
        label = new JLabel("Mouse Event Details: ");
        label.setFont(new Font("Arial", Font.PLAIN, 16));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        // Add MouseListener and MouseMotionListener to the frame
        addMouseListener(this);  // MouseListener for click events
        addMouseMotionListener(this);  // MouseMotionListener for movement and drag events

        // Display the frame
        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered the frame at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited the frame");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged at: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse Moved at: " + e.getX() + ", " + e.getY());
    }

    public static void main(String[] args) {
        new MouseEventHandler();
    }
}
