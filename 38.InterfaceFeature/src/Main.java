public class Main {
    public static void main(String[] args) {
/*        IMuhendis komputermuhendisi =
                new KomputerMuhendisi("Unknown","Unk",1,1700, new String[] {"JavaScript", "Python", "C++", "Java"});

        IMuhendis masinmuhendisi =
                new MasinMuhendisi("Unknown1","Unk1",1,1450, new String[] {"C++", "Java"});     */

        KomputerMuhendisi komputermuhendisi =
                new KomputerMuhendisi("Unknown","Unk",1,1700, new String[] {"JavaScript", "Python", "C++", "Java"});

        MasinMuhendisi masinmuhendisi =
                new MasinMuhendisi("Unknown1","Unk1",1,1450,
                        new String[] {"C++", "Java"});

        System.out.println("Komputer Muhendisi");
        muhendisMelumatlariniYazdir(komputermuhendisi);
        System.out.println("--------------------------");
        System.out.println("Masin Muhendisi");
        muhendisMelumatlariniYazdir(masinmuhendisi);

    }

    public static void muhendisMelumatlariniYazdir(KomputerMuhendisi komputerMuhendisi)
    {
        komputerMuhendisi.esgerlikEdildimi(true);
        komputerMuhendisi.melumatiYazdir();
    }

    public static void muhendisMelumatlariniYazdir(MasinMuhendisi masinMuhendisi)
    {
        masinMuhendisi.esgerlikEdildimi(false);
        masinMuhendisi.melumatiYazdir();
    }

    public static void muhendisMelumatlariniYazdir(IMuhendis komputerMuhendisi)
    {
        komputerMuhendisi.esgerlikEdildimi(true);
        komputerMuhendisi.melumatiYazdir();
    }

}