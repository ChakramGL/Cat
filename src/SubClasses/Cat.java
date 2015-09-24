package SubClasses;
import SuperClass.Animal;

public class Cat extends Animal {
    private int ratCounter;

    public Cat(String name, double age, double count, int ratCounter){
        super(name, age, count);
        setRatcounter(ratCounter);
    }
    public Cat (Cat ob){
        super (ob);
        ratCounter = ob.ratCounter;
    }

    public int getRatcounter() {
        return ratCounter;
    }

    public void setRatcounter(int ratCounter) {
        this.ratCounter = ratCounter;
    }

    public  void showInfoCat(){
        System.out.println("Rat count = " + ratCounter);
    }
}
