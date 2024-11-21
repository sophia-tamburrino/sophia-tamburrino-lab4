import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class EnigmaFrame {
    //the JFrame to work on
    JFrame j = new JFrame();

    public EnigmaFrame(){
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
        JTextField inVal = new JTextField("", 10);;

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
        panelFour.add(encrypt, BorderLayout.WEST);
        panelFour.add(decrypt, BorderLayout.EAST);

        JPanel rightNorth = new JPanel();
        rightNorth.add(panelFour, BorderLayout.CENTER);
        
        //Setting it all to the north
        JPanel fullNorth = new JPanel();
        fullNorth.setLayout(new BorderLayout());
        fullNorth.add(leftNorth, BorderLayout.WEST);
        fullNorth.add(rightNorth, BorderLayout.EAST);

        j.add(fullNorth, BorderLayout.NORTH);
    }
    
    public JFrame getJFrame() {
        return this.j;
    }
    
}
