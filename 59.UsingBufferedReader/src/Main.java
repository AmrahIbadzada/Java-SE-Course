import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        FileReader
        bufferedReader();

    }
    public static void bufferedReader()
    {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader(new File
                ("D:\\javaioTest\\telebeler.txt")))))
        {
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Xeta : " + e.getMessage());
        }
    }
}