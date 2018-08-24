package util;

import java.io.*;
import java.util.HashMap;

public class mPrefs {
    //loaded a runtime with constants
    private double VERSION_NUMBER = -1; //-1 is not yet init
    private File PREFS_FILE;
    private  FileWriter writer;
    private  BufferedReader reader;
    private  HashMap<String, String> PREFERENCE_DICTIONARY;
    public mPrefs() {
        PREFERENCE_DICTIONARY = new HashMap<>();

        PREFS_FILE = new File("prefs.csv");

        if (!PREFS_FILE.exists()) {
            try {
                PREFS_FILE.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        try {
            writer = new FileWriter(PREFS_FILE, true);
        } catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }
        /*
        This try/catch block is not working right and I am not going to fix it now
         */
        try{
            reader = new BufferedReader(new FileReader(PREFS_FILE));
            String ln = "";
            while ((ln = reader.readLine()) != null){
                ln = ln.replaceAll("\\s", "");
                String regexArray[] = ln.split(",");
                PREFERENCE_DICTIONARY.put(regexArray[0], regexArray[1]);
            }
        } catch (IOException ioe){
            ioe.getMessage();
        }
    }

    public double getVERSION_NUMBER() {
        if (PREFERENCE_DICTIONARY.containsKey("version"))
            return Double.valueOf(PREFERENCE_DICTIONARY.get("version"));

        else return -2;
    }
    public Object getPreference(String key){ //generic method, we will see if this is good or terriable in time
        return (PREFERENCE_DICTIONARY.get(key));
    }
}
