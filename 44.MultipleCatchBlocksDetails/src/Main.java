public class Main {
    public static void main(String[] args) {

        System.out.println("Programa xos geldiniz.");
        System.out.println("*************************");

        // Xetanin Ola bileceyi yerlere try catch bloklarini qoyuruq...


        try {
/*            int[] massiv = {1,2,3,4,5,6};
            System.out.println("Massivin 10-cu index-ni daxil edin... : " + massiv[10]);*/

/*            String a = "k";

            Integer.parseInt(a);*/

            String a = null;

            a.toLowerCase();


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zehmet olmasa kecerli index deyerini daxil edin...");
        }
        catch (RuntimeException e) {
            System.out.println("RuntimeException xetasi yarandi...");
        }
//        catch (NullPointerException e) {
//            System.out.println("NullPointer xetasi yarandi...");
//        }
        /*catch (NullPointerException e) {
            System.out.println("Nullpointer exception xetasi yarandi...");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException xetasi yarandi...");
        }*/
        System.out.println("Program davam edir problem yoxdu");
    }
}