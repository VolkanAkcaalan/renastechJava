import java.util.Scanner;

public class sadfajs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entered row number");
        int c = scan.nextInt();
        System.out.println("Entered column number");
        int d = scan.nextInt();
        System.out.println("Entered all elements");
        int arr[][] = new int[c][d];


        for (int n = 0; n < arr.length; n++) {

            for (int m = 0; m < arr[n].length; m++) {

                arr[n][m] = scan.nextInt();

            }
            System.out.println();
        }


        for (int n = 0; n < arr.length; n++) {
            int sumRow = 0;
            for (int m = 0; m < arr[n].length; m++) {
                sumRow += arr[n][m];


            }
            System.out.println("The Sum of the " + (n+1) + " row : " + sumRow);


        }

        for (int n = 0; n < arr[0].length; n++) {
            int sumCol = 0;
            for (int m = 0; m < arr.length; m++) {
                sumCol += arr[m][n];
            }

            System.out.println("The Sum of the " + (n+1) + " column : " + sumCol);
        }
    }
}

