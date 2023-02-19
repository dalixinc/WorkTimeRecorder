package com.dalixinc.scratch;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class ProjectsPanelTest {
    public static void main(String[] args) {
        createGUI();
    }

    private static void createGUI() {
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ProjectsPanel panProjects = new ProjectsPanel();
        panProjects.setBackground(Color.red);
        panProjects.add(new ProjectPanel());
        panProjects.add(new ProjectPanel());
        panProjects.add(new TaskPanel());
        panProjects.add(new TaskPanel());
        panProjects.add(new ProjectPanel());
        panProjects.add(new TaskPanel());
        panProjects.add(new TaskPanel());
        panProjects.add(new TaskPanel());


        frame.add(panProjects);
        frame .pack();
        frame.setVisible(true);
    }
}