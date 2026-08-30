package AdapterTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

public class FileProperties implements FileIo {

    private final Properties prop;
    private final Path baseDirectory;

    public FileProperties(Path baseDirectory) {
        this.prop = new Properties();
        this.baseDirectory = baseDirectory.toAbsolutePath().normalize();
    }

    @Override
    public void readFromeFile(String filename) throws IOException {
        Path path = baseDirectory.resolve(filename).normalize();
        ensureInsideBaseDirectory(path);
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
            prop.load(reader);
        }
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        Path path = baseDirectory.resolve(filename).normalize();
        ensureInsideBaseDirectory(path);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            prop.store(writer, "written by FileProperties");
        }
    }

    private void ensureInsideBaseDirectory(Path path) throws IOException {
        if (!path.startsWith(baseDirectory)) {
            throw new IOException("File must stay inside base directory: " + path);
        }
    }

    @Override
    public void setValue(String key, String value) {
        prop.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return prop.getProperty(key);
    }
}
