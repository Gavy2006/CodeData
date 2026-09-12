class Solution {
    public int maxProfit(int[] prices) {

        int max = 0;

        int i = 0;
        int j = 1;

        while (j < prices.length) {

            max = Math.max(max, prices[j] - prices[i]);

            if (prices[i] > prices[j]) {
                i = j;
            }

            j++;

        }

        return max;
    }
}