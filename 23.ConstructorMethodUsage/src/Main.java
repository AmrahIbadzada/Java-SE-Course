import Testcode.test;

public class Main {
    public static void main(String[] args) {
        //Constructor metodundan istifadə

        //Bir sinifdən yeni obyekt yaradanda, həmin obyektin ilkin vəziyyətini
        // təyin edən konstruktor metodu əvvəlcə çağırılır.

//        test telebe0 = new test(18, "ALI", "Ahmadov"); // test() - test sinifinin Constructor-dur

        test telebe0 = new test();

        /*test telebe0 = new test(18);

        test telebe0 = new test(18, "ALI", "Ahmadov");*/

        /*telebe0.yas = 18;
        telebe0.Ad = "Ali";
        telebe0.Soyad = "Ahmadov";*/

        System.out.println("Telebenin Melumatlari");
        System.out.println("ID: " + telebe0.yas);
        System.out.println("Ad: " + telebe0.Ad);
        System.out.println("Soyad: " + telebe0.Soyad);


    }
}