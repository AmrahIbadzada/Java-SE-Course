import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1-throw ( atmak, firlatmak)
        // 2-throws
        // 3-unchecked, checked ferqi

/*        Scanner scanner = new Scanner(System.in);

        System.out.print("Zehmet olmasa bir reqem daxil edin : ");
        int sayi = scanner.nextInt();
        check(sayi);

    }

    public static void check(int sayi)
    {
        if(sayi > 5)
        {
            throw new NumberFormatException(); //unchecked

        }
    }
}   */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zehmet olmasa bir reqem daxil edin : ");
        int sayi = scanner.nextInt();
/*        try {
            check(sayi);
        } catch (NumberFormatException e) {
            System.out.println("Numberformat exception tapildi...");
        }
        System.out.println("Program calismaya davam edir...");*/
        try {
            check(sayi);
        } catch (Exception e) {
            System.out.println("Exception sinifi xetani tapdi...");
        }
        System.out.println("Program calismaya davam edir...");
    }

    public static void check(int sayi) throws Exception {
        if (sayi > 5) {
//            throw new NumberFormatException(); //unchecked

            throw new Exception();
        }
    }
}