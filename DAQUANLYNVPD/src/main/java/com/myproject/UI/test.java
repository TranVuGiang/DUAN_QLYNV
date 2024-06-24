package com.myproject.UI;

import javax.swing.*;
import java.awt.*;

public class test extends JFrame {

    public test() {
        setTitle("Full Size Panel Example");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.BLUE);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.GREEN);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        getContentPane().add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            test frame = new test();
            frame.setVisible(true);
        });
    }
}
