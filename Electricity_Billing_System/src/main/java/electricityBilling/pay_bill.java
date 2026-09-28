package electricityBilling;

import java.awt.*;
import java.awt.event.*;
import java.net.URI;
import javax.swing.*;
import java.sql.*;

public class pay_bill extends JFrame implements ActionListener {

    Choice c1;
    JButton payBtn, openBtn;

    public pay_bill() {

        setTitle("Pay Electricity Bill");
        setSize(400, 200);
        setLayout(new GridLayout(3, 1, 10, 10));
        setLocation(500, 300);

        JLabel l1 = new JLabel("Select Meter Number", JLabel.CENTER);

        /* 🔹 LOAD METER NUMBERS FROM DB */
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

        openBtn = new JButton("Open Paytm");
        payBtn = new JButton("Mark Bill as PAID");

        openBtn.addActionListener(this);
        payBtn.addActionListener(this);

        add(l1);
        add(c1);
        add(openBtn);
        add(payBtn);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        /* 🔹 OPEN PAYTM WEBSITE */
        if (ae.getSource() == openBtn) {
            try {
                Desktop.getDesktop().browse(
                    new URI("https://paytm.com/electricity-bill-payment")
                );
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Unable to open browser");
            }
        }

        /* 🔹 MARK BILL AS PAID (SIMULATED PAYMENT) */
        if (ae.getSource() == payBtn) {
            try {
                conn c = new conn();

                PreparedStatement ps =
                    c.c.prepareStatement(
                        "UPDATE bill SET payment_status='PAID' WHERE meter_number=?"
                    );

                ps.setString(1, c1.getSelectedItem());
                int updated = ps.executeUpdate();

                if (updated > 0) {
                    JOptionPane.showMessageDialog(
                        null, "Payment Successful! Bill marked as PAID"
                    );
                } else {
                    JOptionPane.showMessageDialog(
                        null, "No bill found for this meter"
                    );
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new pay_bill();
    }
}
