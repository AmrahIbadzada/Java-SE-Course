public class Telebe {

    private Long id;

    private String ad;

    private String soyad;

    public static String nomre;

    //Statik metodun içərisində statik olmayan heç bir dəyişənə və ya metoda
    // müraciət etmək və ya ondan istifadə etmək mümkün deyil.

    public static void nomreYazdir()
    {
        System.out.println("Nomre : " + nomre);

    }

    public void TelebeMelumatlari()
    {
        System.out.println("id : " + getId());
        System.out.println("id : " + getAd());
        System.out.println("id : " + getSoyad());
        nomreYazdir();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
}


