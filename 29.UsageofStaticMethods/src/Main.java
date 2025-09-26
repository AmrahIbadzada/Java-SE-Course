public class Main {
    public static void main(String[] args) {
        // Static-lər
        // Static dəyişən təyini
        // Bir sinifin daxilindəki dəyişən və ya metodlara obyekt yaratmadan,
        // birbaşa sinifin adı üzərindən çatmağa(elde etemeye) imkan verən açar söz (static) kimi tanınır.


        /*Telebe.nomre = "12231232132";

        System.out.println("Nomresi : " + Telebe.nomre);*/

        Telebe.nomre = "12345";
//        Telebe.nomreYazdir();

        Telebe telebeler = new Telebe();
        telebeler.setId(5L);
        telebeler.setAd("Ali");
        telebeler.setSoyad("Unk");

        telebeler.TelebeMelumatlari();


    }
}