import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class Find {
    public static void main(String[] args) {
        System.out.print("Enter The String Value :- ");
        Scanner sc = new Scanner(System.in);
        String ak = sc.nextLine();
        sc.close();
        System.out.println("The Given String Is :-  " + ak);
        create_file();
        Write_to_a_file(ak);
        reading_from_file();
        sc.close();
    }

    static String decode(String line) {
        char[] arr = line.toCharArray();
        for (int i = 0; i < line.length(); i++) {
            if (arr[i] == ' ') {

            } else {
                int b = (int) arr[i] - 1;
                arr[i] = (char) b;
            }
        }
        System.out.println();
        line = String.copyValueOf(arr);
        return line;
    }

    static String encode(String ak) {
        char[] arr = ak.toCharArray();
        for (int i = 0; i < ak.length(); i++) {
            if (arr[i] == ' ') {

            } else {
                int b = (int) arr[i] + 1;
                arr[i] = (char) b;
            }
        }
        ak = String.copyValueOf(arr);
        return ak;
    }

    // // // // code to create a file
    static void create_file() {
        File myfFile = new File("text2.txt");
        try {
            myfFile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create this file");
            e.printStackTrace();
        }
    }

    // // // // code to write to a file
    static void Write_to_a_file(String ak) {
        try {
            FileWriter fileWriter = new FileWriter("text2.txt");
            ak = encode(ak);
            System.out.println("The Encoded String Stored In File Is :-  " + ak);
            fileWriter.write(ak);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }

    // reading a file
    static void reading_from_file() {
        File myfile = new File("text2.txt");
        try {
            Scanner a = new Scanner(myfile);
            while (a.hasNextLine()) {
                System.out.println("The String read from file Is :- " + decode(a.nextLine()));
            }
            a.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}