class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), best = 0, l = 0;
        int[] freq = new int[128];

        for (int r = 0; r < n; r++) {
            int c = s.charAt(r);
            freq[c]++;
            while (freq[c] > 1) {           // hay duplicado: estrecha ventana
                freq[s.charAt(l++)]--;
            }
            best = Math.max(best, r - l + 1);
        }
        return best;
    }
}
