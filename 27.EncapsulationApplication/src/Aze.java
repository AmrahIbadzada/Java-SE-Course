import java.util.Random;

public class Aze {
    // Şəxsiyyət məlumatları üçün dəyişənlər
    private Long id;                    // Unikal identifikator üçün dəyişən
    private String dogulduguYer;       // Şəxsin doğulduğu yer (hazırda istifadə olunmur)
    private String aze;                // İstifadəçinin daxil etdiyi AZE nömrəsi

    public Long getId() {
        return id;                    // id dəyişəninin dəyərini qaytarır
    }

    public void setId(Long id) {
        this.id = id;                 // id dəyişəninə dəyər təyin edir
    }

    public String getDogulduguYer() {
        return dogulduguYer;          // dogulduguYer dəyişəninin dəyərini qaytarır
    }

    public void setDogulduguYer(String dogulduguYer) {
        this.dogulduguYer = dogulduguYer;  // dogulduguYer dəyişəninə dəyər təyin edir
    }

    public String getAze() {
        return aze;                   // aze dəyişəninin dəyərini qaytarır
    }

    // AZE nömrəsini yoxlamaq üçün dəyişən
    boolean yoxlama = true;           // Daxil edilən nömrənin düzgünlüyünü saxlamaq üçün istifadə olunur

    // Bu metod daxil edilən nömrənin yalnız 8 rəqəmdən ibarət olub-olmadığını yoxlayır
    public void setAze(String aze) {
        if (aze.length() == 8) {      // Əgər daxil edilən nömrənin uzunluğu 8-dirsə
            yoxlama = true;           // Yoxlama əvvəlcə doğrudur hesab edilir

            // Hər bir simvolu dövr ilə yoxlayırıq
            for (int i = 0; i < aze.length(); i++) {
                char simvol = aze.charAt(i);       // Simvolu götürürük
                if (!Character.isDigit(simvol)) {  // Əgər simvol rəqəm deyilsə
                    yoxlama = false;               // Yoxlama səhv olur
                    break;                        // Dövrü dayandırırıq
                }
            }

            if (yoxlama) {                          // Əgər bütün simvollar rəqəmdirsə
                Random random = new Random();      // Random obyektini yaradırıq
                int tesdiqKodu = random.nextInt(100);  // 0-99 arası təsadüfi ədəd seçirik
                this.aze = aze;                    // Daxil edilən nömrəni saxlayırıq
                neticeYazdir("Tesdiq kodunuz: " + tesdiqKodu);  // Təsdiq kodunu ekrana çap edirik
            } else {
                neticeYazdir("Zehmet olmasa yalniz reqemlerden ibaret ededi daxil edin!");  // Səhv mesajı göstərilir
            }

        } else {    // Əgər uzunluq 8 deyil
            // Uzunluq səhvdirsə, daxil edilən simvolların hamısı rəqəmdirmi yoxlayırıq
            boolean yalnizReqemdir = true;

            // Hər simvolu yoxlayırıq
            for (int i = 0; i < aze.length(); i++) {
                if (!Character.isDigit(aze.charAt(i))) {  // Simvol rəqəm deyilsə
                    yalnizReqemdir = false;                // Dəyişəni yalnizReqemdir = false edir
                    break;                                // Dövrü dayandırırıq
                }
            }

            if (!yalnizReqemdir) {
                // Uzunluq səhvdir və daxil edilən simvollarda rəqəm olmayan simvol var
                neticeYazdir("Zehmet olmasa yalniz reqemlerden ibaret ededi daxil edin!"); // Səhv mesajı
            } else {
                // Uzunluq səhvdir amma daxil edilən bütün simvollar rəqəmdir
                neticeYazdir("AZE nomresi 8 reqemli olmalidir!"); // Uzunluqla bağlı xəbərdarlıq
            }
        }
    }

    // Bu metod nəticəni ekrana çap edir
    public void neticeYazdir(String netice) {
        System.out.println(netice);     // Konsola nəticə yazdırır
    }
}

