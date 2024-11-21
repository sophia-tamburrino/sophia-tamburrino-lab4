import javax.swing.*;

public class EnigmaGUI {
    public static void main(String args[]) {
        EnigmaFrame frame = new EnigmaFrame();
        JFrame j = frame.getJFrame();
        j.pack(); // do alignment within the layout
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }
}