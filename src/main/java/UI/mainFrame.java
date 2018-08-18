package UI;

import util.mPrefs;

import javax.swing.*;

public class mainFrame { //lol
    mPrefs prefs;
    JFrame frame;
    JPanel panel;

    public void init() {
        prefs = new mPrefs();

        frame = new JFrame("Toolkit, version " + prefs.getVERSION_NUMBER());
        panel = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
