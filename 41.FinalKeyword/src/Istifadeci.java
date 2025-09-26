public class Istifadeci extends BaseClass{

    private String istifadeciAdi;

    private String parol;

//    public final int a;
/*   public final int REQEM;

    public Istifadeci() { // Boyuk herflerle isare olunur
        REQEM = 3;
    }*/

    public final int a = 5; // a-nin deyeri daha sonra deyisdirile bilmez

    public void istifadeciMelumatlariniYazdir(final String istifadeciAdi, final String parol)
    {
//        istifadeciAdi = "Ali";
        System.out.println("Istifadeci Adi : " + istifadeciAdi);
        System.out.println("Parol : " + parol);
    }



    public String getIstifadeciAdi() {
        return istifadeciAdi;
    }

    public void setIstifadeciAdi(String istifadeciAdi) {
        this.istifadeciAdi = istifadeciAdi;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }
}
