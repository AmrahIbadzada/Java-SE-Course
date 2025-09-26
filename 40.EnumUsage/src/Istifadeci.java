public class Istifadeci {

    private String istifadeciAdi = "Unk";

    private String parol = "123";

    public GirisNetice checkEle(String istifadeciAdi, String parol)
    {
        if(istifadeciAdi.equals(this.istifadeciAdi) && parol.equals(this.parol))
        {
            return GirisNetice.UGURLU;
        }else {
            return GirisNetice.UGURSUZ;
        }
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
