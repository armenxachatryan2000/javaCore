package Homework5;

public class ArraySort {
    public static void main(String[] args) {
        int max;
        int min;
        int[] numbers = {43, 55, 5, -9, 0, 12, 65};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    max = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = max;

                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        {
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    max = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = max;

                }
            }
            System.out.print(numbers[i] + " ");


        }
    }
}


