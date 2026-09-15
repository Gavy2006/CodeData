class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

             else if (st.isEmpty()) {
                return false;
            }

            else if (ch == ')' && st.peek() != '(')
                return false;
            else if (ch == ']' && st.peek() != '[')
                return false;
            else if (ch == '}' && st.peek() != '{')
                return false;

            else {
                st.pop() ;
            }

            i++;
        }

        return st.isEmpty();
    }
}