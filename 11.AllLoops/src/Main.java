//26-ci ders
/*public class Main {
    public static void main(String[] args) {
        *//*
        1) For
        2) While
        3) Do-While
        4) Foreach
         *//*

        //For donguse

        //1 den 10-a qeder olan cut reqemleri ekrana yazdir
        //1 den 10-a qeder olan tek reqemleri ekrana yazdir
        //1 den 10-a qeder olan cut reqemleri cemi
        //1 den 10-a qeder olan tek reqemleri cemi

        int toplam = 0;

        for(int i = 1; i<=10; i++)
        {
//            System.out.println(i);

//            if(i%2==0) //cut reqemler
//            {
//                System.out.println("Bu reqemler cutdu: " + i);
//            }

//            if(!(i%2==0))//tek reqemler
//            {
//                System.out.println(i);
//            }
//            if(i%2==1)//tek reqemler
//            {
//                System.out.println("Bu Ededler Tekdi: " + i);
//            }

//            if(i%2==0)//
//            {
//                toplam+=i;
//            }

            if(i%2==1)
            {
                toplam+=i;
            }
        }
        System.out.println("Cavab: " + toplam);

        for(int i = 1; i<=20; i++)
        {
            if(i%2==0)
            {
                System.out.println("Joe");
            }else{
                System.out.println(i);
            }
        }


    }
}*/



/* //27-ci ders while dovru
public class Main {
    public static void main(String[] args) {

        int i=1;

        while(i<=10)
        {
            System.out.println(i);

            i++;
        }


int i=1;

        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }



int i=1;

        while(i<=10)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            i++;
        }



        int i=1;
        int umumicem = 0;

        while(i<=10)
        {
            if(i%2==0)
            {
                umumicem +=i;
            }
            i++;
        }
        System.out.println("Cut ededlerin umumi cemi: " + umumicem);



int i=1;
        int umumicem =0;

        while(i<=10)
        {
            if(i%2==1)
            {
                umumicem +=i;
            }
            i++;
        }
        System.out.println("Tek ededlerin umumi cemi: " + umumicem);


        int i=1;

        while(i<=10)
        {
            if(i%2==0)
            {
                System.out.println("Unknown");
            }else{
                System.out.println(i);
            }
            i++;
        }


    }
}*/


//28,29-cu ders
/*
public class Main {
    public static void main(String[] args) {

 //Break - Continue istifadesi

        int reqemTap =0;

        for(int i=1; i<=10; i++)
        {
            if(i==4)
            {
                reqemTap = i;
                break; //donguden cix
            }
        }
        System.out.println(reqemTap);



        // 1 2 3 4 5 6  (7,8)  9 10

        for(int i=1; i<=10; i++)
        {
            if(i==7 || i==8)
            {
                continue;
            }
        System.out.println(i);
        }
    }
}
*/

