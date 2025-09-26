import Testcode.test;

public class Main {
    public static void main(String[] args) {
       //Giriş İcazələri: Public & Private | Giriş Modifikatorları

        /*
        *Giriş Müəyyənləşdiriciləri(Giriş İcazələri) (Access Modifiers)
        *
        *public: Hər yerdən giriş mümkündür, heç bir məhdudiyyət yoxdur.
        *
        *private: Yalnız öz sinfi(class) daxilində istifadə oluna bilər, digər
        siniflərdən giriş mümkün deyil.
        *
        *protected: Öz sinfi(class) daxilində və həmin sinfi miras alan alt
        siniflərdə (subclass-larda) giriş mümkündür.
         */

//        test telebe0 = new test();
          test telebe0 = new test("K");


        System.out.println("Telebenin Melumatlari");
        System.out.println("ID: " + telebe0.yas);
        System.out.println("Ad: " + telebe0.Ad);
        System.out.println("Soyad: " + telebe0.Soyad);
        telebe0.genderYazdir();
    }
}