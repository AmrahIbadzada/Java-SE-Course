import java.util.Scanner;

public class Numune1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Boy Olcusunu Daxil Edin : ");
        double boy = scanner.nextDouble();

        System.out.print("Cekinizi Daxil Edin : ");
        double ceki = scanner.nextDouble();

        AnnotationInvoker annotationInvoker = new AnnotationInvoker();
        annotationInvoker.write(boy, ceki);

    }
}
