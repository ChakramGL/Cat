import SubClasses.Cat;
import SubClasses.LittleCat;

public class Main {
    public static void main(String[] args) {
        Cat animalObj1 = new Cat("Barsik", 2, 10, 5);
        animalObj1.showInfoAnimal();
        animalObj1.showInfoCat();
        System.out.println("-----------------------------------------------------------------------");
        Cat animalObj2 = new Cat("Markiz", 4, 8, 4);
        animalObj2.showInfoAnimal();
        animalObj2.showInfoCat();
        System.out.println("-----------------------------------------------------------------------");
        LittleCat babyCatObj = new LittleCat ("Murka", 0.1, 0.3, 0, "Fish only");
        babyCatObj.showInfoAnimal();
        babyCatObj.showInfoCat();
        babyCatObj.showInfoBabyCat();
        System.out.println("-----------------------------------------------------------------------");
        Cat animalObj = new Cat ( animalObj1);
        animalObj.showInfoAnimal();
        animalObj.showInfoCat();
        System.out.println("-----------------------------------------------------------------------");
        LittleCat babyCat = new LittleCat( babyCatObj);
        babyCat.showInfoAnimal();
        babyCat.showInfoCat();
        babyCat.showInfoBabyCat();
    }
}