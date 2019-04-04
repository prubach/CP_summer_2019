package pl.waw.sgh;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        String OUT_PATH = "c:\\temp\\out.txt";
        File outFile = new File(OUT_PATH);

        try {
            // Overwrite existing file or append to it
            FileWriter fw = new FileWriter(outFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Header of my file");
            bw.newLine();
            bw.write("23;23;242456");
            bw.newLine();
            // position in the ASCII table
            bw.write(69);
            //bw.flush();
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
