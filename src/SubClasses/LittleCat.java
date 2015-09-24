package SubClasses;
public class LittleCat extends Cat{
    private String variableEat;

    public LittleCat(String name, double age, double count, int ratCounter, String variableEat ){
        super (name, age, count, ratCounter);
        setVariableEat(variableEat);
    }

    public LittleCat(LittleCat ob){
        super (ob);
        variableEat = ob.variableEat;
    }

    public String getVariableEat() {
        return variableEat;
    }

    public void setVariableEat(String variableEat) {
        this.variableEat = variableEat;
    }

    public void showInfoBabyCat(){
        System.out.println("Baby cat eat: " + variableEat);
    }
}
