class Solution {
    public String longestPalindrome(String s) {

        if (s.length() == 1)
            return s;

        int max = Integer.MIN_VALUE;
        String str = "";

        for (int i = 0; i < s.length(); i++) {

            int low = i;
            int high = i + 1;

            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }
            if (high - low > max) {
                str = s.substring(low + 1, high);
            }

            max = Math.max(max, high - low);

            low = i - 1;
            high = i + 1;

            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
            }

            if (high - low > max) {
                str = s.substring(low + 1, high);
            }
            max = Math.max(max, high - low);

        }

        return str;
    }
}