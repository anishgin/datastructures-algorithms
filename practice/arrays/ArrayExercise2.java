package practice.arrays;

public class ArrayExercise2 {
    /**
     * Write Java function called findMissingNumberInArray that takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number, and returns the missing number.
     *
     * Example
     *
     * myArray = {1,2,3,4,6}
     * findMissingNumberInArray(myArray, 6) // 5
     * Hint:
     *
     * Use the formula (n * (n + 1)) / 2 which  calculates the sum of the first n natural numbers.
     */


    public static void main(String agrs[]){
        int array[] =  {1,2,3,4,5,7,8,9};

        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }


        System.out.println("The missing number is "+ (expectedSum-actualSum));
    }

/*
public class Exercise {
  public static int findMissingNumberInArray(int[] array) {
        int n = array.length + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int number : array) {
            actualSum += number;
        }

        return expectedSum - actualSum;
    }
}
 */
}
