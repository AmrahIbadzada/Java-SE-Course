import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Heftenin gunleri ...

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zehmet Olmasa bir reqem daxil edin: ");
        int say = scanner.nextInt();

        switch(say)
        {
            case 1 :
                System.out.println("Bazar Ertersi");
                break;
            case  2 :
                System.out.println("Cersenbe Axsami");
                break;
            case 3 :
                System.out.println("Cersenbe");
                break;
            case 4 :
                System.out.println("Cume Axsami");
                break;
            case 5 :
                System.out.println("Cume");
                break;
            case 6 :
                System.out.println("Senbe");
                break;
            case 7 :
                System.out.println("Bazar");
                break;
            default:
                System.out.println("Heftede 7 gun var yazdiginiz gun movcud deyil");

        }
    }
}