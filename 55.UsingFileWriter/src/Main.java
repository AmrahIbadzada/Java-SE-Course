import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        fileWriter();
    }

    public static void fileWriter()
    {
        FileWriter writer = null;
        File file = new File("D:\\javaioTest\\telebeler.txt");
        if (!file.exists())
        {
            try {
                file.createNewFile();
                System.out.println("Yaradilir...");
            } catch (IOException e) {
                System.out.println("Xeta : " + e.getMessage());
            }
        } else {
            try {
                writer = new FileWriter(file, true);
                writer.write("Unknown\n");
                writer.write("Unknoww2");
                System.out.println("Yazi qeyd olunur...");
            } catch (IOException e) {
                System.out.println("Xeta : " + e.getMessage());
            } finally {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Xeta : " + e.getMessage());
                }
            }
        }
    }
}