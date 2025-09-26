import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        fileReader();
    }

    public static void fileReader()
    {
        File file = new File("D:\\javaioTest\\telebeler.txt");
        if (!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Xeta : " + e.getMessage());
            }
            System.out.println("Yaradilir...");
        }else{
            try {
                Scanner scanner = new Scanner(new FileReader(file));
                while (scanner.hasNextLine())
                {
//                    System.out.println(scanner.nextLine());
                   String list =  scanner.nextLine();
                    String[] listMassiv = list.split(",");
                    System.out.println(listMassiv[0]);
                }
            } catch (FileNotFoundException e) {
                System.out.println("Xeta : " + e.getMessage());
            }
        }
    }
}