class Solution {
    public int myAtoi(String s) {
        final int n = s.length();
        int i = 0;

        while (i < n && s.charAt(i) == ' ') i++;

        int sign = 1;
        if (i < n) {
            char c = s.charAt(i);
            if (c == '-') { sign = -1; i++; }
            else if (c == '+') { i++; }
        }

        final int limit = (sign == 1) ? -2147483647 : -2147483648;
        final int multMin = -214748364;              
        final int lastDigit = (sign == 1) ? 7 : 8;  

        int res = 0; // negativo
        while (i < n) {
            char c = s.charAt(i);
            int d = c - '0';
            if (d < 0 || d > 9) break;

            if (res < multMin || (res == multMin && d > lastDigit))
                return (sign == 1) ? 2147483647 : -2147483648;

            res = res * 10 - d;
            i++;
        }

        return (sign == 1) ? -res : res;
    }
}
