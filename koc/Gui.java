package koc;

/**
 * Created by master on 14.01.2016.
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Gui extends JApplet {
    // Text fields for Number 1, Number 2, and Result
    private JTextField jtfNum1, jtfNum2, jtfResult;

    // Buttons "Add"
    private JButton jbtAdd;

    // Main method
    public static void main() {
        // Create a frame
        JFrame frame = new JFrame("Test");

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
        p1.add(new JLabel("Number 1"));
        p1.add(jtfNum1 = new JTextField(3));
        p1.add(new JLabel("Number 2"));
        p1.add(jtfNum2 = new JTextField(3));
        p1.add(new JLabel("Result"));
        p1.add(jtfResult = new JTextField(8));
        jtfResult.setEditable(false);
        jtfResult.setHorizontalAlignment(SwingConstants.RIGHT);

        // Panel p2 to hold buttons
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(jbtAdd = new JButton("Add"));

        // Set mnemonic keys
        jbtAdd.setMnemonic('A');

        // Add panels to the frame
        setLayout(new BorderLayout());
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);

        // Register listeners
        jbtAdd.addActionListener(new Listener());
    }

    class Listener implements ActionListener {
        // Handle ActionEvent from buttons
        public void actionPerformed(ActionEvent e) {
            // Obtain Number 1 and Number 2
            int num1 = Integer.parseInt(jtfNum1.getText().trim());
            int num2 = Integer.parseInt(jtfNum2.getText().trim());
            int result = num1 + num2;
            // Set result in jtfResult
            jtfResult.setText(String.valueOf(result));
        }
    }
}
