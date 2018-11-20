import util.mPrefs;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        UI.mainUI ui = new UI.mainUI();
        ui.startUI();
        mPrefs prefs = new mPrefs();

        makeFileModel makeFileObj = new makeFileModel();
        try {
            makeFileObj.readMakeFileByLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        
    }
}
