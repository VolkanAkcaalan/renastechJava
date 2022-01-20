package En;

public class main {
    public static void main(String[] args) {
        Encapsulation b2=new Encapsulation();
        System.out.println(b2.getB1());
        b2.setB1("1234Volkan");
        System.out.println(b2.getB1());

        Encapsulation b1=new Encapsulation();

        System.out.println(b1.getB1());
        b1.setB1("1234Ahmet");
        System.out.println(b1.getB1());
    }
}
