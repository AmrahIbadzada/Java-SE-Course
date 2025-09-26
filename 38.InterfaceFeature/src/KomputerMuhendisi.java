public class KomputerMuhendisi extends BaseMuhendis implements IMuhendis {


    public KomputerMuhendisi() {
    }

    public KomputerMuhendisi(String ad, String soyad, int tecrube, double maas, String[] diller) {
        setAd(ad);
        setSoyad(soyad);
        setTecrube(tecrube);
        setMaas(maas);
        setDiller(diller);
    }

    @Override
    public void melumatiYazdir() {
        System.out.println("Adi : " + getAd());
        System.out.println("Soyad : " + getSoyad());
        System.out.println("Tecrube : " + getTecrube());
        System.out.println("Maas : " + getMaas());
        System.out.println("Esgerlik Veziyyet : " + getEsgerlikVeziyyeti());
        System.out.println("Programlasdirma Dilleri : ");
        for (String dil : getDiller()) {
            System.out.println(dil + ", ");
        }
    }

    @Override
    public void esgerlikEdildimi(boolean deyer) {
        if (deyer) {
            setEsgerlikVeziyyeti("Esgerliyini Edib.");
        } else {
            setEsgerlikVeziyyeti("Esgerliyini Edmeyib.");
        }

    }

}
