import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // İstifadəçidən şəxsiyyət nömrəsini alır və yoxlama üçün Aze obyektinə ötürür
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****Proqrama Xoş Gəlmisiniz*****");
        System.out.print("Zəhmət olmasa AZE nömrəsini daxil edin: ");
        String daxilEdilenNomre = scanner.nextLine();

        // Aze sinifindən obyekt yaradılır
        Aze azeNomresi = new Aze();
        azeNomresi.setAze(daxilEdilenNomre); // daxil edilmiş nömrə yoxlanmaq üçün göndərilir
    }
}
