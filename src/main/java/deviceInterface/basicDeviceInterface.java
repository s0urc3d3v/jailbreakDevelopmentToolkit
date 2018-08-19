package deviceInterface;

import java.io.File;
import java.nio.file.FileSystem;

public interface basicDeviceInterface {
    public boolean respring(); //returns true if device respringed
    public int getIP();
    public boolean pushFileToPath(File f, String path);
    public FileSystem getFileSystem();
    public String getIosVersionNumber();
    public boolean isSubstrateSupported();
    public boolean hasRoot();
    public boolean accessable();
}
