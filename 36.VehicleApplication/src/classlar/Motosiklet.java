package classlar;

public class Motosiklet extends Masin {

    private double yolNeqliyyatCezasiMeblegi;

    public Motosiklet() {
    }

    public Motosiklet(Long id, String masinAdi, String reng, double qiymet, int masinTekerSayi, String firmaAdi, String model, double yolNeqliyyatCezasiMeblegi) {
        setId(id);
        setMasinAdi(masinAdi);
        setReng(reng);
        setQiymet(qiymet);
        setMasinTekerSayi(masinTekerSayi);
        setFirmaAdi(firmaAdi);
        setModel(model);
        this.yolNeqliyyatCezasiMeblegi = yolNeqliyyatCezasiMeblegi;
    }

    @Override
    public void masinMelumatlariniGoster() {
        super.masinMelumatlariniGoster();
        System.out.println("ID :" + getId());
        System.out.println("Masin Adi : " + getMasinAdi());
        System.out.println("Reng :" + getReng());
        System.out.println("Qiymet :" + getQiymet());
        System.out.println("MasinTekerSayi :" + getMasinTekerSayi());
        System.out.println("FirmaAdi :" + getFirmaAdi());
        System.out.println("Model :" + getModel());
    }

    @Override
    public void yolNeqliyyatCezaOde(double cezaMebleg) {
        super.yolNeqliyyatCezaOde(cezaMebleg);
        System.out.println(getMasinAdi() + " bu tipli masinin yol neqliyyat " +
                "cezasi umumu meblegi : " + yolNeqliyyatCezasiMeblegi);
    }

    public double getYolNeqliyyatCezasiMeblegi() {
        return yolNeqliyyatCezasiMeblegi;
    }

    public void setYolNeqliyyatCezasiMeblegi(double yolNeqliyyatCezasiMeblegi) {
        this.yolNeqliyyatCezasiMeblegi = yolNeqliyyatCezasiMeblegi;
    }
}
