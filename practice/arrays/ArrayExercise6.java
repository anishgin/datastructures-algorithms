package practice.arrays;

public class ArrayExercise6 {
    /**
     *Two Sum - LeetCode 1
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target. You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * Examplesl
     *
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1]
     *
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     */


    public static void main(String agrs[]) {
        int arr[] = new int[]{3,2,4};

        int target = 6;
        int position[] = new int[2];

        for (int i=0; i< arr.length; i++){
            for (int j=i; j< arr.length; j++){
                if(arr[i]+arr[j] == target){
                    position = new int[]{i, j};
                }
            }
        }

        System.out.println(position[0] +"  "+position[1]);
    }
}

/*
public class Exercise {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution found");
    }
}


This solution uses two nested loops to find the pair of numbers that add up to the target, resulting in a time complexity of O(n^2), where n is the length of the input array. It does not use any library or data structure. However, this solution is less efficient than the HashMap solution with a time complexity of O(n). We have not covered HashMap yet that is why I have used this solution.

 */

