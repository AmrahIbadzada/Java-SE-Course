public class Duzbucaqli extends HendesiFiqur{

    private int eni;

    private int uzunluq;

/*    public Duzbucaqli() {

    }*/

    public Duzbucaqli(int eni, int uzunluq, String adi) {
        this.eni = eni;
        this.uzunluq = uzunluq;
        super.adi = adi;
    }

    @Override
    public void saheniHesabla() {
        System.out.println(super.adi +" nin sahesi : " + getEni()*getUzunluq());
    }

    public int getEni() {
        return eni;
    }

    public void setEni(int eni) {
        this.eni = eni;
    }

    public int getUzunluq() {
        return uzunluq;
    }

    public void setUzunluq(int uzunluq) {
        this.uzunluq = uzunluq;
    }
}
