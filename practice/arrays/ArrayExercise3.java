package practice.arrays;

import java.util.concurrent.LinkedBlockingDeque;

public class ArrayExercise3 {
    /**
     * Duplicate Number
     * Write a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
     *
     * Example
     *
     * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
     * Output : [1, 2, 3, 4, 5]
     */


    public static void main(String agrs[]){
        int array[] =  {1,2,3,3,4,4,5,7,8,9};
        int uniqueArray[] = new int[array.length];

        int n = array.length;
        int index =0;

        boolean duplicateFlag = false;
        for (int i=0; i<array.length; i++) {        //For Main element
            duplicateFlag = false;
            for(int j=0; j<array.length; j++){      //Iterate Unique element
                if(array[i] == uniqueArray[j]){
                    duplicateFlag = true;
                    System.out.println("Duplicate Found" + array[i] );
                    break;
                }
            }

            if(!duplicateFlag){
                uniqueArray[index] = array[i];
                System.out.println("Added to unique value : " + array[i] + " in index : " + index);
                index++;
            }
        }



        System.out.println("The unique Array  is "+ uniqueArray.length);
    }

/*
public class Exercise {
    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        return Arrays.copyOf(uniqueArray, index);
    }

}
 */
}
