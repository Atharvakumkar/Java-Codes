package com.mycompany.jdbcoracledemo;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class gui2 extends JFrame implements ListSelectionListener {
    Container cp;
    
    JList I;
    JLabel II;
    String[] items = {"pen", "pencil", "eraser", "scale"};
    int[] price = {5, 15, 20, 10};
    
    public gui2() {
        cp = this.getContentPane();
        
        I = new JList(items); // raw JList without <String>
        II = new JLabel("Select an item to see the price");
        
        I.addListSelectionListener(this);
        
        cp.setLayout(new FlowLayout());
        cp.add(I);
        cp.add(II);
        
        setTitle("Price List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new gui2();
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int index = I.getSelectedIndex();
        if (index != -1) {
            II.setText(items[index] + " Price: " + price[index]);
        }
    }
}
