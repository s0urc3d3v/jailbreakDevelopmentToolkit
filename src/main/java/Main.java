import util.mPrefs;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        mPrefs prefs = new mPrefs();

        makeFileModel makeFileObj = new makeFileModel();
        try {
            makeFileObj.readMakeFileByLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mainFrame frame = new mainFrame();
        mainFrame.main(null);

        
    }
}
