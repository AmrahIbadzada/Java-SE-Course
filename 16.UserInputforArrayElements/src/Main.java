import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Massivin elementlərini istifadəçidən alma

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massivin nece elementi olsun: ");
        int massivUzunluq = scanner.nextInt();
        scanner.nextLine(); //enter boslugunu aradan qaldirir

        String[] adlar = new String[massivUzunluq];

        for(int i = 0; i<adlar.length; i++)
        {
            System.out.println("Massivin " + i + ". index deyerini daxil edin: ");
            adlar[i] = scanner.nextLine();

        }
        System.out.println("******Massiv Elementleri******");
        for(int i = 0; i<adlar.length; i++)
        {
            System.out.println(adlar[i]);
        }
    }
}