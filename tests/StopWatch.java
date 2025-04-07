//Design a Stop Watch using event handling and multi-threading in Java

import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.util.concurrent.TimeUnit;   
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;  

public class StopWatch extends JFrame implements ActionListener {
    private JButton startButton, stopButton, resetButton;
    private JLabel timeLabel;
    private AtomicLong elapsedTime = new AtomicLong(0);
    private Timer timer;
    private AtomicBoolean running = new AtomicBoolean(false);
    
    public StopWatch() {
        setTitle("Stop Watch");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        timeLabel = new JLabel("00:00:00.000");
        timeLabel.setFont(new Font("Serif", Font.PLAIN, 30));
        add(timeLabel);
        
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        add(startButton);
        
        stopButton = new JButton("Stop");
        stopButton.addActionListener(this);
        add(stopButton);
        
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        add(resetButton);
        
        timer = new Timer();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton) {
            if (!running.get()) {
                running.set(true);
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        elapsedTime.addAndGet(1);
                        long millis = elapsedTime.get();
                        long hours = TimeUnit.MILLISECONDS.toHours(millis);
                        long minutes = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
                        long milliseconds = millis % 1000;
                        timeLabel.setText(String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds));
                    }
                }, 0, 1); // Update every millisecond
            }
        } else if (e.getSource() == stopButton) {
            running.set(false);
            timer.cancel();
        } else if (e.getSource() == resetButton) {
            running.set(false);
            timer.cancel();
            elapsedTime.set(0);
            timeLabel.setText("00:00:00.000");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopWatch stopWatch = new StopWatch();
            stopWatch.setVisible(true);
        });
    }
}



