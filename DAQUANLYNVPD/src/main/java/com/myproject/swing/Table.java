/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myproject.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class Table extends JTable{

    public Table(){
        
        setShowHorizontalLines(false);
        setGridColor(new Color(230,230,230));
        setRowHeight(40);
        getTableHeader().setReorderingAllowed(false);
        setAutoResizeMode(Table.AUTO_RESIZE_ALL_COLUMNS);
        
        setBorder(new EmptyBorder(0,0,0,0));
        getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer(){
        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1){
            TableHeader header = new TableHeader(o + " ");
            if(i1 == 4){
                header.setHorizontalAlignment(JLabel.CENTER);
                header.setBorder(null);
            }
            return header;
        }
        });
        setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component com = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if(column !=8){
                    com.setBackground(Color.WHITE);
                    com.setFont(new Font("Times New Roman",0,18));
                    setBorder(noFocusBorder);
                    if(isSelected){
                        com.setForeground(new Color(255,255,255));
                        com.setBackground(new Color(165,116,116));
                    } else {
                        com.setForeground(new Color(0,0,0));
                    }
                }
                return com;
            }
        
        });
    }
       public void addRow(Object[] row){
           DefaultTableModel model = (DefaultTableModel) getModel();
           model.addRow(row);
       }
}
