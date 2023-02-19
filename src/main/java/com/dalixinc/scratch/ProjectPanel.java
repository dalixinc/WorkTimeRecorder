package com.dalixinc.scratch;

import javax.swing.*;
import java.awt.*;

public class ProjectPanel extends JPanel {

    public ProjectPanel() {
        super();
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        setLayout(layout);

        setBackground(Color.LIGHT_GRAY);

        JLabel lblName = new JLabel("Project");
        JTextField tfProjectName = new JTextField(50);
        JTextField tfProjectCode = new JTextField(10);
        JButton butAddTask = new JButton("+");
        JButton butRemoveTask = new JButton("-");

        add(lblName);
        add(tfProjectName);
        add(tfProjectCode);
        add(butAddTask);
        add(butRemoveTask);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridLayout(0, 1, 10, 20));
        panel.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
        for (int i = 0; i < 3; i++) {
            panel.add(new ProjectPanel());
        }

        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
