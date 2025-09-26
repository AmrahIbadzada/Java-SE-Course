public class DatabaseTestImpl<E> implements IDatabase<E>{
    @Override
    public void elaveEt(E clazz) {
        System.out.println("Musteri elave olundu...");
    }

    @Override
    public void sil(E clazz) {
        System.out.println("Musteri silindi...");
    }

    @Override
    public void yenile(E clazz) {
        System.out.println("Musteri yenilendi...");
    }
}
