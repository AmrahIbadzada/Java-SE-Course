public class Isci {

    public int no;
    public String ad;
    public String soyad;
    public int tecrube;
    public double maas;

    public Isci() {

    }

    // Alt + Ins
    public Isci(int no, String ad, String soyad, int tecrube, double maas) {
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.tecrube = tecrube;
        this.maas = maas;
    }



    public void isciMelumatlariGoster()
    {
        System.out.println("*******Isci Melumatlari*******");
        System.out.println("No : " + no);
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + soyad);
        System.out.println("Tecrube : " + tecrube);
        System.out.println("Maas : " + maas);
    }

    public void MaasiArtir(int ArtirmaDeyeri)
    {
        System.out.println("Maasiniza " + ArtirmaDeyeri + " Azn qaldirildi.");
        System.out.println("Hazirdaki olan maasiniz :" + (maas + ArtirmaDeyeri));
    }

    public void formatla(String emeliyyatSistemi, String kim)
    {
        System.out.println(kim + " hazirda " + emeliyyatSistemi + " emeliyyat sistemine format atir.");
    }

}
