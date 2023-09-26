package ch.heigvd.dai;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        boolean[] buffered = {false, true};

        for (boolean buffer: buffered){
                Measure.write("binary_1B.bin", 1, buffer, Measure.FileType.BINARY);
                Measure.write("binary_1KiB.bin", 1024, buffer, Measure.FileType.BINARY);
                Measure.write("binary_1MiB.bin", 1024 * 1024, buffer, Measure.FileType.BINARY);
                Measure.write("binary_5MiB.bin", 5 * 1024 * 1024, buffer, Measure.FileType.BINARY);

                Measure.read("binary_1B.bin", buffer, Measure.FileType.BINARY);
                Measure.read("binary_1KiB.bin", buffer, Measure.FileType.BINARY);
                Measure.read("binary_1MiB.bin", buffer, Measure.FileType.BINARY);
                Measure.read("binary_5MiB.bin", buffer, Measure.FileType.BINARY);

        }

        for (boolean buffer: buffered){
                Measure.write("text_1B.txt", 1, buffer, Measure.FileType.TEXT);
                Measure.write("text_1KiB.txt", 1024, buffer, Measure.FileType.TEXT);
                Measure.write("text_1MiB.txt", 1024 * 1024, buffer, Measure.FileType.TEXT);
                Measure.write("text_5MiB.txt", 5 * 1024 * 1024, buffer, Measure.FileType.TEXT);

                Measure.read("text_1B.txt", buffer, Measure.FileType.TEXT);
                Measure.read("text_1KiB.txt", buffer, Measure.FileType.TEXT);
                Measure.read("text_1MiB.txt", buffer, Measure.FileType.TEXT);
                Measure.read("text_5MiB.txt", buffer, Measure.FileType.TEXT);

        }


    }

}
