//38 - ders
/*public class Main {
    public static void main(String[] args) {

        // Parametrsiz və geri dəyər qaytarmayan metod
        adYazdir();

        //1 defe yaz istediyin yerde istifade et
        *//*
         * Metodlar kodu təkrar istifadə etmək üçündür.
         *
         * Çox istifadə edilən kod hissələrini metod şəklində yaza bilərik.
         *//*

        // Parametrsiz və dəyər qaytarmayan metodun çağırılması
    }

    // Giriş tipi + dönüş tipi + metod adı () — əsas quruluş

    // Bu metod heç bir parametr qəbul etmir və geriyə dəyər qaytarmır

    public static void adYazdir()
    {
        System.out.println("Unknown");
    }
}*/

// 39-cu ders
/*public class Main {
    public static void main(String[] args) {


        // Parametrli və geri dəyər qaytarmayan metod

        // adYazdir();

        topla(1, 5); // tam eded
        adiSoyadiYazdir("Joe", "Doe");
    }

    public static void adiSoyadiYazdir(String ad, String soyad)
    {
        System.out.println("Ad ve Soyad: " + (ad + " " + soyad));
    }

    public static void topla(int eded1, int eded2)
    {
        int netice = eded1 + eded2;
        System.out.println("Netice: " + netice);
    }

    public static void adYazdir()
    {
        System.out.println("Unknown");
    }
}*/


// W3schools Practice
/*
public class Main {
    static void myMethod(String name) {
        System.out.println(name + " Names");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
*/
// 40-ci ders

public class Main {
    public static void main(String[] args) {

        // Parametrli və geri dəyər qaytaran metod

        int metodNetice = vur(5,3);
        System.out.println(metodNetice);

        String adNetice = adYazdirma("Unknown");
        System.out.println(adNetice);

    }

//     return – bir dəyeri qaytarmaq üçün istifade olunur
//     metodu sonlandırmaq (dayandırmaq) üçün istifade olunur

    public static int vur(int eded1, int eded2)
    {
        int netice = eded1*eded2;
        return netice;
    }

    public static String adYazdirma(String ad)
    {
        return ad;
    }

}




