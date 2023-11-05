package practice.arrays;

public class ArrayExercise9 {
    /**
     *
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     * Example 2:
     *
     * Input: nums = [-1,-100,3,99], k = 2
     * Output: [3,99,-1,-100]
     * Explanation:
     * rotate 1 steps to the right: [99,-1,-100,3]
     * rotate 2 steps to the right: [3,99,-1,-100]
     */



    public static void main(String agrs[]) {
        int nums[] = new int[]{1,2,3,4,5,6,7};
        int k=3;

        int newindex=0;
        int temp=0;

        for(int i=0; i < nums.length ; i++) {
            if ((i+k+1) < nums.length) {
                System.out.println(i +" to "+ (i+k+1));
                temp = nums[i];
                nums[i] = nums[k+i+1];
                nums[k+i+1] = temp;
            } else {
                System.out.println(i +" to "+ (i+k+1-7));
                temp = nums[i];
                nums[i] = nums[k+i+1-7];
                nums[k+i+1-7] = temp;
            }
        }
    }
}