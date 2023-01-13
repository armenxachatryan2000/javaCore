package Homework6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();

        System.out.println(myBox.depth);
        System.out.println(myBox.height);
        System.out.println(myBox.width);
        System.out.println();
        {
        }

        myBox.depth = 4.5;
        myBox.height = 3;
        myBox.width = 8.9;
        System.out.println(myBox.depth);
        System.out.println(myBox.height);
        System.out.println(myBox.width);

    }
}
