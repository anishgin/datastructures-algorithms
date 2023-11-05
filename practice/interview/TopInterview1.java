package practice.interview;

import java.util.Arrays;

public class TopInterview1 {
    public static void main(String args[]){
        System.out.println("Hello!");
        mergeSortedArray();
    }

    private static void mergeSortedArray() {
        /*
        You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
        representing the number of elements in nums1 and nums2 respectively.
        Merge nums1 and nums2 into a single array sorted in non-decreasing order.
        The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
        To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that
        should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
        https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
         */

        //int[] nums1 = new int[] {1,2,3,0,0,0};
        int[] nums1 = new int[] {1};
        int m = 1;
        int[] nums2 = new int[] {};
        int n = 0;

        intmerge(nums1, m, nums2, n);
    }

    private static void intmerge(int[] nums1, int m, int[] nums2, int n) {
        System.out.println(nums1.length);

        int arr1_slider = m-1;
        int arr2_slider = n-1;
        int leveler = m+n-1;

        while(arr2_slider >= 0){
            if( arr1_slider>=0 && nums1[arr1_slider] > nums2[arr2_slider])
                nums1[leveler--]=  nums1[arr1_slider--] ;
            else
                nums1[leveler--] =nums2[arr2_slider--];

            System.out.println("-----"+Arrays.toString(nums1));
        }




        System.out.println(Arrays.toString(nums1));
    }
}
