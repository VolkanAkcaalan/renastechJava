package classAssignment;

public class PreferredCustomer extends Customer{

    /*
    A retail store has a preferred customer plan where customers can earn discounts on all their
    purchases. The amount of a customer's discount is determined by the amount of the cus-
    tomer's cumulative purchases in the store as follows:
    When a preferred customer spends $500, he or she gets a 5 percent discount on all
    future purchases.
    When a preferred customer spends $1,000, he or she gets a 6 percent discount on all
    future purchases.
    When a preferred customer spends $1,500, he or she gets a 7 percent discount on all
    future purchases.
    When a preferred customer spends $2,000 or more, he or she gets a 10 percent discount
    on all future purchases.
    Design a class named PreferredCustomer, which extends the Customer class you created
    in Challenge 1. The PreferredCustomer class should have fields for the
    amount of the customer's purchases and the customer's discount level. Write one or more
    constructors and the appropriate mutator and accessor methods for the class's fields. Dem-
    onstrate the class in a single program.




     */

    private double purchase;
    private double DiscountLevel;

    public PreferredCustomer(String name, String address, long telephone, long customerNumber, boolean mailingList, double purchase) {
        super(name, address, telephone, customerNumber, mailingList);
        this.purchase = purchase;
    }

    public double getPurchase() {
        return purchase;
    }

    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }

    public void setDiscountLevel(double discountLevel) {
        DiscountLevel = discountLevel;
    }

    public double getDiscountLevel() {
        if(purchase>=500 && purchase <1000){

            setDiscountLevel(5);
        }
        else if(purchase>=1000 && purchase<1500){

            setDiscountLevel(6);
        }
        else if(purchase>=1500 && purchase<2000){

            setDiscountLevel(7);
        }
        else if(purchase>=2000)
            setDiscountLevel(10);

        return DiscountLevel;

    }
    public double total(){
        return purchase=purchase-(purchase*getDiscountLevel()/100);
    }

    @Override
    public String toString() {
        return super.toString() + "\nPreferredCustomer" +
                "\npurchase = " + purchase +
                "\nDiscountLevel = " + getDiscountLevel()+
                "\nTotal including discount : " +total()
                ;
    }
}
