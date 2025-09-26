package Encmodel;

public class Test {

    //Constructor -- getter setter(kapsullasdirma)

    private Long id;

    private String Ad;

    private String Soyad;

    private int maas;

    public Test() {
    }

    //Alt + ins
    public Test(Long id, String ad, String soyad, int maas) {
        this.id = id;
        Ad = ad;
        Soyad = soyad;
        this.maas = maas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas>=1000 && maas<=5000)
        {
        this.maas = maas;
        }
    }
}
