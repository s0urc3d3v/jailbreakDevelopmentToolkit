package UI;

import javax.swing.*;

public class mainFrame { //lol
    JFrame frame = new JFrame("Toolkit, version " + util.prefs.getVERSION_NUMBER());
    JPanel panel = new JPanel();

    private void init() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
