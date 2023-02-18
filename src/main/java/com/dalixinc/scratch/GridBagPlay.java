package com.dalixinc.scratch;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * @author Daleman ©2023
 */
public class GridBagPlay {


    private static void createAndShowGui() {
        JFrame frame = new JFrame("Main Frame: GridBag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400, 400);


        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 0, 5, 10));

        JButton b1, b2, b3, b4, b5;

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);

        Border panelBorder = BorderFactory.createEmptyBorder(15, 15,5,15);
        panel.setBorder(panelBorder);

        ImageIcon icon = new ImageIcon("C:\\Users\\doofu\\IdeaProjects\\WorkTimeRecorder\\src\\main\\java\\com\\dalixinc\\gui\\clock_icon2.jpg");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().add(panel);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //EventQueue.invokeLater(() -> createAndShowGui());  //Using Lambda
        EventQueue.invokeLater(GridBagPlay::createAndShowGui);  //Using Method Reference


    }

}
