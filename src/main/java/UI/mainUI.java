package UI;

import javax.swing.*;

public class mainUI {
    public void startUI() {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.add(panel);
    }

}
