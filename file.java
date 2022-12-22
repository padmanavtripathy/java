import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class file {
    public static void main(String[] args) {
       //code to create a file

        File myfFile = new File("text.txt");
        try {
        myfFile.createNewFile();
        } catch (IOException e) {
        System.out.println("unable to create this file");
        e.printStackTrace();
        }

        // code to write to a file

        try {
        FileWriter fileWriter = new FileWriter("text.txt");

        fileWriter.write("hello world");
        fileWriter.write("hello world");
        fileWriter.write("hello world");
        fileWriter.close();
        } catch (IOException e) {
        System.out.println("file not found");
        e.printStackTrace();
        }

        // reading a file
        File myfile = new File("text2.txt");
        try {
            Scanner sc = new Scanner(myfile);
            while (sc.hasNextLine()) {
                String line = sc.next();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();



    }

}