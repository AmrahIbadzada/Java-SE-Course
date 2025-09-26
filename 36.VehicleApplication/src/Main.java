import classlar.Kamaz;
import classlar.Motosiklet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Examples

        Scanner scanner = new Scanner(System.in);


        System.out.println("***Masin Programina Xosgeldiniz***");
        System.out.println("Zehmet olmasa bir secim edin: ");
        String giris = "1-Kamaz\n"
                + "2-Motosiklet";

        System.out.println(giris);

        int secim = scanner.nextInt();
        if(secim ==1)
        {
            //Kamaz

            int yolNeqliyyatCezaUmumi = 850;
            Kamaz kamaz = new Kamaz(1L,"Kamaz","Yasil",10000,4,"Ford","X", yolNeqliyyatCezaUmumi);
            System.out.println("1 - Kamaz'in melumatlarini goster\n"
                            + "2- Yol Neqliyyat Cezasini ode");
            int kamazSecim = scanner.nextInt();
            if(kamazSecim ==1)
            {
                kamaz.masinMelumatlariniGoster();
            }else if (kamazSecim==2)
            {
                kamaz.yolNeqliyyatCezaOde(yolNeqliyyatCezaUmumi);
            }else {
                System.out.println("Zehmet olmasa kamaz ucun uygun olan reqem daxil edin!");
            }


            
        }else if (secim==2)
        {
            //Motosiklet
            int yolNeqliyyatCezasiUmumi = 500;
            System.out.println("1 - Motosiklet'in melumatlarini goster\n"
                    + "2- Yol Neqliyyat Cezasini ode");
            Motosiklet motosiklet = new Motosiklet(2L,"Motosiklet1","Goy",7500,2,"Unk","X", yolNeqliyyatCezasiUmumi);
            int motosikletSecim = scanner.nextInt();
            if(motosikletSecim==1)
            {
                motosiklet.masinMelumatlariniGoster();
            }else if(motosikletSecim==2)
            {
                motosiklet.yolNeqliyyatCezaOde(yolNeqliyyatCezasiUmumi);
            }else {
                System.out.println("Zehmet olmasa motosiklet ucun uygun deyeri daxil edin!");

            }

        }else {
            //uygunsuz secim
            System.out.println("Zehmet olmasa qeyd olunan araliqda deyer daxil edin!");

        }

    }
}