import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReservationForm extends JFrame {

    private JTextField[] nameFields = new JTextField[3];
    private JTextField[] ageFields = new JTextField[3];
    private JTextField billField;
    private JRadioButton acButton, nonAcButton;

    private final double AC_FARE = 500;
    private final double NON_AC_FARE = 300;

    public ReservationForm() {
        setTitle("Mumbai-Pune Reservation Form");
        setSize(400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel for names and ages
        JPanel inputPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        inputPanel.add(new JLabel("Passenger No."));
        inputPanel.add(new JLabel("Name"));
        inputPanel.add(new JLabel("Age"));
        inputPanel.add(new JLabel(""));

        for (int i = 0; i < 3; i++) {
            inputPanel.add(new JLabel("Passenger " + (i + 1) + ":"));

            nameFields[i] = new JTextField();
            inputPanel.add(nameFields[i]);

            ageFields[i] = new JTextField();
            inputPanel.add(ageFields[i]);
        }

        // Journey type radio buttons
        acButton = new JRadioButton("AC");
        nonAcButton = new JRadioButton("NonAC");
        nonAcButton.setSelected(true); // default selection

        ButtonGroup group = new ButtonGroup();
        group.add(acButton);
        group.add(nonAcButton);

        JPanel radioPanel = new JPanel();
        radioPanel.add(new JLabel("Journey Type:"));
        radioPanel.add(acButton);
        radioPanel.add(nonAcButton);

        // Bill field (non-editable)
        JPanel billPanel = new JPanel(new FlowLayout());
        billPanel.add(new JLabel("Final Bill: ₹"));
        billField = new JTextField(10);
        billField.setEditable(false);
        billPanel.add(billField);

        // Button to calculate bill
        JButton calculateBtn = new JButton("Calculate Bill");
        calculateBtn.addActionListener(e -> calculateBill());

        // Layout all components
        setLayout(new BorderLayout(10, 10));
        add(inputPanel, BorderLayout.NORTH);
        add(radioPanel, BorderLayout.CENTER);

        JPanel southPanel = new JPanel(new BorderLayout());
        southPanel.add(calculateBtn, BorderLayout.NORTH);
        southPanel.add(billPanel, BorderLayout.SOUTH);

        add(southPanel, BorderLayout.SOUTH);
    }

    private void calculateBill() {
        double fare = acButton.isSelected() ? AC_FARE : NON_AC_FARE;
        double totalFare = 0;

        try {
            for (int i = 0; i < 3; i++) {
                String name = nameFields[i].getText().trim();
                String ageText = ageFields[i].getText().trim();

                if (name.isEmpty() || ageText.isEmpty()) {
                    // Ignore empty passenger inputs (can be less than 3 passengers)
                    continue;
                }

                int age = Integer.parseInt(ageText);

                double passengerFare = fare;
                if (age < 5 || age > 60) {
                    passengerFare = fare / 2; // half fare for child or senior citizen
                }

                totalFare += passengerFare;
            }

            // Apply 4% service charge
            double serviceCharge = totalFare * 0.04;
            double finalAmount = totalFare + serviceCharge;

            billField.setText(String.format("%.2f", finalAmount));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numeric ages.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ReservationForm().setVisible(true);
        });
    }
}
