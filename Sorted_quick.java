package main;

public class Sorted_quick implements Sorted{
    public static int [] sortArray(int[] array) {
        int currentEl = array[array.length/2];
        int posM = 0;
        int posL = 0;
        int[] arrayMore = new int[array.length];
        int[] arrayLess = new int[array.length];
        int[] arrayCurrent = new int[1];


        if (array.length < 2){
            return array;
        }

        for (int i = 0; i < array.length; i++){
            if (array.length/2 == i) {
                arrayCurrent[0] = array[array.length/2];
            } else {
                if (array[i] <= currentEl) {
                    arrayLess[posL] = array[i];
                    posL++;
                }
                if (array[i] > currentEl) {
                    arrayMore[posM] = array[i];
                    posM++;
                }
            }
        }

        int k = 0;
        int[] arrM = new int[posM];
        int[] arrL = new int[posL];
        while ( k < posL && arrayLess != null){
            arrL[k] = arrayLess[k];
            k++;
        }
        k = 0;
        while (k < posM && arrayMore != null){
            arrM[k] = arrayMore[k];
            k++;
        }

        if (arrL.length == 0){
            arrayLess = arrL;
        }else{
            arrayLess = sortArray(arrL);
        }
        
        if (arrM.length == 0){
            arrayMore = arrM;
        }else{
            arrayMore = sortArray(arrM);
        }

        array = mergeArray(arrayLess, arrayMore, arrayCurrent);
        return array;
    }

    public static int [] mergeArray(int[] arrayL,int[] arrayM, int[] arrayCur){
        int[] array = new int[arrayL.length + arrayM.length + arrayCur.length];
        int posL = 0;
        int posM = 0;
        int posC = 0;
        for (int i = 0; i<array.length; i++){
            if (posL < arrayL.length) {
                array[i] = arrayL[posL];
                posL++;
            }
            else if(posL == arrayL.length && posC != 1){
                array[i] = arrayCur[posC];
                posC++;
            }
            else if(posC == 1){
                array[i] = arrayM[posM];
                posM++;
            }
        }
        return array;
    }
}
