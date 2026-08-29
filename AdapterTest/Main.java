package AdapterTest;

import java.io.IOException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new IllegalArgumentException("Usage: AdapterTest.Main <base-directory>");
        }

        FileIo f = new FileProperties(Path.of(args[0]));
        f.readFromeFile("file.txt");
        f.setValue("year", "2004");
        f.setValue("month", "4");
        f.setValue("day", "2 1");
        f.writeToFile("newfile.txt");
    }
}
