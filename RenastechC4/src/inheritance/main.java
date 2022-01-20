package inheritance;

public class main {
    public static void main(String[] args) {
        Baba b1= new Baba("Blue");
        System.out.println(b1.toString());

    }

}

    class Dede {

        protected String eyesColor = "Blue";

        public Dede(String eyesColor) {
            this.eyesColor = eyesColor;
        }

        @Override
        public String toString() {
            return "Dede{" +
                    "eyesColor='" + eyesColor + '\'' +
                    '}';
        }
    }
    class Baba extends Dede{


        public Baba(String eyesColor) {
            super(eyesColor);
        }


    }





