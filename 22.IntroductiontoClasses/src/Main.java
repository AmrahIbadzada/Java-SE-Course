import MyTest.test1;

public class Main {
    public static void main(String[] args) {

//        test student1 = new test();
          test1 student1 = new test1();

        student1.id = 3;
        student1.ad = "Unknown";
        student1.soyAd = "Unk";

        System.out.println("Telebenin Melumatlari");
        System.out.println("ID: " + student1.id);
        System.out.println("Ad: " + student1.ad);
        System.out.println("Soyad: " + student1.soyAd);
    }
}
