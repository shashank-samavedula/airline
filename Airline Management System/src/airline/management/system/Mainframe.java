package airline.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Mainframe extends JFrame{

    public static void main(String[] args) {
        new Mainframe().setVisible(true);
    }
   
    public Mainframe() {
        super("AIRLINE RESERVATION MANAGEMENT SYSTEM");
        initialize();
    }

   
    private void initialize() {
   
        setForeground(Color.CYAN);
        setLayout(null);

        JLabel NewLabel = new JLabel("");
    NewLabel.setIcon(new ImageIcon(ClassLoader.getSystemResource("airline/management/system/icon/front.jpg")));
    NewLabel.setBounds(0, 0, 1920, 990);
    add(NewLabel);
       
        JLabel AirlineManagementSystem = new JLabel("WELCOME TO AIRLINE RESERVATION");
    AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 36));
    AirlineManagementSystem.setBounds(700, 60, 1000, 55);
    NewLabel.add(AirlineManagementSystem);
       
       
        JMenuBar menuBar = new JMenuBar();
    setJMenuBar(menuBar);
       
        JMenu AirlineSystem = new JMenu("Menu");
        AirlineSystem.setForeground(Color.BLUE);
    menuBar.add(AirlineSystem);
       
        JMenuItem FlightDetails = new JMenuItem("Flight Search by Code");
    AirlineSystem.add(FlightDetails);
       
    JMenuItem ReservationDetails = new JMenuItem("Book Ticket");
    AirlineSystem.add(ReservationDetails);
       
    JMenuItem PassengerDetails = new JMenuItem("Flight Search by Place");
    AirlineSystem.add(PassengerDetails);
       
    JMenuItem SectorDetails_1 = new JMenuItem("Payment Details");
    AirlineSystem.add(SectorDetails_1);
       
    JMenuItem Cancellation = new JMenuItem("Cancel Ticket");
    AirlineSystem.add(Cancellation);
       
    JMenu Ticket = new JMenu("About");
        Ticket.setForeground(Color.RED);
    menuBar.add(Ticket);
       
    JMenu List = new JMenu("Logout");
        List.setForeground(Color.BLUE);
    menuBar.add(List);
       
   
    Ticket.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    JOptionPane.showMessageDialog(null,"This is a Flight Reservation Application developed using Java");
                }
            });
    
    List.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent ae)
                {
                    System.exit(0);
                }
            });
    
    
       
       
    FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_Info();
            }
    });
       
    ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Add_Customer();
        } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
       
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Journey_Details();
                } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
       
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new Payment_Details();
        } catch (Exception e) {
                    e.printStackTrace();
        }
            }
    });
       
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
    });
       
        setSize(1950,1090);
    setVisible(true);
    }
}
