package classAssignment;

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        if(width<0) {
            return width = 0;
        }else return width;

    }

    public double getLength() {
        if(length<0){
            return length=0;
        }
        else return length;

    }

    public double getArea(){

        return getLength() * getWidth();
    }

    @Override
    public String toString() {
        return "Rectangle" +
                "\nwidth=" + getWidth() +
                "\nlength=" + getLength() ;
    }
}
