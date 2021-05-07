package main;

public interface Sorted_shell {
    public static int [] sortArray(int[] array) {
        int h = 1;
        while (h*3 < array.length)
            h = h * 3 + 1;

        while(h >= 1) {
            array = hSort(array, h);
            h = h/3;
        }
        return array;
    }

    private static int[] hSort(int[] array, int h) {
        int temp = 0;
        int length = array.length;
        for (int i = h; i < length; i++) {
            for (int j = i; j >= h; j = j - h) {
                if (array[j] < array[j - h]){
                    temp = array[j];
                    array[j] = array[j-h];
                    array[j-h] = temp;
                }
                else
                    break;
            }
        }
        return array;
    }
}
