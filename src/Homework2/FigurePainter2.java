package Homework2;

public class FigurePainter2 {
    public static void main(String[] args) {
        int x = 5;
        for (int i = 1; i <= x; i++) {
            for (int j = x; j >= i; j--) {
                System.out.print(j + "");
            }

            System.out.println();
        }

            int n = 6;

            int i, j;

            for (i = 1; i <= 6; i++) {

                for (j = 1; j <= 6 - i; j++) {
                    System.out.print(" ");
                }

                for (j = 1; j <= i * 2 - 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            for (i = 6 - 1; i > 0; i--) {

                for (j = 1; j <= 6 - i; j++) {
                    System.out.print(" ");
                }
                for (j = 1; j <= i * 2 - 1; j++) {

                    System.out.print("*");
                }
                System.out.println();


            }

        }
    }










   

    

