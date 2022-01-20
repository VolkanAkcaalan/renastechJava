package En;

public class Encapsulation {

    private String b1="Ogun";

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {

        if(b1.contains("1234"))
        this.b1 = b1;
    }
}
