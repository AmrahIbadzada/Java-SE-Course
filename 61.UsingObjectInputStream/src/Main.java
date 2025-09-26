import java.io.*;

public class Main {
    public static void main(String[] args) {


        objectInputStream();
    }

    public static void objectInputStream()
    {
//        FileInputStream
        try(ObjectInputStream in =  new ObjectInputStream(new FileInputStream(new File("D:\\javaioTest\\telebelerobject.bin"))))
        {
            try {
                //unboxing
               Telebe[] telebeListi = (Telebe[])in.readObject();
                for (Telebe telebe : telebeListi) {
                    System.out.println("ID   : " + telebe.getId());
                    System.out.println("Ad   : " + telebe.getAd());
                    System.out.println("Soyad   : " + telebe.getSoyad());

                    System.out.println("----------------------------");
                }
            } catch (ClassNotFoundException e) {
                System.out.println("Bele bir class yoxdur : " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Folder Tapilmadi : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Xeta : " + e.getMessage());
        }
    }
}