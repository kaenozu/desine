package AdapterTest;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIo f = new FileProperties();

        try {
            f.readFromeFile("file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "2 1");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
