import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Java Input / Output

        fileInputStream();

    }


    public static void fileInputStream()
    {
        File file = new File("D:\\javaioTest\\telebeler.txt");
        if (!file.exists())
        {
            System.out.println("Qeyd Olunan Yerde Folder Tapilmadi...");
        }else {
            FileInputStream fis= null;
            int deyer = 0;
            try {
                fis = new FileInputStream(file);
                while ((deyer = fis.read())!=-1)
                {
                    char simvol = (char)deyer;
                    System.out.println("Simvol : " + simvol);
                }
            } catch (IOException e) { 
                System.out.println("Xeta : " + e.getMessage());
            } finally {
                try {
                    fis.close();
                } catch (IOException e) {
                    System.out.println("Xeta : " + e.getMessage());
                }
            }
        }
    }
}
