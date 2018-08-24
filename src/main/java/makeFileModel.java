import util.mPrefs;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;

public class makeFileModel {
    private ArrayList<String> MakefileLines;
    public HashMap<String, String> properties;
    public HashMap<String, File> includes;
    public HashMap<String, ArrayList<String>> procedures;
    private mPrefs prefs;

    public makeFileModel(){
        prefs = new mPrefs();
        try {
            MakefileLines = readMakeFileByLine();
        } catch (IOException e) {
            placeholderImplementationOfGenericErrorInterfaceForDebugging place = new placeholderImplementationOfGenericErrorInterfaceForDebugging();
            place.setErrorData(e.toString());
            place.displayErrorMsgToUser("error");
        }
    }

    private void setProperties(){

    }

    private void setIncludes(){

    }

    private void setProcedures(){

    }

    public ArrayList<String> readMakeFileByLine() throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        String makeFilePath = "";
        if (prefs.getPreference("projectDirectory") != null) {
            makeFilePath = prefs.getPreference("projectDirectory") + "/Makefile";
        }
        else {
            placeholderImplementationOfGenericErrorInterfaceForDebugging errorInterfaceForDebugging = new placeholderImplementationOfGenericErrorInterfaceForDebugging();
            errorInterfaceForDebugging.displayErrorMsgToUser("Failed to retrieve Makefile: no project directory set");
            System.exit(0);
        }
        BufferedReader reader = new BufferedReader(new FileReader(makeFilePath));
        String ln;
        while ((ln = reader.readLine()) != null){
            lines.add(ln);
        }
        return lines;
    }

}
