package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class mPrefs {
    //loaded a runtime with constants
    private double VERSION_NUMBER = -1; //-1 is not yet init
    private final String PREFS_FILE = "preferences.tsv";
    private  FileWriter writer;
    private  BufferedReader reader;
    private  HashMap<String, String> PREFERENCE_DICTIONARY;
    public mPrefs() {
        PREFERENCE_DICTIONARY = new HashMap<>();
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
                String regexArray[] = ln.split("\t");
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
}
