package main;

public interface Sorted_merge {
    public static int[] sortArray(int[] array) {
        if (array == null) {
            return null;
        }
        int length_arr = array.length / 2;

        if (array.length < 2) {
            return array;
        }
        if (array.length % 2 != 0){
            length_arr += 1;
        }
        int[] arrayR = new int[length_arr];
        int[] arrayL = new int[array.length / 2];
//        System.out.print("\n");
//        System.out.print("Left arr: ");
        for (int i = 0; i < array.length / 2; i++) {
            arrayL[i] = array[i];
//            System.out.print(arrayL[i] + " ");
        }
//        System.out.print("\n");
//        System.out.print("Right arr: ");
            for (int i = array.length / 2; i < array.length; i++) {
                arrayR[i - array.length / 2] = array[i];
//                System.out.print(arrayR[i - array.length / 2] + " ");
            }
        arrayL = sortArray(arrayL);
        arrayR = sortArray(arrayR);

//        System.out.print("\n");
        return mergeArray(arrayL, arrayR);
    }
    

    public static int[] mergeArray(int[] arrayL, int[] arrayR) {

        int[] arrayC = new int[arrayL.length + arrayR.length];
        int posL = 0, posR = 0;

        for (int i = 0; i < arrayC.length; i++) {
            if (posL < arrayL.length && posR < arrayR.length) {
                if (arrayL[posL] < arrayR[posR]) {
                    arrayC[i] = arrayL[posL];
                    posL++;
                } else {
                    arrayC[i] = arrayR[posR];
                    posR++;
                }
            } else if (posL == arrayL.length && posR < arrayR.length) {
                arrayC[i] = arrayR[posR];
                posR++;
            }
            else if (posL < arrayL.length && posR == arrayR.length) {
                arrayC[i] = arrayL[posL];
                posL++;
            }else{
                arrayC[i] = 0;
            }
        }
        return arrayC;
    }
}
