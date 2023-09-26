package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        FileInputStream fis = new FileInputStream(filename);

        int b; // is -1 if end of file or byte value 0-255
        while ((b = fis.read()) != -1) {
          // Do nothing
        }

        fis.close();
    }
}
