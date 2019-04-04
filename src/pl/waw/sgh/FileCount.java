package pl.waw.sgh;

import java.io.File;

public class FileCount {

    public static void main(String[] args) {
        String INPUT_PATH = "c:\\temp";
        File mypath = new File(INPUT_PATH);

        if (mypath.isDirectory()) {
            for (File f : mypath.listFiles()) {
                System.out.println(f.toString() + " " + f.length());
            }
        }

    }
}
