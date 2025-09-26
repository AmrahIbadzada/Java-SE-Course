package model;

public class A extends B{

    // super();
    // 1- en ustte olmali kodlar
    // 2- qurucu metod icinde istifade olunmali


    public int aDeyisen1;

    public int aDeyisen2;

    public A() {
        System.out.println("A sinifinin qurucu metodu icindeyik.");
    }

    public A(int aDeyisen1, int aDeyisen2) {
        super(aDeyisen1, aDeyisen2);
    }

    public void aSinifininMetodu()
    {
        System.out.println("A sinifinin icindeki metoddayiq.");
//        super.bSinifininMetodu(); // ust class mirasi veren sexs
    }
}
