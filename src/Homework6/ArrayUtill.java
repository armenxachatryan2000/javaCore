package Homework6;

public class ArrayUtill {
    void maxOfArray(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
                System.out.println(array[i] + " ");
            }
        }
    }
}
