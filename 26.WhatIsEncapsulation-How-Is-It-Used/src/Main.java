import Encmodel.Test;

public class Main {
    public static void main(String[] args) {

        Test isciler = new Test();

        isciler.setId(15L);
        isciler.setMaas(7500);

        System.out.println("Calisan id-si : " + isciler.getId());
        System.out.println("Maas : " + isciler.getMaas());

        //deyiseni private ile gizledirik
        //set metodu ile elaqe qurub deyer elave etdik
        //get metodundan istifade ederek deyerine catdiq

    }
}