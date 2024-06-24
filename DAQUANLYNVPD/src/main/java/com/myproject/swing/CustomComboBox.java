package com.myproject.swing;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import java.awt.*;

public class CustomComboBox<E> extends JComboBox<E> {
    public CustomComboBox() {
        super();
        initUI();
    }

    public CustomComboBox(E[] items) {
        super(items);
        initUI();
    }

    private void initUI() {
        setRenderer(new CustomComboBoxRenderer());
        setEditor(new CustomComboBoxEditor());
        setUI(new CustomComboBoxUI());
        setBackground(Color.WHITE); // Set background color to white
    }

    private class CustomComboBoxRenderer extends BasicComboBoxRenderer {
        @Override
        public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setFont(new Font("Arial", Font.BOLD, 14));
            label.setForeground(Color.DARK_GRAY);
            label.setBackground(Color.WHITE); // Set background color to white

            if (isSelected) {
                label.setBackground(new Color(184, 207, 229));
            }

            return label;
        }
    }

    private class CustomComboBoxEditor extends BasicComboBoxEditor {
        @Override
        protected JTextField createEditorComponent() {
            JTextField editor = new JTextField();
            editor.setFont(new Font("Arial", Font.BOLD, 14));
            editor.setForeground(Color.DARK_GRAY);
            editor.setBackground(Color.WHITE); // Set background color to white
            editor.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            return editor;
        }
    }

    private class CustomComboBoxUI extends javax.swing.plaf.basic.BasicComboBoxUI {
        @Override
        protected JButton createArrowButton() {
            JButton button = new JButton();
            button.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
            button.setBackground(Color.WHITE); // Set background color to white
            return button;
        }
    }

}
