package practice.arrays;

public class ArrayExercise5 {
    /**
     * Best Time to Buy and Sell Stock - LeetCode 121
     * You are given an array prices where prices[i] is the price of a given stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     * <p>
     * Example:
     * <p>
     * Input: prices = [7, 1, 5, 3, 6, 4]
     * Output: 5
     * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
     */


    public static void main(String agrs[]) {
        int arr[] = new int[]{7, 1, 5, 3, 6, 4};

        int buyingDay = 0;
        int sellingDay = 0;
        int profitValue = 0;


        for (int i: arr){

        }
        /* The below solution is not right - uses 2 for loop - O(n^2)
        Check Solution below

        int cleanIndex = 1;
        int maxDay = 0;
        int maxValue = 0;
        int maxDayi = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (maxValue < (arr[j] - arr[i])) {
                    maxValue = (arr[j] - arr[i]);
                    maxDay = j + i;
                    maxDayi = i + 1;
                }
            }
        }
        System.out.println("The max profit value " + maxValue);
        System.out.println("Day to be sold : " + maxDay);
        System.out.println("Day to be bought :  " + maxDayi);
     */
    }
}

/*
public class Exercise {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
}

The for loop in line 4 is the dominant factor that determines the time complexity of this algorithm. Since the loop runs n times (where n is the length of the input array) and all the operations inside the loop have a constant time complexity of O(1), the overall time complexity of the maxProfit method is O(n).
 */