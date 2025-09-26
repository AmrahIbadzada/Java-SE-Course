import model.animal;
import model.dog;

public class Main {
    public static void main(String[] args) {

        // Inheritance (Miras alma)

        // Miras almanın ən əsas üstünlüyü – yuxarı (üst) siniflərdə təyin olunmuş metod və dəyişənləri
        // təkrar-təkrar yazmaq məcburiyyətindən bizi azad etməsidir.


        animal animals = new animal();
        animals.myMetod();
        System.out.println("------------");
        dog dogs = new dog();
        dogs.myMetod();


    }
}