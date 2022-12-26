package Homework;

public class ArrayUtill {
    public static void main(String[] args) {

        int[] array = {5, 8, 36, 1, 2, 89, 6, 57,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        int x = array[0];
        int y = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > y) y = array[i];
            else if (array[i] < x) x = array[i];
        }

        System.out.println(" " + x);
        System.out.print(" " + y);

        System.out.println();
        {
        }

        int[] number = {12, 4, 33, 65, 2, 1, 7, 8, 99};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();


        int mumber = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                if (x != 1) {
                    System.out.print(array[i] + ", ");
                    {

                    }
                }
                System.out.println();
            }


            if (array[i] % 2 == 0) {
                if (x != 0) ;
                System.out.print(array[i] + " ");
            }


        }
        System.out.println();
        {
        }
        int qanak = 0;
        int sum = 0;
        int mijin = 0;
        int[] numbers = {12, 45, 3, 9, 1, 55, 78, 31, 71};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            qanak = array.length;
            mijin = sum / qanak;

        }
        System.out.println(sum);
        System.out.println(qanak);
        System.out.println(mijin);


    }
}

