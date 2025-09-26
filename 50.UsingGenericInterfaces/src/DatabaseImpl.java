public class DatabaseImpl implements IDatabase<Musteri>{

    @Override
    public void elaveEt(Musteri clazz) {
        System.out.println("Musteri elave olundu");
    }

    @Override
    public void sil(Musteri clazz) {
        System.out.println("Musteri silindi");
    }

    @Override
    public void yenile(Musteri clazz) {
        System.out.println("Musteri yenilendi");
    }
}
