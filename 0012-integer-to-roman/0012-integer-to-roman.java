class Solution {

    static String[] first = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
    static String[] second = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
    static String[] third = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
    static String[] fourth = { "", "M", "MM", "MMM" };

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        sb.append(fourth[num / 1000]);
        sb.append(third[(num / 100) % 10]);
        sb.append(second[(num / 10) % 10]);
        sb.append(first[(num % 10)]);
        return sb.toString();
    }
}