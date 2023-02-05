package com.dalixinc.gui;

import javax.swing.*;
import java.awt.*;

public class TimeRecorderGui {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }

    private static void createAndShowGui() {
        JFrame frame = new JFrame("Work Time Recorder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TimeRecorderGui() {

    }
}
