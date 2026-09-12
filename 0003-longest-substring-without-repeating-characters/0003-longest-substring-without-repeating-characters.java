class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0)
            return 0;

        if (s.length() == 1)
            return 1;

        int i = 0;
        int j = 1;
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put(s.charAt(i), 1);

        while (j < s.length()) {

            char ch = s.charAt(j);

            if (map.containsKey(ch)) {

                while (map.containsKey(ch)) {

                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);

                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }

                    i++;
                }
            }

            map.put(ch, 1);
            max = Math.max(j - i + 1, max);
            j++;

        }
        return max;
    }
}