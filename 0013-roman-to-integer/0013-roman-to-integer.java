class Solution {
    public int romanToInt(String s) {

        int no = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == 'I') {
                if (i < s.length() - 1) {
                    char next = s.charAt(i + 1);

                    if (next == 'V') {
                        no += 4;
                        i++;
                    } else if (next == 'X') {
                        no += 9;
                        i++;
                    } else {
                        no += 1;
                    }
                } else {
                    no += 1;
                }
            }

            else if (ch == 'V') {
                no += 5;
            }

            else if (ch == 'X') {
                if (i < s.length() - 1) {
                    char next = s.charAt(i + 1);

                    if (next == 'L') {
                        no += 40;
                        i++;
                    } else if (next == 'C') {
                        no += 90;
                        i++;
                    } else {
                        no += 10;
                    }
                } else {
                    no += 10;
                }
            }

            else if (ch == 'L') {
                no += 50;
            }

            else if (ch == 'C') {
                if (i < s.length() - 1) {
                    char next = s.charAt(i + 1);

                    if (next == 'D') {
                        no += 400;
                        i++;
                    } else if (next == 'M') {
                        no += 900;
                        i++;
                    } else {
                        no += 100;
                    }
                } else {
                    no += 100;
                }
            }

            else if (ch == 'D') {
                no += 500;
            }

            else if (ch == 'M') {
                no += 1000;
            }
        }

        return no;
    }
}