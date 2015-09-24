package SuperClass;

public abstract class Animal {
    private double age;
    private String name;
    private double count;

    public  Animal(String name, double age, double count){
        this.name = name;
        this.age = age;
        this.count = count;
    }
    public Animal (Animal ob){
        name = ob.name;
        age = ob.age;
        count = ob.count;
    }


    public double getAge() {
        return age;
    }

    protected String getName() {
        return name;
    }

    protected double getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void showInfoAnimal(){
        System.out.println("Name is " + name + "\nAge = "+ age +  "\nCount = " + count + "kg");
    }

}
