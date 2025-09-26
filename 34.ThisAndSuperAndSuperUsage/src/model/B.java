package model;

public class B extends C{

    public int bDeyisen1;
    public int bDeyisen2;

    public B() {
        System.out.println("B sinifinin qurucu metodunun icindeyik.");
    }

    public B(int bDeyisen1) {
        this.bDeyisen1 = bDeyisen1;
    }

    public B(int bDeyisen1, int bDeyisen2) {
        this.bDeyisen1 = bDeyisen1;
        this.bDeyisen2 = bDeyisen2;
    }

    public void bSinifininMetodu()
    {
        System.out.println("B sinifinin icindeki metoddayam.");
    }

}
