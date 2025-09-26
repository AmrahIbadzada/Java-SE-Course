import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Java Input / Output

        File file = new File("D:\\javaders\\telebeler.txt");
        if(!file.exists())
        {
            try {
                file.createNewFile();
                System.out.println("Fayl yaradilir...");
            } catch (IOException e) {
                System.out.println("Xeta : " + e.getMessage());
            }
        }else {
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(file, true);
                try {
                    out.write(42);
                } catch (IOException e) {
                    System.out.println("Xeta  : " + e.getMessage());
                }
            } catch (FileNotFoundException e) {
                System.out.println("Xeta : " + e.getMessage());
            }
            finally {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println("Cixan zaman xeta yarandi : " + e.getMessage());
                }
            }
        }
    }
}