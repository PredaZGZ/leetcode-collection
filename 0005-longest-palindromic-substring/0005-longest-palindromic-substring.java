class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;

        int bestL = 0, bestR = 0;

        for (int i = 0; i < n; i++) {
            // odd length center at i
            int[] odd = expand(s, i, i);
            if (odd[1] - odd[0] > bestR - bestL) {
                bestL = odd[0];
                bestR = odd[1];
            }

            // even length center between i and i+1
            int[] even = expand(s, i, i + 1);
            if (even[1] - even[0] > bestR - bestL) {
                bestL = even[0];
                bestR = even[1];
            }
        }

        return s.substring(bestL, bestR + 1);
    }

    private int[] expand(String s, int l, int r) {
        int n = s.length();
        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return new int[]{l + 1, r - 1};
    }
}
