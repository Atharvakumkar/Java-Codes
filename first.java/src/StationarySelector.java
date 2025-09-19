import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class StationarySelector extends JFrame {

    private JComboBox<String> productCombo;
    private JLabel priceLabel;

    // Store product names and their prices
    private HashMap<String, Double> productPrices;

    public StationarySelector() {
        setTitle("Stationary Product Selector");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize product and price data
        productPrices = new HashMap<>();
        productPrices.put("Pen", 10.0);
        productPrices.put("Pencil", 5.0);
        productPrices.put("Notebook", 50.0);
        productPrices.put("Eraser", 3.0);
        productPrices.put("Sharpener", 7.0);
        productPrices.put("Scale", 12.0);

        // Create components
        JLabel selectLabel = new JLabel("Select a Product:");
        productCombo = new JComboBox<>(productPrices.keySet().toArray(new String[0]));
        priceLabel = new JLabel("Price: ₹ --");

        // Add item listener to combo box
        productCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selectedProduct = (String) productCombo.getSelectedItem();
                    double price = productPrices.get(selectedProduct);
                    priceLabel.setText("Price: ₹ " + price);
                }
            }
        });

        // Layout setup
        setLayout(new GridLayout(3, 1, 10, 10));
        add(selectLabel);
        add(productCombo);
        add(priceLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new StationarySelector().setVisible(true);
        });
    }
}
