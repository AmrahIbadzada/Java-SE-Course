import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Massivin elementlərini istifadəçidən aliriq.
        // Daha sonra massivdəki ədədlərdən hansıların sadə, hansıların isə
        // mürəkkəb olduğunu ayıraraq çap edək.

        System.out.println("Sade Eded Tapma Programina Xos Geldiniz");
        System.out.println("*******************************************");

        int sadeCem= 0; // sade eded olarlarin cemi
        int murekkebCem = 0; //murekkeb eded olanlarin cemi

        String sadeReqemler = "";
        String murekkebReqemler = "";

        boolean sadedirMi = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massivin Element Sayini Daxil Edin: ");
        int massivUzunluq = scanner.nextInt();
        scanner.nextLine();//Giriş buferini təmizlə-yirik

        int[] reqemler = new int[massivUzunluq];

        for(int i = 0; i<reqemler.length; i++)
        {
            System.out.println("Massiv " + i + " indeksini daxil edin: ");
            reqemler[i] = scanner.nextInt();
            scanner.nextLine();
        }
        for(int number : reqemler){
            for(int j=2; j<number; j++)
            {
                if(number%j==0)
                {
                    murekkebCem+=1;
                    murekkebReqemler+=String.valueOf(number)+" ";
                    break;
                }else{
                    sadedirMi = true;
                }
            }
            if(sadedirMi)
            {
                sadeCem+=1;
                sadeReqemler+=String.valueOf(number)+" ";
                sadedirMi =false;
            }
        }

        System.out.println("Sade Ededler Haqqinda Umumi");
        System.out.println("Sade Ededlerin Umumi " + sadeCem + " Bu qederdir ="
                + sadeReqemler);
        System.out.println("*****************************************************************");

        System.out.println("Murekkeb Ededler Haqqinda Umumi");
        System.out.println("Murekkeb Ededlerin Umumi " + murekkebCem + " Bu qederdir =" + murekkebReqemler);
        System.out.println("*****************************************************************");
    }
}