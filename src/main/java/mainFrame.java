import util.mPrefs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class mainFrame {
    private JButton makeInstallButton;
    private JButton repringButton;
    private JButton ReloadProjectButton;
    private JButton reloadMakefileButton;
    private JButton makePackageInstallButton;
    private JPanel topLevelPanel;
    private mPrefs prefs;

    public mainFrame() {
        makeInstallButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prefs = new mPrefs();
                ProcessBuilder makeInstallProcessBuilder = new ProcessBuilder("make install");
                makeInstallProcessBuilder.directory(new File((String) prefs.getPreference("projectDirectory")));
                try {
                    makeInstallProcessBuilder.start();
                } catch (IOException e1) {
                    e1.toString();

                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainFrame");
        frame.setContentPane(new mainFrame().topLevelPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}


