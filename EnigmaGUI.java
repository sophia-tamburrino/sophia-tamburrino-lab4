import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class EnigmaGUI {
    public static void main(String args[]) {
        Integer[] units = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
                26, 27 };
        JLabel inner = new JLabel("Inner");
        JComboBox<Integer> innerUnit = new JComboBox<Integer>(units);
        JLabel middle = new JLabel("Middle");
        JComboBox<Integer> middleUnit = new JComboBox<Integer>(units);
        JLabel outer = new JLabel("Out");
        JComboBox<Integer> outerUnit = new JComboBox<Integer>(units);

        //might turn f into a jpanel and add it all to the north of a jframe
        JPanel leftNorth = new JPanel();

        // This all sets up the rotor numbers
        JPanel panelOne = new JPanel();
        panelOne.setLayout(new BorderLayout());

        panelOne.add(inner, BorderLayout.WEST);
        panelOne.add(innerUnit, BorderLayout.CENTER);
        panelOne.add(middle, BorderLayout.EAST);
        leftNorth.add(panelOne, BorderLayout.WEST);

        JPanel panelTwo = new JPanel();
        panelTwo.setLayout(new BorderLayout());

        panelTwo.add(middleUnit, BorderLayout.WEST);
        panelTwo.add(outer, BorderLayout.CENTER);
        panelTwo.add(outerUnit, BorderLayout.EAST);
        leftNorth.add(panelTwo, BorderLayout.CENTER);

        // This will set up the Initial Positions
        JLabel initialPos = new JLabel("Initial Positions");
        JTextField inVal = new JTextField("1.0", 10);;

        JPanel panelThree = new JPanel();
        panelThree.setLayout(new BorderLayout());
        panelThree.add(initialPos, BorderLayout.WEST);
        panelThree.add(inVal, BorderLayout.EAST);
        leftNorth.add(panelThree, BorderLayout.EAST);

        // This will be encrypt/decrypt buttons
        JButton encrypt = new JButton("Encrypt");
        JButton decrypt = new JButton("Decrypt");
        
        JPanel panelFour = new JPanel();
        panelFour.setLayout(new BorderLayout());
        panelFour.add(encrypt, BorderLayout.EAST);
        panelFour.add(decrypt, BorderLayout.WEST);

        JPanel rightNorth = new JPanel();
        rightNorth.add(panelFour, BorderLayout.CENTER);

        JPanel fullNorth = new JPanel();
        fullNorth.setLayout(new BorderLayout());
        fullNorth.add(leftNorth, BorderLayout.WEST);
        fullNorth.add(rightNorth, BorderLayout.EAST);

        JFrame j = new JFrame();
        j.add(fullNorth, BorderLayout.NORTH);
        

        j.pack(); // do alignment within the layout
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}