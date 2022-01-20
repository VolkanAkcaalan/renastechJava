package classAssignment;

public class Customer extends Person{

    /*
    Next, design a class named Customer, which extends the Person class. The Customer class
    should have a field for a customer number and a boolean field indicating whether the
    customer wishes to be on a mailing list. Write one or more constructors and the appropriate
    mutator and accessor methods for the class's fields. Demonstrate an object of the Customer
    class in a simple program.




     */

    private long CustomerNumber;
    private boolean MailingList= true;

    public Customer(String name, String address, long telephone, long customerNumber, boolean mailingList) {
        super(name, address, telephone);
        CustomerNumber = customerNumber;
        MailingList = mailingList;
    }

    public long getCustomerNumber() {
        return CustomerNumber;
    }

    public void setCustomerNumber(long customerNumber) {
        CustomerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return MailingList;
    }

    public void setMailingList(boolean mailingList) {
        MailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCustomer" +
                "\nCustomerNumber=" + CustomerNumber +
                "\nMailingList=" + MailingList ;
    }
}
