package GuiMenuBar;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu bike;
    JMenu rental;
    JMenu admin;
    JMenuItem bikeItem1;
    JMenuItem bikeItem2;
    JMenuItem bikeItem3;
    JMenuItem rentalItem1;
    JMenuItem rentalItem2;
    JMenuItem rentalItem3;
    JMenuItem adminItem1;
    JMenuItem adminItem2;

    JPanel panel1 = new JPanel();
    JLabel label1 = new JLabel();

    public MyFrame(){

        super(" Tralee Bike Rentals ");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(500,500);
        //puts the gui to the center of the screen.
        this.setLocationRelativeTo(null);
        //centers the image.
        this.setLayout(new GridBagLayout());


        //Icon Image top left of gui
        setIconImage(new ImageIcon("./src/bikeImage.png").getImage());

        // main bike image
        label1.setIcon(new ImageIcon("./src/bikeImage.png"));
        panel1.add(label1);
        add(panel1);

         menuBar = new JMenuBar();

         bike = new JMenu("Bikes");
         bike.setMnemonic(KeyEvent.VK_B); // ALT B shortcut for bikes

         rental = new JMenu("Rentals");
         rental.setMnemonic(KeyEvent.VK_R);// ALT R shortcut for rentals

         admin = new JMenu("Admin");
         admin.setMnemonic(KeyEvent.VK_A); // ALT A shortcut for admin


        bikeItem1 = new JMenuItem("Amend");
        bikeItem1.setMnemonic(KeyEvent.VK_A); //A shortcut for Amend a bike
        bikeItem2 = new JMenuItem("Add");
        bikeItem2.setMnemonic(KeyEvent.VK_D);// B shortcut for Add bike
        bikeItem3 = new JMenuItem("Remove");
        bikeItem3.setMnemonic(KeyEvent.VK_R);// R shortcut for Remove

        bikeItem1.addActionListener(this);
        bikeItem2.addActionListener(this);
        bikeItem3.addActionListener(this);

        bike.add(bikeItem1);
        bike.add(bikeItem2);
        bike.add(bikeItem3);

        rentalItem1 = new JMenuItem("Rent Bike");
        rentalItem1.setMnemonic(KeyEvent.VK_R); //R shortcut for Rent bike
        rentalItem2 = new JMenuItem("Return Bike");
        rentalItem2.setMnemonic(KeyEvent.VK_T); //T shortcut for return bike
        rentalItem3 = new JMenuItem("Cancel Rental");
        rentalItem3.setMnemonic(KeyEvent.VK_C); //C shortcut for cancel rental

        rentalItem1.addActionListener(this);
        rentalItem2.addActionListener(this);
        rentalItem3.addActionListener(this);

        rental.add(rentalItem1);
        rental.add(rentalItem2);
        rental.add(rentalItem3);

        adminItem1 = new JMenuItem("List Yearly Revenue");
        adminItem1.setMnemonic(KeyEvent.VK_L); //R shortcut for Rent bike
        adminItem2= new JMenuItem("Analyse Revenue");
        adminItem2.setMnemonic(KeyEvent.VK_L); //R shortcut for Rent bike

        admin.add(adminItem1);
        admin.add(adminItem2);

        menuBar.add(bike);
        menuBar.add(rental);
        menuBar.add(admin);
        menuBar.setBackground(new Color(50,75,255));

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== bikeItem1){
            System.out.println("Bike amended");
        }

        if(e.getSource()== bikeItem2){
            System.out.println("Bike added");
        }
        if(e.getSource()== bikeItem3){
            System.out.println("Bike Removed");
        }

        if(e.getSource()== rentalItem1){
            System.out.println("Bike Rented");
        }
        if(e.getSource()== rentalItem2){
            System.out.println("Bike returned");
        }
        if(e.getSource()== rentalItem3){
            System.out.println("Rental Cancelled");
        }
        if(e.getSource()== adminItem1){
            System.out.println("You did well this year");
        }

        if(e.getSource()== adminItem2){
            System.out.println("Well done you made a million");
        }


    }
}