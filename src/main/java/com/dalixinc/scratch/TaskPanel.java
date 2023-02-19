package com.dalixinc.scratch;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TaskPanel extends JPanel {
    public TaskPanel() {
        super();
        //setLayout(null);
        FlowLayout layout;
        layout = new FlowLayout();
        layout.setAlignment(FlowLayout.LEFT);
        setLayout(layout);

        //setLayout(new FlowLayout().setAlignment(SwingConstants.LEFT));
        Border panelBorder = BorderFactory.createEmptyBorder(2, 50, 2, 2);
        this.setBorder(panelBorder);

        JLabel lblName = new JLabel("Task:");
        JTextField tfTaskName = new JTextField(100);
        JTextField tfTaskCode = new JTextField(10);
        JButton butStartClock = new JButton("Start");
        JButton butStopClock= new JButton("Stop");
        JLabel lblClock = new JLabel("00:00:00");

        add(lblName);
        add(tfTaskName);
        add(tfTaskCode);
        add(butStartClock);
        add(butStopClock);
        add(lblClock);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaskPanel Tester");
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        for (int i = 0; i < 3; i++) {
            panel.add(new TaskPanel());
        }

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
