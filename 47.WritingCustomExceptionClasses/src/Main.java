public class Main {
    public static void main(String[] args) {

        Istifadeci[] istifadeciListi = {new Istifadeci(1L, "Unknown1", "Unk1"),
                new Istifadeci(2L, "Unknown2", "Unk2"),
                new Istifadeci(3L, "Unknown3", "Unk3")};

        try {
            checkEt(istifadeciListi, 3L);
        } catch (IstifadeciNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkEt(Istifadeci[] massiv, Long id) throws IstifadeciNotFoundException {
        boolean varMi = false;
        for (Istifadeci istifadeci : massiv) {
            if (id == istifadeci.getId()) {
                varMi = true;
                System.out.println("Axtarilan Istifadeci Sistemde var");
                System.out.println(istifadeci);
                break;
            }
        }
        if (varMi == false) {
            throw new IstifadeciNotFoundException("Istifadeci Tapilmadi!");
        }
    }
}