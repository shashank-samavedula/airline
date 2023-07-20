package airline.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

public class Payment_Details extends JFrame{ //Fifth

    JTextField textField;
    JTable table;
    JLabel Sector;
    JLabel FlightCode, Capacity, Classcode, Classname, label;

    public static void main(String[] args) {
        new Payment_Details();
    }

    public Payment_Details(){
    initialize();
    }

    private void initialize(){
        setTitle("PAYMENT DETAILS");
    getContentPane().setBackground(Color.WHITE);
    setSize(860,486);
    setLayout(null);
       
    JLabel Fcode = new JLabel("PNR NO");
    Fcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
    Fcode.setBounds(60, 160, 150, 26);
    add(Fcode);
       
    textField = new JTextField();
    textField.setBounds(200, 160, 150, 26);
    add(textField);
   
        table = new JTable();
    table.setBounds(45, 329, 766, 87);
    add(table);
       
    JButton Show = new JButton("SHOW");
    Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Show.setBackground(Color.BLACK);
        Show.setForeground(Color.WHITE);
    Show.setBounds(200, 210, 150, 26);
    add(Show);
       
    Sector = new JLabel("PAYMENT");
    Sector.setForeground(Color.BLUE);
    Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
    Sector.setBounds(51, 17, 300, 39);
    add(Sector);
       
    FlightCode = new JLabel("PNR NO");
    FlightCode.setFont(new Font("Tahoma", Font.PLAIN, 13));
    FlightCode.setBounds(84, 292, 108, 26);
    add(FlightCode);
       
    Capacity = new JLabel("PAID_AMOUNT");
    Capacity.setFont(new Font("Tahoma", Font.PLAIN, 13));
    Capacity.setBounds(183, 298, 92, 14);
    add(Capacity);
   
       
    label = new JLabel("");
    label.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/payment.png")));
    label.setBounds(425, 15, 239, 272);
    add(label);
       
    
       
    
   
        setVisible(true);
       
    Show.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
       
                try {
                    String code  = textField.getText();
                   
                    conn c = new conn();
                    String str = "select pnr_no,paid_amt from payment where pnr_no = '"+code+"'";
                   
                    ResultSet rs = c.s.executeQuery(str);
       
                    table.setModel(DbUtils.resultSetToTableModel(rs));
                   
        }catch(SQLException e) {
                    e.printStackTrace();
                }
            }
    });
       
    setSize(960,590);
        setLocation(400,200);
    setVisible(true);

    }
}
