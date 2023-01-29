package AdapterTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

public class FileProperties implements FileIo {

    Properties prop;

    public FileProperties() {
        this.prop = new Properties();
    }

    @Override
    public void readFromeFile(String filename) throws IOException {
        prop.load(new InputStreamReader(
                new FileInputStream(System.getProperty("user.dir") + "/AdapterTest/" + filename)));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        prop.store(new FileOutputStream(System.getProperty("user.dir") + "/AdapterTest/" + filename, false),
                "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {

        return (String) prop.get(key);
    }

}
