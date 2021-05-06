package main;

public interface Sorted_insert {
    public static int[] sortArray(int[] array) {
        int temp = 0;
        for (int i = 1; i < array.length; i++){
            for (int j = i; j > 0 && array[j-1] > array[j]; j--){
                temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
}


// call:
//        if (array.length > 2) {
//            array = Sorted_insert.sortArray(array);
//        }
