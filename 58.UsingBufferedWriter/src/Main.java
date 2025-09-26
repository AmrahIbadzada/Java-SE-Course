import java.io.*;

public class Main {
    public static void main(String[] args) {

//        BufferedWriter

       /* try {
            Writer writer = new FileWriter(new File("D:\\javaioTest\\telebeler.txt"));
        } catch (IOException e) {
            System.out.println("Xeta : " + e.getMessage());
        }*/

        bufferedWriter();
    }

    public static void bufferedWriter()
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(new File("D:\\javaioTest\\telebeler.txt"), true)))
        {
            writer.write("\nUnknownNew UnkNew, None");
        } catch (IOException e) {
            System.out.println("Xeta : " + e.getMessage());
        }
    }
}