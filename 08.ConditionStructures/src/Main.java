public class Main {
    public static void main(String[] args) {
//        /*
//            Product
//            12 kilo a(leblebi), kilosu 3.5 M
//            25 kilo b(findiq), kilosu 15.7 M
//            40 kilo c(badam), kilosu 22M
//
//            Product saterken,
//            ---> productA 50% cox satilib
//            ---> productB 40% cox
//            ---> productC 60% cox satilmisdir
//
//            umumi borc tutari : 500 M
//            qazandigimiz pul 500 M den yuxaridisa borcu odeyebilerik deyilse yox
//         */
//
//        //qiymetler
        double productA = 3.5;
        double productB =  15.7;
        double productC = 22;

        double umumiQiymet = (productA*12) + (productB*25) + (productC*40);

        double satisTutar = ((productA*1.5)*12) + ((productB*1.4)*25) + ((productC*1.6)*40);

        double qazancTutar = satisTutar - umumiQiymet;

        if (qazancTutar > 500)
        {
            System.out.println("Borcu odeyebilirsiniz: ))");
        }
        else {
            System.out.println("Borcu odemek ucun yeterli qeder pulunuz yoxdu. " +
                    "Zehmet olmasa sonra sinayin");
        }
        System.out.println("Umumi Tutari: " + umumiQiymet);
        System.out.println("Satis Tutari: " +satisTutar);
        System.out.println("Qazanc Tutari: " + qazancTutar);
    }
}

