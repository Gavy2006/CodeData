class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] arr = s1.toCharArray();
        Arrays.sort(arr);
        s1 = new String(arr);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            String newStr = s2.substring(i, i + s1.length());
            char[] arr1 = newStr.toCharArray();
            Arrays.sort(arr1);
            newStr = new String(arr1);

            if(newStr.equals(s1)) return true ;

        }

        return false;
    }
}