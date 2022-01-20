package Lovesh.day10;

public class NestedForLoop {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++)
        {

            for (int j=5; j>=i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println(" ");
        for (int i=-1; i>=-5; i-- ){
            for (int j=-5; j<=i; j++)

            System.out.print(i*2);
            System.out.println();
        }




    }
}
