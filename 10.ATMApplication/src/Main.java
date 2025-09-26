import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Eli Bayram: Kart AZE1234 000 567 985 345 6572 23 45
        // Eli user adi ve parolu : eli55  ---> 456

        // Behram Behramov: Kart AZE1265 0780 127 985 345 7572 13 89
        // Behram user adi ve parolu : behram12 ---> 123

        String prosessecimleri =
                "\nBalansa baxmaq ucun --> 1\n" +
                "Pul cixarmaq ucun ---> 2\n" +
                "Ferqli hesaba pul kocurmek ucun ---> 3\n" +
                "Proqramdan cixmaq ucun ---> duymesine basin... 'q'\n";

        Scanner scanner = new Scanner(System.in);

        double behramBalans = 2450;
        String behramKart = "AZE1265 0780 127 985 345 7572 13 89";
        String behramIstifadeci = "behram12";
        String behramParol = "123";

        double eliBalans = 1200;
        String eliKart = "AZE1234 000 567 985 345 6572 23 45";
        String eliIstifadeci = "eli55";
        String eliParol = "456";

        System.out.println("ATM'ye Xos Gelmisiniz.");
        System.out.println("Zehmet olmasa melumatlari daxil edin");

        System.out.print("Istifadeci Adi: ");
        String userAd = scanner.nextLine();

        System.out.print("Parolu daxil edin: ");
        String parol = scanner.nextLine();

        // ======================= BEHRAM =====================
        if (userAd.equals(behramIstifadeci) && parol.equals(behramParol)) {
            System.out.println("Behram Behramov Hesabina giris edildi...");
            System.out.println(prosessecimleri);

            System.out.print("Zehmet olmasa bir secim edin: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Balansiniz: " + behramBalans + " AZN");
                    break;

                case "2":
                    System.out.print("Cixartmaq istediyiniz pulu daxil edin: ");
                    int cixPul = scanner.nextInt();
                    scanner.nextLine(); // buffer temizlemek ucun
                    if (behramBalans >= cixPul) {
                        behramBalans -= cixPul;
                        System.out.println("Pul hesabinizdan cixarildi. Yeni balans: "
                                + behramBalans + " AZN");
                    } else {
                        System.out.println("Balansiniz kifayet etmir.");
                    }
                    break;

                case "3":
                    System.out.print("Gondermek istediyiniz meblegi daxil edin: ");
                    int gonderMebleg = scanner.nextInt();
                    scanner.nextLine(); // buffer temizlemek ucun
                    if (gonderMebleg <= behramBalans) {
                        System.out.print("Kart nomresini daxil edin: ");
                        String hedefKart = scanner.nextLine();
                        if (hedefKart.equals(eliKart)) {
                            behramBalans -= gonderMebleg;
                            eliBalans += gonderMebleg;
                            System.out.println("Pul Eli Bayram hesabina kocuruldu.");
                            System.out.println("Yeni balansiniz: " + behramBalans + " AZN");
                        } else {
                            System.out.println("Bele bir kart tapilmadi.");
                        }
                    } else {
                        System.out.println("Kifayet qeder balans yoxdur.");
                    }
                    break;

                case "q":
                    System.out.println("Cixis edildi.");
                    break;

                default:
                    System.out.println("Yanlis secim etdiniz.");
            }
        }

        // ======================= ELI =====================
        else if (userAd.equals(eliIstifadeci) && parol.equals(eliParol)) {
            System.out.println("Eli Bayram Hesabina giris edildi...");
            System.out.println(prosessecimleri);

            System.out.print("Zehmet olmasa bir secim edin: ");
            String secim = scanner.nextLine();

            switch (secim) {
                case "1":
                    System.out.println("Balansiniz: " + eliBalans + " AZN");
                    break;

                case "2":
                    System.out.print("Cixartmaq istediyiniz pulu daxil edin: ");
                    int cixPul = scanner.nextInt();
                    scanner.nextLine(); // buffer temizlemek ucun
                    if (eliBalans >= cixPul) {
                        eliBalans -= cixPul;
                        System.out.println("Pul hesabinizdan cixarildi. Yeni balans: "
                                + eliBalans + " AZN");
                    } else {
                        System.out.println("Balansiniz kifayet etmir.");
                    }
                    break;

                case "3":
                    System.out.print("Gondermek istediyiniz meblegi daxil edin: ");
                    int gonderMebleg = scanner.nextInt();
                    scanner.nextLine(); // buffer temizlemek ucun
                    if (gonderMebleg <= eliBalans) {
                        System.out.print("Kart nomresini daxil edin: ");
                        String hedefKart = scanner.nextLine();
                        if (hedefKart.equals(behramKart)) {
                            eliBalans -= gonderMebleg;
                            behramBalans += gonderMebleg;
                            System.out.println("Pul Behram Behramov hesabina kocuruldu.");
                            System.out.println("Yeni balansiniz: "
                                    + eliBalans + " AZN");
                        } else {
                            System.out.println("Bele bir kart tapilmadi.");
                        }
                    } else {
                        System.out.println("Kifayet qeder balans yoxdur.");
                    }
                    break;

                case "q":
                    System.out.println("Cixis edildi.");
                    break;

                default:
                    System.out.println("Yanlis secim etdiniz.");
            }
        }

        // ===================== YANLIS GIRIS ===================
        else {
            System.out.println("Istifadeci adi ve ya parol yanlisdir. " +
                    "Yeniden cehd edin.");
        }

        scanner.close();
    }
}
