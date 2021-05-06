package main;
import main.Sorted;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 12, 3, 5, 23, 632, 4, 5, 67, 66, 55, 74, 12, 89,6, 9, 8, 7, 18, 91,2, 77, 14 };
        int[] arr = array;
        if (array.length > 2) {
            array = Sorted.sortArray(array);
        }
        System.out.println("Begin");
        for (int i = 0; i < array.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("End");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
