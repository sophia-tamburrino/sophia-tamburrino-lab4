import javax.swing.*;

public class EnigmaGUI {
    public static void main(String args[]) {
        //basic jframe creation
        EnigmaFrame frame = new EnigmaFrame();
        JFrame j = frame.getJFrame();
        j.pack(); 
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true); 
    }
}