class Solution {
    public int myAtoi(String s) {
        int n = s.length(), i = 0;
        while (i < n && s.charAt(i) == ' ') i++;

        int sign = 1;
        if (i < n) {
            char c = s.charAt(i);
            if (c == '-') { sign = -1; i++; }
            else if (c == '+') i++;
        }

        int limit = (sign == 1) ? -Integer.MAX_VALUE : Integer.MIN_VALUE;
        int multMin = limit / 10;
        int limLast = -(limit % 10);

        int res = 0;
        while (i < n) {
            int d = s.charAt(i) - '0';
            if ((d | (9 - d)) < 0) break;

            if (res < multMin || (res == multMin && d > limLast))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            res = res * 10 - d;
            i++;
        }

        return sign == 1 ? -res : res;
    }
}
