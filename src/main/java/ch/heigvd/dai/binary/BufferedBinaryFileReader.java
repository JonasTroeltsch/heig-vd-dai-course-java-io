package ch.heigvd.dai.binary;

import ch.heigvd.dai.Readable;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedBinaryFileReader implements Readable {

    @Override
    public void read(String filename) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));

        int b;
        while ((b = bis.read()) != -1) {
          // Do nothing
        }

        bis.close();
    }
}
