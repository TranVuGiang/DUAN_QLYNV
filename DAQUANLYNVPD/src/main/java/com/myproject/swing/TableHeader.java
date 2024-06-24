package com.myproject.swing;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class TableHeader extends JLabel {
    public TableHeader(String text){
        super(text);
        setOpaque(true);
        setBackground(Color.WHITE);
        setFont(new Font("sanserif",1 , 18));
        setForeground(new Color(102,102,102));
        setBorder(new EmptyBorder(10,5,10,5));
    }
}
