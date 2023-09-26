package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriter implements Writable {

    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        FileWriter os = new FileWriter(filename);

        for (int i = 0; i < sizeInBytes; i++) {
            os.write(1);
        }

        os.flush();
        os.close();
    }
}
