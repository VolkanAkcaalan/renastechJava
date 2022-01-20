package classAssignment;

public class Animals {

    double age;
    String name;
    String color;
    animalTypes animalTypes;

    public Animals(double age, String name, String color, classAssignment.animalTypes animalTypes) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.animalTypes = animalTypes;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public classAssignment.animalTypes getAnimalTypes() {
        return animalTypes;
    }

    public void setAnimalTypes(classAssignment.animalTypes animalTypes) {
        this.animalTypes = animalTypes;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", animalTypes=" + animalTypes +
                '}';
    }

    void eatingVeggie(){
        System.out.println(this.animalTypes + " is eating veggie");

    }

    void eatingMeat(){
        System.out.println(this.animalTypes + " is eating meat");

    }

    void eatingVeggieAndMeat(){
        System.out.println(this.animalTypes + " is eating veggie and meat");

    }
}
