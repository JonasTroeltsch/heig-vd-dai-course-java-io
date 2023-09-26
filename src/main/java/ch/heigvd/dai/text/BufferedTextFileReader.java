package ch.heigvd.dai.text;

import ch.heigvd.dai.Readable;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedTextFileReader implements Readable {
    @Override
    public void read(String filename) throws IOException {
        BufferedReader is = new BufferedReader(new InputStreamReader(new FileInputStream(filename), StandardCharsets.UTF_8));

        String line;

         while ((line = is.readLine()) != null) {
             // do nothing
         }

         is.close();

    }
}
