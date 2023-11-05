package practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayExercise12 {
    /**
     * You are given an array nums of positive integers and an integer k.
     *
     * In one operation, you can remove the last element of the array and add it to your collection.
     *
     * Return the minimum number of operations needed to collect elements 1, 2, ..., k.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [3,1,5,4,2], k = 2
     * Output: 4
     * Explanation: After 4 operations, we collect elements 2, 4, 5, and 1, in this order. Our collection contains elements 1 and 2. Hence, the answer is 4.
     * Example 2:
     *
     * Input: nums = [3,1,5,4,2], k = 5
     * Output: 5
     * Explanation: After 5 operations, we collect elements 2, 4, 5, 1, and 3, in this order. Our collection contains elements 1 through 5. Hence, the answer is 5.
     * Example 3:
     *
     * Input: nums = [3,2,5,3,1], k = 3
     * Output: 4
     * Explanation: After 4 operations, we collect elements 1, 3, 5, and 2, in this order. Our collection contains elements 1 through 3. Hence, the answer is 4.
     * url@ https://leetcode.com/problems/minimum-operations-to-collect-elements/description/
     */


    public static void main(String agrs[]){
        List<Integer> nums = new ArrayList<Integer>();
        nums =  Arrays.asList(1,2,2);
        int k=2;

        System.out.println(minOperations(nums, k));

    }

    public static int minOperations(List<Integer> nums, int k) {
    int operation=0;
    List<Integer> tmp_arr = new ArrayList<Integer>();
     for(int i=nums.size()-1; i>=0; i--){
         operation++;
         if(nums.get(i) <=k && !tmp_arr.contains(nums.get(i))){
             tmp_arr.add(nums.get(i));
         }
         if(tmp_arr.size() == k){
             break;
         }
     }
        return operation;
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
