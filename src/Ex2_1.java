import java.io.*;
import java.nio.Buffer;
import java.util.Random;
import java.util.Scanner;

public class Ex2_1 {

    public static String[] createTextFiles(int n, int seed, int bound){
        String[] FileNames = new String[n];
        Random rand = new Random(seed);
        int lines = 0;
        for(int i=1; i<=n; i++){
            try{
                FileWriter writer = new FileWriter("file" + i + ".txt");
                FileNames[i-1] = "file" + i + ".txt";
                lines = rand.nextInt(bound);
                for(int j=0; j< lines; j++){
                    if(j == lines-1){
                        writer.write("end");
                    }
                    else {
                        writer.write("end\n");
                    }
                }
                writer.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return FileNames;
    }



    public static int getNumOfLines(String[] fileNames) {
        int NumOfLines = 0;
        for (int i = 0; i < fileNames.length; i++) {
            try {
                File file = new File(fileNames[i]);
                Scanner scan = new Scanner((file));

                while (scan.hasNextLine()) {
                    scan.nextLine();
                    NumOfLines++;
                }
                scan.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return NumOfLines;
    }



    public int getNumOfLinesThreads(String[] fileNames){

        return 0;
    }


    public int getNumOfLinesThreadPool(String[] fileNames){

        return 0;
    }





}
