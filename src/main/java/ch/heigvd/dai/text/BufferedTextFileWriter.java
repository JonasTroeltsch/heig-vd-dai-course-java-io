package ch.heigvd.dai.text;

import ch.heigvd.dai.Writable;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedTextFileWriter implements Writable {
    @Override
    public void write(String filename, int sizeInBytes) throws IOException {
        BufferedWriter os = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename),
                StandardCharsets.UTF_8));

        for (int i = 0; i < sizeInBytes; i++) {
            os.write(1);
        }

        os.flush();
        os.close();
    }
}
