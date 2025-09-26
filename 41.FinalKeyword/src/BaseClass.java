public final class BaseClass {
    // Bir sinif final acar sozu ile qeyd olunarsa
    // bu class- i kimse heckim miras ala bilmez

    private Long id;

    public final void testMetod()
    {
        System.out.println("Test Metod");
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
