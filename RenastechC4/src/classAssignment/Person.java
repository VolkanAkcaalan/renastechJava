package classAssignment;

public class Person {

   /*
    Design a class named Person with fields for holding a person's name, address, and telephone
    number. Write one or more constructors and the appropriate mutator and accessor methods
    for the class's fields.
    Next, design a class named Customer, which extends the Person class. The Customer class
    should have a field for a customer number and a boolean field indicating whether the
    customer wishes to be on a mailing list. Write one or more constructors and the appropriate
    mutator and accessor methods for the class's fields. Demonstrate an object of the Customer
    class in a simple program.


    */

    private String name;
    private String address;
    private long telephone;

    public Person(String name, String address, long telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Person" +
                "\nname='" + name +
                "\naddress='" + address +
                "\ntelephone=" + telephone
                ;
    }
}
