package practice.arrays;

public class ArrayExercise1 {
    /**
     * Problem
     * Given an array, write a function to get first, second best scores from the array and return it in new array.
     *     * Array may contain duplicates.
     * Example
     * * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
     * firstSecond(myArray) // {90, 87}
     */


    public static void main(String agrs[]){
        int myArray[] =  {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

        int first=myArray[0];
        int second=0;

        for(int i=1; i<myArray.length; i++){
                if (first > myArray[i]){
                    if(second < myArray[i]){
                        second=myArray[i];
                    }
                } else {
                    second=first;
                    first = myArray[i];
                }
        }

        System.out.println("The 1st larget number is "+first);
        System.out.println("The 2nd larget number is "+second);
    }

/*
public class Exercise {
    public static int[] findTopTwoScores(int[] array) {
        int firstHighest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int score : array) {
            if (score > firstHighest) {
                secondHighest = firstHighest;
                firstHighest = score;
            } else if (score > secondHighest && score < firstHighest) {
                secondHighest = score;
            }
        }

        return new int[]{firstHighest, secondHighest};
    }
}
 */
}
