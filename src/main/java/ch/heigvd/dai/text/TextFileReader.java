package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        FileReader fis = new FileReader(filename);

        int b; // is -1 if end of file or byte value 0-255
        while ((b = fis.read()) != -1) {
          // Do nothing
        }

        fis.close();
    }
}
