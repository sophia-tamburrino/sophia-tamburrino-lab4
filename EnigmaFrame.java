import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnigmaFrame {
    //the JFrame to work on
    JFrame j = new JFrame();

    public EnigmaFrame(){
        //creating the 
        Integer[] units = { 1, 2, 3, 4, 5};
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

        //setting up the input box
        JLabel inputTxt = new JLabel("Input ");
        JTextArea inputArea = new JTextArea(); //wanna setText()
        inputArea.setPreferredSize(new Dimension(400, 50));

        JPanel centerInput = new JPanel();
        centerInput.setLayout(new BorderLayout());

        centerInput.add(inputTxt, BorderLayout.WEST);
        centerInput.add(inputArea, BorderLayout.EAST);

        j.add(centerInput, BorderLayout.CENTER);

        //setting up the output box
        JLabel outputTxt = new JLabel("Output ");
        JTextArea outputArea = new JTextArea(); //wanna setText()
        outputArea.setPreferredSize(new Dimension(400, 50));

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new BorderLayout());

        southPanel.add(outputTxt, BorderLayout.WEST);
        southPanel.add(outputArea, BorderLayout.EAST);

        j.add(southPanel, BorderLayout.SOUTH);

        j.setPreferredSize(new Dimension(600, 215));
        //now adding actionlisteners
        encrypt.addActionListener(new ActionListener() {
                //if encrypt, make enigma and encrypt
                public void actionPerformed(ActionEvent e) {
                    // System.out.println(innerUnit.getSelectedIndex());
                    // System.out.println(middleUnit.getSelectedIndex());
                    // System.out.println(outerUnit.getSelectedIndex());
                    Enigma one = new Enigma(units[innerUnit.getSelectedIndex()], units[middleUnit.getSelectedIndex()], units[outerUnit.getSelectedIndex()], inVal.getText());
                    outputArea.setText(one.encrypt(inputArea.getText()));
                    //System.out.println(outputArea.getText());
                }
            });

        decrypt.addActionListener(new ActionListener() {
            //if decrypt, make enigma and decrypt
            public void actionPerformed(ActionEvent e) {
                Enigma two = new Enigma(units[innerUnit.getSelectedIndex()], units[middleUnit.getSelectedIndex()], units[outerUnit.getSelectedIndex()], inVal.getText());
                outputArea.setText(two.decrypt(inputArea.getText()));
            }
        });
    }
    
    public JFrame getJFrame() {
        return this.j;
    }
    
}
