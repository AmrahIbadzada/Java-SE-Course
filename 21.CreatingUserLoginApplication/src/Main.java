import java.util.Scanner;

public class Main {
    // Hesabın aktiv olub-olmadığını göstərir (true = aktiv, false = bloklanıb)
    static boolean aktiv = true;

    // Maksimum giriş cəhdlərinin sayı (3 dəfə səhv edə bilər)
    static int girisSayi = 3;

    public static void main(String[] args) {
        // İstifadəçidən məlumat almaq üçün Scanner obyektini yaradırıq
        Scanner scanner = new Scanner(System.in);

        // Əgər hesab aktivdirsə, giriş prosesini başlayırıq
        if (aktiv) {
            // İstifadəçi hələ giriş haqqını itirməyib (girisSayi > 0) olduğu müddətcə davam et
            while (girisSayi > 0) {
                System.out.print("Istifadeci adinizi daxil edin: ");
                String username = scanner.nextLine();
                // İstifadəçi adını oxuyur

                System.out.print("Sifrenizi daxil edin: ");
                String password = scanner.nextLine();
                // İstifadəçinin şifrəsini oxuyur

                // Giriş məlumatlarını yoxlayan metod çağırılır
                boolean netice = login(username, password);

                if (netice) {
                    // Əgər istifadəçi adı və şifrə doğru olsa
                    System.out.println("Ugurla sisteme daxil oldunuz :).");
                    break; // Döngüdən çıxır, proqram davam edir
                } else {
                    // Əks halda, səhv giriş olduqda giriş haqları 1 azalır
                    girisSayi--;

                    // Əgər hələ giriş haqqı qalıbsa, xəbərdarlıq mesajı göstər
                    if (girisSayi > 0) {
                        System.out.println("Istifadeci adi ve ya sifre yanlisdir. Qalan cehd sayi: " + girisSayi);
                    }
                }
            }

            // Əgər giriş haqqı tamamilə bitibsə (girisSayi == 0), hesab bloklanır
            if (girisSayi == 0) {
                aktiv = false; // Hesabı deaktiv edir
                System.out.println("Hesabiniz bloklanmisdir.");
            }
        } else {
            // Əgər hesab əvvəldən bloklanmışsa, bu mesaj göstərilir
            System.out.println("Hesab aktiv deyil, zehmet olmasa adminle elaqe saxlayin.");
        }
    }

    // İstifadəçi adı və şifrəni yoxlayan metod
    public static boolean login(String username, String password) {
        // username və password dəqiq uyğun olmalıdır (böyük-kiçik hərf fərqi nəzərə alınır)
        return username.equals("Unknown") && password.equals("123");
    }
}




/*import java.util.Scanner;

public class Main {
    // Hesabin aktiv olub olmadigini saxlayan dəyişən
    static boolean aktiv = true;

    // İstifadəçiyə verilən ümumi giriş haqlarının sayı
    static int girisSayi = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Əgər hesab aktiv deyilsə, istifadəçiyə məlumat verilir və proqramdan çıxılır
        if (!aktiv) {
            System.out.println("Hesab aktiv deyildir, zehmet olmasa dogru hesabla login edin!");
            return;
        }

        // İstifadəçi səhv giriş etdiyi müddətdə və giriş haqları bitmədikcə dövr davam edir
        while (girisSayi > 0) {
            // İstifadəçidən istifadəçi adı alınır
            System.out.print("User Adinizi Daxil Edin: ");
            String username = scanner.nextLine();

            // İstifadəçidən parol alınır
            System.out.print("Parolunuzu Daxil Edin: ");
            String password = scanner.nextLine();

            // Giriş məlumatları yoxlanılır
            boolean netice = login(username, password);

            if (netice) {
                // Əgər login uğurludursa, uğurlu giriş mesajı verilir və proqramdan çıxılır
                System.out.println("Hesaba Ugurlu sekilde giris elediz :)");
                return;
            } else {
                // Yanlış giriş halında giriş haqları 1 azalır
                girisSayi--;
                System.out.println("User adi ve parolu yanlisdir.");

                // Əgər giriş haqları bitibsə, hesab deaktiv edilir və mesaj verilir
                if (girisSayi == 0) {
                    aktiv = false;
                    System.out.println("Hesabiniz kecici olaraq bloklandi");
                } else {
                    // Qalan giriş haqları göstərilir
                    System.out.println("Qalan cehd sayi: " + girisSayi);
                }
            }
        }
    }

    // Bu metod daxil olunan istifadəçi adı və parolu düzgün olub olmadığını yoxlayır
    public static boolean login(String username, String password) {
        // Doğru məlumat: username = "Unknown", password = "123"
        return username.equals("Unknown") && password.equals("123");
    }
}*/


