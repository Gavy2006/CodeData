class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        char[] arr = p.toCharArray();

        Arrays.sort(arr);

        p = new String(arr);

        for (int i = 0; i <= s.length() - p.length(); i++) {

            String str = s.substring(i, i + p.length());
            char[] arr1 = str.toCharArray();
            Arrays.sort(arr1);

            str = new String(arr1);

            if (str.equals(p)) {
                list.add(i);
            }

        }

        return list;
    }
}