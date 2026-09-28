package electricityBilling;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class generate_bill extends JFrame implements ActionListener {

    JLabel l1;
    JTextArea t1;
    JButton b1;
    Choice c1, c2;
    JPanel p1;

    generate_bill() {
        setSize(500, 900);
        setLayout(new BorderLayout(10, 10));

        p1 = new JPanel();
        l1 = new JLabel("Generate Bill");

        c1 = new Choice();
        c2 = new Choice();

        /* 🔹 LOAD METER NUMBERS FROM DATABASE (IMPORTANT FIX) */
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

        /* Months */
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

        t1 = new JTextArea(50, 15);
        t1.setFont(new Font("Senserif", Font.ITALIC, 18));
        t1.setEditable(false);

        JScrollPane jsp = new JScrollPane(t1);
        b1 = new JButton("Generate Bill");

        p1.add(l1);
        p1.add(c1);
        p1.add(c2);

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
            String month = c2.getSelectedItem();

            t1.setText("\tSmart Power Utility\n\n");
            t1.append("ELECTRICITY BILL FOR THE MONTH OF " + month + " ,2025\n\n");

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
                t1.append("\n---------------------------------------------\n");
            }

            /* -------- TAX DETAILS -------- */
            Statement st = c.c.createStatement();
            rs = st.executeQuery("SELECT * FROM tax");

            if (rs.next()) {
                t1.append("\nMeter Location : " + rs.getString("meter_location"));
                t1.append("\nMeter Type     : " + rs.getString("meter_type"));
                t1.append("\nPhase Code     : " + rs.getString("phase_code"));
                t1.append("\nBill Type      : " + rs.getString("bill_type"));
                t1.append("\nDays           : " + rs.getString("days"));
                t1.append("\n---------------------------------------------\n");
            }

            /* -------- BILL DETAILS -------- */
         // Fetch bill details for selected month
         // Fetch customer details using meter number
            PreparedStatement ps2 =
                c.c.prepareStatement(
                    "SELECT * FROM bill WHERE meter_number = ? AND month = ?"
                );
            ps2.setString(1, meter);
            ps2.setString(2, month);

            rs = ps2.executeQuery();

            if (rs.next()) {
                t1.append("\nBill Date      : " + rs.getDate("bill_date"));
                t1.append("\nUnits Consumed : " + rs.getString("units"));
                t1.append("\nTotal Charges  : " + rs.getString("amount"));
                t1.append("\n---------------------------------------------");
                t1.append("\nTOTAL PAYABLE  : " + rs.getString("amount"));
            } else {
                t1.append(
                    "\n\n⚠ Bill not calculated for this month.\n" +
                    "Please calculate bill first."
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new generate_bill().setVisible(true);
    }
}
