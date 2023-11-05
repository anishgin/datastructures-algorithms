package practice.arrays;

public class ArrayExercise11 {
    /**
     * Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k] such that i < j < k and nums[i] < nums[k] < nums[j].
     *
     * Return true if there is a 132 pattern in nums, otherwise, return false.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: false
     * Explanation: There is no 132 pattern in the sequence.
     * Example 2:
     *
     * Input: nums = [3,1,4,2]
     * Output: true
     * Explanation: There is a 132 pattern in the sequence: [1, 4, 2].
     * Example 3:
     *
     * Input: nums = [-1,3,2,0]
     * Output: true
     * Explanation: There are three 132 patterns in the sequence: [-1, 3, 2], [-1, 3, 0] and [-1, 2, 0].
     *
     * url@ https://leetcode.com/problems/132-pattern/description/
     */


    public static void main(String agrs[]){
        int myArray[] =  {4,8,86,87,85,90,85,83,23,45,84,1,2,0};



        System.out.println(find132pattern(myArray));

    }

    public static boolean find132pattern(int[] nums) {

        int a = 0;
        int b = 0;
        int c = 0;
        int tmp;
        int tmp2;

        for(int i=0; i < nums.length; i++){
            System.out.println(nums[i]);

            if(i==0){
                a= nums[0];
            } else if (i==1) {
                if(a>nums[1]){
                    b=nums[1];
                }else{
                    tmp=a;
                    a= nums[1];
                    b=tmp;
                }
            } else if (i==2){
                if(a>nums[i] && b>nums[i]){
                    c=nums[i];
                } else if (a>nums[i] && b<nums[i]) {
                    tmp=nums[i];
                    c=b;
                    b=tmp;
                } else if (a<nums[i] ) {
                    tmp=a;
                    a=nums[i];
                    c=b;
                    b=tmp;
                }
            }
        }
        System.out.println("A "+a+" B : "+b+" C :"+c);
        return false;
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
