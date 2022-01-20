package Kadir;

public class Car {

    String name;

    public Car(String car) {
        this.name = car;
    }

    public String getCar() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Car b1=new Car("Ferrari");

        System.out.println(b1.getCar());
        b1.setName("Lamborghini");
        System.out.println(b1.getCar());

    }

}