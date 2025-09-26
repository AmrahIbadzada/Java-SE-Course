import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Istifadeciden deyer nece alinir
        //Scanner

        /*
        nextLine() -> String
        nextInt() -> Integer
        nextByte() -> Byte
        nextFloat -> Float
        nextDouble -> Double
         */

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Adinizi daxil edin: ");
//
//        String ad = scanner.nextLine();
//
//        System.out.println("Soyadinizi daxil edin: ");
//
//        String soyad = scanner.nextLine();
//
//        System.out.println("Adiniz ve Soyadiniz: " + ad +" "+ soyad);


//        System.out.println("Yasinizi Daxil Edin: ");
//
//        int yas =  scanner.nextInt();
//
//        System.out.println("Yasiniz: " + yas);

        System.out.println("Cekinizi Daxil Edin: ");

        double ceki = scanner.nextDouble();

        System.out.println("Cekiniz: " + ceki );


    }
}