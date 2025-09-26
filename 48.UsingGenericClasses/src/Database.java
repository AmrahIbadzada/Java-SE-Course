public class Database <T>{

//    private T deyer;
    public void qeydEt(T obyekt) // Dəyişənin dinamik bir struktura çevrilməsini istəyirik
    {
        // Verilənlər bazasına qeyd etmə prosesini təsəvvür et

        System.out.println("database-e qeyd olundu...");
    }

    public void sil(T obyekt)
    {
        System.out.println("database-den silindi...");
    }
}
