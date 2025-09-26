public class Main {
    public static void main(String[] args) {

        // Enum

        Istifadeci istifadeci = new Istifadeci();
        GirisNetice netice = istifadeci.checkEle("Unk1", "111");

        if(netice==GirisNetice.UGURLU)
        {
            System.out.println("Tebrikler ugurlu giris etdiniz.");
        }else {
            System.out.println("Xetali Giris!");
        }
    }
}