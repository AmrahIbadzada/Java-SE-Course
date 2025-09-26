import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ys1(1-ci yarımsemestr) %30 -- ys2(2-ci yarımsemestr) %30 --final %40
        // Imtahani kecme qiymeti 60

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adinizi Daxil edin: ");
        String ad = scanner.nextLine();

        System.out.println("Soyadinizi Daxil Edin: ");
        String soyad = scanner.nextLine();

        System.out.println("Dersi daxil edin: ");
        String dersAdi = scanner.nextLine();

        System.out.println("1-ci Yarımsemestr ucun aldiginiz qiymeti daxil edin: ");
        double ys1 = scanner.nextDouble();

        System.out.println("2-ci Yarımsemestr ucun aldiginiz qiymeti daxil edin: ");
        double ys2 = scanner.nextDouble();

        System.out.println("Final qiymetinizi daxil edin: ");
        double finalQiymet = scanner.nextDouble();

        double netice = (ys1*0.3) + (ys2*0.3) + (finalQiymet*0.4);

        if(netice>=60)
        {
            System.out.println(ad + " " + soyad + " adli telebe " + dersAdi +
                    " dersinden " + netice + " ortalama ile kecmisdir: " );
        }
        else {
            System.out.println(" Dersden kecmediniz :/");
        }

    }
}