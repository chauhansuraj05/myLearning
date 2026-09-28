package electricityBilling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class calculate_bill extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;
    JTextField t1;
    Choice c1, c2;
    JButton b1, b2;
    JPanel p;

    calculate_bill() {

        p = new JPanel();
        p.setLayout(new GridLayout(4, 2, 30, 30));
        p.setBackground(Color.WHITE);

        l1 = new JLabel("Calculate Electricity Bill");
        l2 = new JLabel("Meter No");
        l3 = new JLabel("Units Consumed");
        l5 = new JLabel("Month");

        t1 = new JTextField();

        /* 🔹 METER NUMBER (LOAD FROM DB) */
        c1 = new Choice();
        try {
            conn c = new conn();
            PreparedStatement ps =
                c.c.prepareStatement("SELECT meter_number FROM emp");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c1.add(rs.getString("meter_number"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /* 🔹 MONTH CHOICE */
        c2 = new Choice();
        c2.add("January");
        c2.add("February");
        c2.add("March");
        c2.add("April");
        c2.add("May");
        c2.add("June");
        c2.add("July");
        c2.add("August");
        c2.add("September");
        c2.add("October");
        c2.add("November");
        c2.add("December");

        b1 = new JButton("Submit");
        b2 = new JButton("Cancel");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);

        ImageIcon i1 =
            new ImageIcon(ClassLoader.getSystemResource("images/hicon2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(180, 270, Image.SCALE_DEFAULT);
        l4 = new JLabel(new ImageIcon(i2));

        l1.setFont(new Font("Senserif", Font.PLAIN, 26));
        l1.setHorizontalAlignment(JLabel.CENTER);

        p.add(l2);
        p.add(c1);
        p.add(l5);
        p.add(c2);
        p.add(l3);
        p.add(t1);
        p.add(b1);
        p.add(b2);

        setLayout(new BorderLayout(30, 30));
        add(l1, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
        add(l4, BorderLayout.WEST);

        b1.addActionListener(this);
        b2.addActionListener(this);

        getContentPane().setBackground(Color.WHITE);
        setSize(650, 500);
        setLocation(350, 220);
    }

    public void actionPerformed(ActionEvent ae) {

        /* 🔹 CANCEL BUTTON */
        if (ae.getSource() == b2) {
            setVisible(false);
            return;
        }

        /* 🔹 EMPTY UNITS VALIDATION (ADDED) */
        if (t1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Units cannot be empty");
            return;
        }

        try {
            String meter = c1.getSelectedItem();
            String month = c2.getSelectedItem();
            int units = Integer.parseInt(t1.getText().trim());

            /* 🔹 BILL CALCULATION LOGIC */
            int energyCharge = units * 7;
            int totalAmount = energyCharge + 50 + 12 + 102 + 20 + 50;

            conn c = new conn();

            /* 🔹 INSERT BILL WITH DATE */
            PreparedStatement ps =
                c.c.prepareStatement(
                    "INSERT INTO bill (meter_number, month, units, amount, bill_date) " +
                    "VALUES (?, ?, ?, ?, CURRENT_DATE)"
                );

            ps.setString(1, meter);
            ps.setString(2, month);
            ps.setInt(3, units);
            ps.setInt(4, totalAmount);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "Bill Calculated & Stored");

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "Enter valid numeric units");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new calculate_bill().setVisible(true);
    }
}
