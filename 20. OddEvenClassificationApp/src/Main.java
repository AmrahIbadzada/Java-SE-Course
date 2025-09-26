import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Daxil edilən ədədlərin tək və ya cüt olduğunu tapaq və ekrana çap edək.
//        Şərt, dövr, massiv, metod ve scanner mövzularından istifadə etməyə çalışacağıq.

        System.out.println("Reqemin Tek veya Cut Oldugunu Tapan Program");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Massivin element sayini daxil edin: ");
        int masssivUzunluq = scanner.nextInt();
        scanner.nextLine();

        int[] reqemler = new int[masssivUzunluq];

        for(int i = 0; i<reqemler.length; i++)
        {
            System.out.println("Massivin " +i+ ". index deyerini daxil edin: ");
            reqemler[i] = scanner.nextInt();
            scanner.nextLine();
        }

        for(int deyer : reqemler)
        {
            TekdiMiCutduMu(deyer);
        }
    }

    public static void TekdiMiCutduMu(int reqem)
    {
        if(reqem%2==0)
        {
            System.out.println("Reqem: " + reqem + " Cutdur");
        }else{
            System.out.println("Reqem: " +reqem+ " Tekdir");
        }
    }

}