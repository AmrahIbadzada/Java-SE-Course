import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        tryWithResources();
    }

    public static void tryWithResources()
    {
        try(FileWriter writer = new FileWriter("D:\\javaioTest\\telebeler.txt", true))
        {
            writer.write("\nUnknown Unk, None");
        } catch (IOException e) {
            System.out.println("Xeta : " + e.getMessage());
        }
    }
}