//public class Main {
//    public static void main(String[] args) {
//        // = sagdaki deyiri sola kocurur
//
//        int say = 12;
//        System.out.println(say);
//    }
//}

//8-ci ders
//public class Main {
//    public static void main(String[] args) {
//
//        // + ve - operatorlari
//
//        int a = 11;
//        int b = 5;
//
//        int cemi = a +b;
//        int ferq = a -b;
//        System.out.println("Ededlerin Cemleri: " + cemi);
//        System.out.println("Ededlerin Ferqleri: " +ferq);
//    }
//}


//9-cu ders
//public class Main {
//    public static void main(String[] args) {
//        // *-vurma ve /-bolme operatorlari
//        int a = 3;
//        int b = 2;
//        int c = 6;
//
//        //parantezler
//        //vurma ve bolme
//        // toplama ve cixma
//        int vurma = a * b;
//        int bolme = a / b;
//        int netice = (a * b)/c;
//
//        System.out.println("Ededlerin Hasili: " + vurma);
//        System.out.println("Ededlerin Bolunmesi: " + bolme);
//        System.out.println("Vurma ve bolme Neticesi: " + netice);
//    }
//}

//10-cu ders
//public class Main {
//    public static void main(String[] args) {
//        // % operatoru (mod alma)
//
//        int a = 10;
//        int b = 3;
//
//        int qaliq = a % b;
//        System.out.println("Qaliq Ededimiz: " + qaliq);
//    }
//}

//11-ci ders
//public class Main {
//    public static void main(String[] args) {
//
//        //artirma : ++  ---> 1 artirmaq ucun istifade olunan operatordu
//        //azatma : --   --->  1 azaltmaq ucun istifade olunan operatordu
//
//        int a = 15;
//        a++;
//
//        int b = 12;
//        b--;
//
//        System.out.println(a);
//        System.out.println(b);
//    }
//}


//12-ci ders
//public class Main {
//    public static void main(String[] args) {
//        // -=
//        // +=
//        // *=
//        // /=
//        // %=
//
//        int a = 12;
//
//        a+= 5; // a = a + 5
//
//        int b = 10;
//        b-= 4; // b = b - 4
//
//        int c = 9;
//        c*= 4; // c = c * 4
//
//        int d = 8;
//        d/= 8; // d = d / 8
//
//        int e = 7;
//        e%= 3; // e = e % 3;
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//
//    }
//}

//13-cu ders
//public class Main {
//    public static void main(String[] args) {
//
//        // Relational Operators
//
//        // == ---> Beraberdir operatoru
//        // != ---> Beraber deyil operatoru
//        // >
//        // <
//        // >=
//        // <=
//
//        int reqem = 5;
//        int reqem1 = 5;
//
//        boolean netice =  reqem == reqem1;
//        boolean netice =  reqem != reqem1;
//        boolean netice = reqem > reqem1;
//        boolean netice = reqem < reqem1;
//        boolean netice = reqem >= reqem1;
//        boolean netice = reqem <= reqem1;
//
//
//        System.out.println(netice);
//
//    }
//}

//14-cu ders
//public class Main {
//    public static void main(String[] args) {
//        /*
//        && ve
//        || veya
//        ! deyil
//        ?: uclu operator (ternary operator)
//         */
//
//        int say1 = 6;
//        int say2 = 3;
//
//        boolean netice = say1> 5 && say2 < 6;
//        System.out.println(netice);
//
//
//
//        int reqem1 = 5;
//        int reqem2 = 2;
//
//        boolean netice1 = reqem1 > 2 || reqem2 < 1;
//        System.out.println(netice1);
//
//
//
//        boolean a = !true;
//        System.out.println(a);
//
//        int eded1 = 5;
//        int eded2 = 3;
//
//        boolean netice2 = !(eded1 > eded2);
//        System.out.println(netice2);
//
//
//
//        int eded3 = 4;
//        int eded4 = 2;
//
////        boolean netice3 = eded3 >4  ? true : false;
//        String netice3 = eded3 > 5 ? "Boyukdur" : "Kicikdir";
//        System.out.println(netice3);
//    }
//}

//15-ci ders
public class Main {
    public static void main(String[] args) {
        //Tooltip - neyin ne ise yaradigi ve aciqlamalari
        //Breakpoint

        int a = 5;
        int b = 10;

        int cem = a + b;
        int netice = (cem/3)*2;

        System.out.println(netice);

    }
}