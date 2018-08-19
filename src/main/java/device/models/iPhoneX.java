package device.models;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;

public class iPhoneX extends device.iPhone implements deviceInterface.basicDeviceInterface {

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
    public int getIP() {
        return 0;
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
    public String getVersionNumber() {
        return null;
    }

    @Override
    public boolean isSubstrateSupported() {
        return false;
    }

    @Override
    public boolean hasRoot() {
        return false;
    }

    @Override
    public boolean accessable() {
        return false;
    }
}
