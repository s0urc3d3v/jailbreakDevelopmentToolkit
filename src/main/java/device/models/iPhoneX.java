package device.models;

import util.mPrefs;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;

public class iPhoneX extends device.iPhone implements deviceInterface.basicDeviceInterface {
    util.mPrefs prefs;

    public iPhoneX (){
        prefs = new mPrefs();
    }
    @Override
    public boolean respring() {
        //requires SSH to be configured in advance
        ProcessBuilder respringDeviceProcessBuilder = new ProcessBuilder("respring.sh", String.valueOf(getIP()));
        try {
            Process respringProcess = respringDeviceProcessBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public int getIP() { //-1 is an error
        return (prefs.getPreference("ip")!= null) ? (int) prefs.getPreference("ip") : (-1);

    }

    @Override
    public boolean pushFileToPath(File f, String path) {
        return false;
    }

    @Override
    public FileSystem getFileSystem() {
        return null;
    }

    @Override
    public String getIosVersionNumber() {
        return null;
    }

    @Override
    public boolean isSubstrateSupported() { //Assuming true for the time being
        return true;
    }

    @Override
    public boolean hasRoot() { //Assuming true for the time being
        return true;
    }

    @Override
    public boolean accessable() {
        return true; //Assuming true for the time being
    }
}
