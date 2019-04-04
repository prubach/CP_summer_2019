package pl.waw.sgh;

import java.io.File;

public class FileCount {

    public static long sumSize(File inFile) {
        long sum = 0;
        if (inFile.isDirectory()) {
            for (File f : inFile.listFiles()) {
                System.out.println(f.toString() + " " + f.length());
                //sum += f.length();
                sum += sumSize(f);
            }
        } else {
            return inFile.length();
        }
        return sum;
    }

    public static void main(String[] args) {
        String INPUT_PATH = "c:\\temp";
        File mypath = new File(INPUT_PATH);

        System.out.println(sumSize(mypath));


    }
}
