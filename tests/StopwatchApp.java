import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopwatchApp extends JFrame implements ActionListener {

    JLabel timeLabel;
    JButton startBtn, stopBtn, resetBtn;

    Timer timer;
    int elapsedTime = 0; // in milliseconds
    boolean isRunning = false;

    StopwatchApp() {
        setTitle("Stopwatch");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        // Display time
        timeLabel = new JLabel("00:00:000");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        add(timeLabel);

        // Buttons
        startBtn = new JButton("Start");
        stopBtn = new JButton("Stop");
        resetBtn = new JButton("Reset");

        add(startBtn);
        add(stopBtn);
        add(resetBtn);

        // Timer (100 ms = 0.1 sec updates)
        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedTime += 10;
                updateTimeLabel();
            }
        });

        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);
        resetBtn.addActionListener(this);

        setVisible(true);
    }

    void updateTimeLabel() {
        int minutes = (elapsedTime / 60000);
        int seconds = (elapsedTime / 1000) % 60;
        int milliseconds = elapsedTime % 1000;

        timeLabel.setText(String.format("%02d:%02d:%03d", minutes, seconds, milliseconds));
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) {
            if (!isRunning) {
                timer.start();
                isRunning = true;
            }
        } else if (e.getSource() == stopBtn) {
            if (isRunning) {
                timer.stop();
                isRunning = false;
            }
        } else if (e.getSource() == resetBtn) {
            timer.stop();
            isRunning = false;
            elapsedTime = 0;
            updateTimeLabel();
        }
    }

    public static void main(String[] args) {
        new StopwatchApp();
    }
}

