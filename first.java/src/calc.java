import javax.swing.*;
import java.awt.event.*;

public class calc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("First:");
        l1.setBounds(20, 20, 50, 20);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(80, 20, 100, 20);
        frame.add(t1);

        JLabel l2 = new JLabel("Second:");
        l2.setBounds(20, 50, 50, 20);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(80, 50, 100, 20);
        frame.add(t2);

        JLabel result = new JLabel("Result: ");
        result.setBounds(20, 120, 200, 30);
        frame.add(result);

        // Buttons with inline listeners
        JButton add = new JButton("ADD");
        add.setBounds(20, 80, 60, 30);
        frame.add(add);
        add.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                result.setText("Result: " + (n1 + n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        JButton sub = new JButton("SUB");
        sub.setBounds(90, 80, 60, 30);
        frame.add(sub);
        sub.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                result.setText("Result: " + (n1 - n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        JButton mul = new JButton("MUL");
        mul.setBounds(160, 80, 60, 30);
        frame.add(mul);
        mul.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                result.setText("Result: " + (n1 * n2));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        JButton div = new JButton("DIV");
        div.setBounds(230, 80, 60, 30);
        frame.add(div);
        div.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(t1.getText());
                double n2 = Double.parseDouble(t2.getText());
                if (n2 == 0) {
                    JOptionPane.showMessageDialog(frame, "Cannot divide by zero!");
                } else {
                    result.setText("Result: " + (n1 / n2));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Enter valid numbers!");
            }
        });

        frame.setVisible(true);
    }
}