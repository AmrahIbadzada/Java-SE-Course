import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Calisan sinifini olusturup ise baslayalim

//        Isci worker = new Isci();

        System.out.println("********Programa Xos Geldiniz********");

        Scanner scanner = new Scanner(System.in);

        System.out.print("No deyerini daxil edin: ");
        int no = scanner.nextInt();
        scanner.nextLine();
        // integerden sonra string alacayiqsa istifade edirik.
        // Yeni almayacayiqsa istifade etmirik

        System.out.println("Ad daxil edin: ");
        String ad = scanner.nextLine();

        System.out.println("Soyad daxil edin: ");
        String soyad = scanner.nextLine();

        System.out.println("tecrubeni daxil edin: ");
        int tecrube = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Maas daxil edin: ");
        double maas = scanner.nextDouble();
        scanner.nextLine();

        Isci isciler = new Isci(no, ad, soyad, tecrube, maas);


        // \n- acilisi newline
        String prosesler = "1-Iscinin datasini goster\n"
                + "2-MaasiArtir\n"
                + "3-Format at";
        System.out.println("---------------------------------");
        System.out.println(prosesler);

        System.out.println("Proseslerden birini secin: ");
        int secim = scanner.nextInt();
        scanner.nextLine();

        switch(secim) {
            case 1:
                isciler.isciMelumatlariGoster();
                break;
            case 2:
                System.out.print("MaasArtimini qeyd edin : ");
                int ArtirmaDeyeri = scanner.nextInt();
                scanner.nextLine();
                isciler.MaasiArtir(ArtirmaDeyeri);
                break;
            case 3:
                System.out.println("Kim format atacaq, adinizi daxil edin : ");
                String istifadeci = scanner.nextLine();

                System.out.println("Emeliyyat Sistemini(Operating System) daxil edin: ");
                String emeliyyatSistemi = scanner.nextLine();
                isciler.formatla(emeliyyatSistemi, istifadeci);
                break;
            default:
                System.out.println("Zehmet olmasa qeyd olunan proseslerden birini secin :)");
                break;
        }
    }
}