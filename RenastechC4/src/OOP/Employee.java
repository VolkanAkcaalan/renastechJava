package OOP;

public class Employee {
    String name;
    int age;
    String occupation;
    double salary;

    public Employee(String name,int age, String occupation, double salary){
        this.name=name;
        this.age=age;
        this.occupation=occupation;
        this.salary=salary;
    }
    public void setName(){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String print(){
        return ("Name is " +this.getName() +
                "\n"+"Age is : "+this.getAge() +
                "\nOccupation is : "+this.getOccupation()+
                "\nSalary is : "+this.getSalary()+"$$$");
    }
}