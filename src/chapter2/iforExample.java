package chapter2;

public class iforExample {
    public static void main(String[] args) {

        int x = 5;
        System.out.println("* *");

        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= i; k++)
                {
                    System.out.print("*");
                }
                System.out.println();


            }
        }
    }



