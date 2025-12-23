class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long value = 0;

        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        if (i < n) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                i++;
            }
        }

        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            value = value * 10 + (c - '0');

            if (sign == 1 && value > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -value < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            i++;
        }

        return (int) (sign * value);
    }
}
