package lesson1;

import java.util.Scanner;
import java.io.File;

public class FileScanner {

    //if file isn't there or have a problem to read it, we need to account for that by saying can throw an exception
    public static void main(String[] args) throws Exception{

        File file = new File("Alice.txt");
        //use Scanner object to read a file
        Scanner fileScan = new Scanner(file);

        //loop that read every line into a String
        int numberOfWords = 0;
        while (fileScan.hasNextLine()){
            String line = fileScan.nextLine();
            //Splitting line by space and count the number of words using length of the split array
            numberOfWords += line.split(" ").length;
        }
        System.out.println("In this file is " + numberOfWords + " words.");
    }
}
