package com.dalixinc.scratch;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class MenuTester extends JPanel {

    static JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(MenuTester::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Menu Tester");

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BevelBorder(BevelBorder.RAISED));

        JMenu menActions = new JMenu("Actions");
        menuBar.add(menActions);

        JMenuItem miAddProj = new JMenuItem("Add Project");
        JMenuItem miDelProj = new JMenuItem("Delete Project");
        JMenuItem miExit = new JMenuItem("Exit");

        menActions.add(miAddProj);
        menActions.add(miDelProj);
        menActions.add(miExit);

        frame.setJMenuBar(menuBar);
        frame.setContentPane(new JPanel());
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}
