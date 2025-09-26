public class Main {
    public static void main(String[] args) {
         //Generic Class, Method In Java

        // <> ---> generic

        Database<Telebe> database = new Database<Telebe>();
        database.sil(new Telebe());

        Database<Isciler> iscilerDatabase = new Database<Isciler>();
        iscilerDatabase.qeydEt(new Isciler());
    }
}