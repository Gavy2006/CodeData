class Solution {
    public void reverseString(char[] s) {

        int j = 0;
        int k = s.length - 1;

        for (int i = 0; i < s.length/ 2; i++) {

            char temp = s[j];
            s[j] = s[k];
            s[k] = temp;

            j++ ;
            k-- ;

        }


    }
}