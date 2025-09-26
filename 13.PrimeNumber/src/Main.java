import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Sade eded tapma programi
        // 1 ve ozune bolunnen reqemler 7,11,17,19,23

        // 2-3-4-5-6    <----7

        Scanner scanner = new Scanner(System.in);
        boolean  sadedirMi = false;

        System.out.println("*********Sade Ededleri Tapma Programina Xosgeldiz*********");
        System.out.print("Zehmet olmasa bir reqem daxil edin: ");
        int sayi = scanner.nextInt();

        for(int i=2; i<sayi; i++)
        {
            if(sayi%i==0)
            {
                sadedirMi = false;
                break;
            }else{
                sadedirMi = true;
            }
        }

        if(sadedirMi)
        {
            System.out.println("Daxil Etdiyiniz " + sayi + " reqemi sadedir");
        }else {
            System.out.println("Daxil Etdiyiniz " + sayi + " reqemi sade deyildir");
        }
    }
}