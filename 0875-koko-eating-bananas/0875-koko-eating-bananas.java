class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int min = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            max = Math.max(max, piles[i]);
        }

        int result = max;

        while (min <= max) {

            int mid = min + (max - min) / 2;

            long hours = 0;

            for (int i = 0; i < piles.length; i++) {
                hours += (piles[i] + mid - 1) / mid;
            }

            if (hours <= h) {
                result = Math.min(result, mid);
                max = mid - 1;
            }

            else {
                min = mid + 1;
            }
        }

        return result;
    }
}