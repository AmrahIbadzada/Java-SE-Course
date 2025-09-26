public class Main {
    public static void main(String[] args) {


/*        DatabaseImpl databaseImpl = new DatabaseImpl();
        databaseImpl.elaveEt(null);
        databaseImpl.sil(null);
        databaseImpl.yenile(null);*/

        IDatabase<Musteri> databaseTest = new DatabaseTestImpl<Musteri>();
        databaseTest.elaveEt(null);
        databaseTest.sil(null);
        databaseTest.yenile(null);
    }
}