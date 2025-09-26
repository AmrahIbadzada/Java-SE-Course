public class Main {
    public static void main(String[] args) {

        System.out.println("Programa Xosgeldiniz");
        System.out.println("************");



        //Xetanin yarana bileceyi yere try catch bloklarini daxil edirik.

        try {
            int[] massiv = {1,2,3,4,5,6};
            System.out.println("Massivin 10-cu index deyeri : " + massiv[10]); //xeta verecek
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zehmet olmasa uygun bir index deyerini daxil edin!");
        }

        System.out.println("Program hal hazirda isleyir problem yoxdu.");
    }
}