package com.dalixinc.gui;

import com.dalixinc.scratch.ProjectPanel;
import com.dalixinc.scratch.TaskPanel;

import javax.swing.*;
import java.awt.*;

public class TimeRecorderGui {

    static  JFrame frame = new JFrame(); //TODO: horrible horrible hack

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });

        JPanel rootPanel = new JPanel(new GridLayout(0, 1, 5, 5));
        rootPanel.add(new ProjectPanel());
        rootPanel.add(new ProjectPanel());
        rootPanel.add(new TaskPanel());
        rootPanel.add(new ProjectPanel());
        rootPanel.add(new TaskPanel());
        rootPanel.add(new TaskPanel());
        rootPanel.add(new ProjectPanel());
        frame.setContentPane(rootPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void createAndShowGui() {
        frame = new JFrame("Work Time Recorder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        //frame.setVisible(true);
    }

    public TimeRecorderGui() {

    }
}
