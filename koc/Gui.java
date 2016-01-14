package koc;

/**
 * Created by master on 14.01.2016.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JApplet {
    // Text fields for Number 1, Number 2, and Result
    private JTextField j_welcome_text, j_name_request, jtfResult;

    // Buttons "Add"
    private JButton jbtAdd, jknight, jwarrior, jninja, jmage, jhunter;

    // Main method
    public static void main() {
        // Create a frame
        JFrame frame = new JFrame("Knights of Cydonia");

        // Create an instance of the applet
        Gui applet = new Gui();

        // Add the applet instance to the frame
        frame.add(applet, BorderLayout.CENTER);

        // Invoke init() and start()
        applet.init();
        applet.start();

        // Display the frame
        frame.pack();
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    // Default Constructor
    public Gui() {
        // Panel p1 to hold text fields and labels
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Welcome to Knights of Cydonia!"));
        JPanel p2 = new JPanel();
        p2.add(new JLabel("Name"));
        p2.add(j_name_request = new JTextField(10));

        j_name_request.setHorizontalAlignment(SwingConstants.RIGHT);

        // Panel p3 to hold buttons
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        p3.add(jhunter = new JButton("Hunter"));
        // Set mnemonic keys
        jhunter.setMnemonic('H');

        p3.add(jknight = new JButton("Knight"));
        // Set mnemonic keys
        jknight.setMnemonic('K');

        p3.add(jninja = new JButton("Ninja"));
        // Set mnemonic keys
        jninja.setMnemonic('N');

        p3.add(jmage = new JButton("Mage"));
        // Set mnemonic keys
        jmage.setMnemonic('M');

        p3.add(jwarrior = new JButton("Warrior"));
        // Set mnemonic keys
        jwarrior.setMnemonic('W');

        // Add panels to the frame
        setLayout(new BorderLayout());
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        // Register listeners
        jknight.addActionListener(new Listener_knight());
        jhunter.addActionListener(new Listener_hunter());
        jninja.addActionListener(new Listener_ninja());
        jmage.addActionListener(new Listener_mage());
        jwarrior.addActionListener(new Listener_warior());
    }

    class Listener_hunter implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {


            String player_name = j_name_request.getText().trim();
            System.out.println(player_name);


        }
    }


    class Listener_knight implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {


            String player_name = j_name_request.getText().trim();
            System.out.println(player_name);


        }
    }

    class Listener_ninja implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {


            String player_name = j_name_request.getText().trim();
            System.out.println(player_name);


        }
    }

    class Listener_mage implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {


            String player_name = j_name_request.getText().trim();
            System.out.println(player_name);


        }
    }


    class Listener_warior implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {


            String player_name = j_name_request.getText().trim();
            System.out.println(player_name);


        }
    }
}
