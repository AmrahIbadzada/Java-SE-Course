public class Main {
    public static void main(String[] args) {

        System.out.println("Programa xos geldiniz.");
        System.out.println("*************************");

        // Xetanin Ola bileceyi yerlere try catch bloklarini qoyuruq...


        try {
            int[] massiv = {1,2,3,4,5,6};
            System.out.println("Massivin 10-cu index-ni daxil edin... : " + massiv[2]);

            String a = "k";

            Integer.parseInt(a);

/*            String a = null;

            a.toLowerCase();*/


        } catch (NullPointerException e) {
            System.out.println("NullPointer xetasi yarandi...");
        } catch (Exception e) {
            System.out.println("Zehmet olmasa kecerli index deyerini daxil edin...");
        }
        finally {
            // Her vaxt calisan bloklardir, xeta olub olmamasinin onemi yoxdu
            System.out.println("Finally bloku calisdi...");
        }

        System.out.println("Program davam edir problem yoxdu");
    }
}