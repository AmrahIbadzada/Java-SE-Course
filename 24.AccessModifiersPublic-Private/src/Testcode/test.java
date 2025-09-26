package Testcode;

public class test {

    public int yas;

    public String Ad;

    public String Soyad;

    private String gender; //public versiyaya qapalidi

    //method overloading
    //parametr sayisi ferqlidi olacaq
    //parametr tipleri ferqli olacaq


    public test() {
    }

    public test(String p_gender) {
//        this.gender = gender;
        gender = p_gender;
    }
    public void genderYazdir()
    {
        System.out.println("Gender : " +this.gender);
    }

    public test(int yas, String Ad, String Soyad) {
        //Constructor geriye donus tipi olmaz, parametrde elave ede bilerik
//        System.out.println("Test sinifinin qurucu metodu isledi");

        //this - hazirda uzerinde calisdigimiz class demek
        this.yas = yas;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }

}
