package Testcode;

public class test {

    public int yas;

    public String Ad;

    public String Soyad;

    //method overloading
    //Parametr sayı fərqli olmalıdır
    //və ya parametrlərin tipləri fərqli olmalıdır
    public test() {
        System.out.println("Parametrsiz");
    }

    public test(int yas) {
        this.yas = yas;
    }

    public test(int yas, String Ad, String Soyad) {
        //Constructor geriye donus tipi olmaz, parametrde elave ede bilerik
//        System.out.println("Test sinifinin Constructor metodu isledi");

        //this - hazirda uzerinde calisdigimiz class demek
        this.yas = yas;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }


}
