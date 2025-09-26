package classlar;

public class Masin {

    private Long id;

    private String MasinAdi;

    private String reng;

    private double qiymet;

    private int masinTekerSayi;

    private String firmaAdi;

    private String model;

    public Masin() {
    }

    public Masin(Long id, String masinAdi, String reng, double qiymet, int masinTekerSayi, String firmaAdi, String model) {
        this.id = id;
        MasinAdi = masinAdi;
        this.reng = reng;
        this.qiymet = qiymet;
        this.masinTekerSayi = masinTekerSayi;
        this.firmaAdi = firmaAdi;
        this.model = model;
    }

    public void masinMelumatlariniGoster() {
        System.out.println("Masin Melumatlari");
        System.out.println("---------------");
    }

    public void yolNeqliyyatCezaOde(double cezaMebleg) {
        System.out.println("Yol Neqliyyat Cezasi");
        System.out.println("---------------");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMasinAdi() {
        return MasinAdi;
    }

    public void setMasinAdi(String masinAdi) {
        MasinAdi = masinAdi;
    }

    public String getReng() {
        return reng;
    }

    public void setReng(String reng) {
        this.reng = reng;
    }

    public double getQiymet() {
        return qiymet;
    }

    public void setQiymet(double qiymet) {
        this.qiymet = qiymet;
    }

    public int getMasinTekerSayi() {
        return masinTekerSayi;
    }

    public void setMasinTekerSayi(int masinTekerSayi) {
        this.masinTekerSayi = masinTekerSayi;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public void setFirmaAdi(String firmaAdi) {
        this.firmaAdi = firmaAdi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
