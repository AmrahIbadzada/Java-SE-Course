public class Ucbucaq extends HendesiFiqur {

    private int hundurluk;
    private int teref;

/*    public Ucbucaq() {
    }*/

    public Ucbucaq(int teref, int hundurluk) {
        this.teref = teref;
        this.hundurluk = hundurluk;
        adi = "Ucbucaq";
    }


    @Override
    public void saheniHesabla() {

        System.out.println(adi +" nin sahesi : " + getTeref()*getHundurluk()/2);
    }

    public int getHundurluk() {
        return hundurluk;
    }

    public void setHundurluk(int hundurluk) {
        this.hundurluk = hundurluk;
    }

    public int getTeref() {
        return teref;
    }

    public void setTeref(int teref) {
        this.teref = teref;
    }
}
