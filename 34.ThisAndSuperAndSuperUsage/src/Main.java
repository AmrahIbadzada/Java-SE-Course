import model.A;

public class Main {
    public static void main(String[] args) {

        /*
        1.Bir sinfi yüzlərlə başqa sinif miras ala bilər, lakin bir sinif yalnız bir sinifdən miras ala bilər.
        (Çünki Java-da çoxlu miras (multiple inheritance) birbaşa dəstəklənmir, yalnız tək miras mümkündür.)


        2.Protected giriş müəyyənləşdiricisi nədir?
        Java-da protected dəyişən və metodlara yalnız eyni paketdəki siniflər və ya
        həmin sinifdən törəyən alt siniflər tərəfindən giriş imkanı yaradır.


        3.Qurucu metodların (constructor) işləmə prinsipi necədir?
        Constructor — obyekt yaradılarkən avtomatik işləyən xüsusi metoddur. Bu metod sinif adı ilə eyni adda olur və `return type` (geri dönüş tipi) olmur.
        Constructor obyektə ilkin dəyərlər təyin etmək üçün istifadə olunur.


            4.this, super, super()--> sözlərinin istifadəsi (constructor overloading zamanı çağırılma)

        * this – cari sinifin dəyişən və metodlarına istinad edir.
        * super – parent (üst) sinifə istinad edir.
        * super() – parent sinifin constructor metodunu çağırmaq üçün istifadə olunur.
          Constructor overloading zamanı `this()` istifadə olunaraq eyni sinifin başqa constructor-u çağırıla bilər.


        5.Metodun üstələnməsi (override) anlayışı nədir?
        Override — alt sinifdə parent sinifin metodunu eyni imza ilə təkrar yazmaqdır. Bu, alt sinifin öz versiyasını təqdim etməsinə imkan verir.
        @Override anotasiyası ilə işarələnir.
         */

        A aObyekti  = new A(5,8);
        System.out.println("B deyiseni1 : " + aObyekti.bDeyisen1);
        System.out.println("B deyiseni2 : " + aObyekti.bDeyisen2);
    }
}