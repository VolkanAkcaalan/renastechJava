package staticControlFow;

    public class StaticControlFlow {
        static int i = 10;

        static {
            System.out.println("Another Static method"); //static method
        }

        StaticControlFlow() {
            System.out.println("Merhaba");
            method();
            System.out.println("Class");
        }

        {
            System.out.println("Slaw");
        }

        public static void main(String[] args) {
            new StaticControlFlow();
            StaticControlFlow flow = new StaticControlFlow();
            method();
            System.out.println("Method");
            //System.out.println(i);
        }

        static {
            System.out.println("Static Block"); //static block
        }

        static void method() {
            System.out.println(i);
            //static metohod
        }

        {
            System.out.println("Hello"); //

        }
    }
