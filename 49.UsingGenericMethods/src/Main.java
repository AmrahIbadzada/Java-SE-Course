public class Main {
    public static void main(String[] args) {

        //GENERIC METHOD

        Integer[] intMassiv = {1, 2, 3, 4, 5, 6};

        String[] stringMassiv = {"Unknown", "Unknown1", "Unknown2", "Unknown3"};

        Double[] doubleMassiv = {12.3, 56.6, 62.1, 15.3};

        System.out.println("Integer Massiv");
        System.out.println("------------");
        yazdir(intMassiv);

        System.out.println("String Massiv");
        System.out.println("------------");
        yazdir(stringMassiv);

        System.out.println("Double Massiv");
        System.out.println("------------");
        yazdir(doubleMassiv);
    }

/*    public static void yazdir(Integer[] massiv) {
        for (Integer deyer : massiv) {
            System.out.println(deyer);
        }
    }

    public static void yazdir(String[] massiv) {
        for (String deyer : massiv) {
            System.out.println(deyer);
        }
    }

    public static void yazdir(Double[] massiv) {
        for (Double deyer : massiv) {
            System.out.println(deyer);
        }
    }*/

    public static <T> void yazdir(T[] massiv) //generic method
    {
        for (T deyer : massiv) {
            System.out.println(deyer);
        }
    }
}