package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.prefs.Preferences;

public class prefs {
    //loaded a runtime with constants
    private static double VERSION_NUMBER = -1; //-1 is not yet init
    private final String PREFS_FILE = "resources/preferances.tsv";
    private static FileWriter writer;
    private static BufferedReader reader;
    private static HashMap<String, String> PREFERENCE_DICTIONARY;
    public prefs() {
        PREFERENCE_DICTIONARY = new HashMap<>();

        try {
            writer = new FileWriter(PREFS_FILE, true);
        } catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

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

    public static double getVERSION_NUMBER() {
        double VERSION_NUMBER = (Double.valueOf(PREFERENCE_DICTIONARY.get("version")
        return (VERSION_NUMBER != null) ? (VERSION_NUMBER) : (-1);

    }
}
