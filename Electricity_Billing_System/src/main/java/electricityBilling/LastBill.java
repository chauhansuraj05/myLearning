package electricityBilling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class LastBill extends JFrame implements ActionListener {

    JLabel l1;
    JTextArea t1;
    JButton b1;
    Choice c1;
    JPanel p1;

    LastBill() {

        setSize(500, 900);
        setLayout(new BorderLayout(10, 10));

        p1 = new JPanel();
        l1 = new JLabel("Last Bill Details");

        /* 🔹 METER NUMBERS LOADED FROM DATABASE */
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

        t1 = new JTextArea(50, 15);
        t1.setFont(new Font("Senserif", Font.ITALIC, 18));
        t1.setEditable(false);

        JScrollPane jsp = new JScrollPane(t1);

        b1 = new JButton("Generate Bill");

        p1.add(l1);
        p1.add(c1);

        add(p1, BorderLayout.NORTH);
        add(jsp, BorderLayout.CENTER);
        add(b1, BorderLayout.SOUTH);

        b1.addActionListener(this);
        setLocation(350, 40);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            conn c = new conn();
            String meter = c1.getSelectedItem();

            t1.setText("");

            /* -------- CUSTOMER DETAILS -------- */
            PreparedStatement ps1 =
                c.c.prepareStatement(
                    "SELECT * FROM emp WHERE meter_number = ?"
                );
            ps1.setString(1, meter);

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                t1.append("\nCustomer Name : " + rs.getString("name"));
                t1.append("\nMeter Number  : " + rs.getString("meter_number"));
                t1.append("\nAddress       : " + rs.getString("address"));
                t1.append("\nState         : " + rs.getString("state"));
                t1.append("\nCity          : " + rs.getString("city"));
                t1.append("\nEmail         : " + rs.getString("email"));
                t1.append("\nPhone         : " + rs.getString("phone"));
                t1.append("\n-------------------------------------\n");
            }

            /* -------- BILL HISTORY -------- */
         // Fetch customer details using meter number
            t1.append("\nDetails of the Last Bills\n\n");

            PreparedStatement ps2 =
                c.c.prepareStatement(
                    "SELECT month, amount, bill_date FROM bill WHERE meter_number = ?"
                );
            ps2.setString(1, meter);

            rs = ps2.executeQuery();

            boolean found = false;
            while (rs.next()) {
                found = true;
                t1.append(
                    rs.getString("month") + "  |  ₹" +
                    rs.getString("amount") +
                    "  |  " + rs.getDate("bill_date") + "\n"
                );
            }

            if (!found) {
                t1.append("\nNo bill history available.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new LastBill().setVisible(true);
    }
}
