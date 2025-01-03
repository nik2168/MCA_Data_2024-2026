import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class SystemClock extends JFrame {
    private JLabel timeLabel;  // Label to display time

    public SystemClock() {
        // Set up the frame
        setTitle("System Clock");
        setSize(300, 150);  // Size of the clock window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
        
        // Create a label to display the time
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.PLAIN, 50));  // Large font for the time display
        add(timeLabel);

        // Set up a Timer to update the time every second
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Get current time and update the label
                LocalTime currentTime = LocalTime.now();
                timeLabel.setText(currentTime.toString().substring(0, 8));  // Display HH:mm:ss
            }
        }, 0, 1000);  // Initial delay: 0ms, Period: 1000ms (1 second)

        setVisible(true);  // Make the frame visible
    }

    public static void main(String[] args) {
        // Create and start the System Clock
        SwingUtilities.invokeLater(() -> new SystemClock());
    }
}
