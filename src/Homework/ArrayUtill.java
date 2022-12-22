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


    }
}



