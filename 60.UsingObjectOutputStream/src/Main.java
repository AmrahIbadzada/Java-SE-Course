import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {

        Telebe[] telebeListi = new Telebe[] {
                new Telebe(1L,"Unknown", "Unk"),
                new Telebe(2L, "Unknown1", "Unk1"),
                new Telebe(3L, "Unknown2", "Unk2")
        };

        objectOutputStream(telebeListi);
    }
    public static void objectOutputStream(Telebe[] massiv)
    {
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(new File("D:\\javaioTest\\telebelerobject.bin"))))
        {
            output.writeObject(massiv);
        }catch (Exception e)
           {
               System.out.println("Xeta : " + e.getMessage());
           }
    }
}