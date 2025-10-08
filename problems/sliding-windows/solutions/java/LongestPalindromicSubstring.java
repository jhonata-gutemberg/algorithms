public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int l = 0;
        int r = s.length() - 1;
        int windowSize = r;
        while (l < r) {
            String substring = s.substring(l, r + 1);
            if (isPalindrome(substring)) {
                return substring;
            } else if (r == s.length() - 1) {
                l = 0;
                windowSize--;
                r = windowSize;
            } else {
                l++;
                r++;
            }
        }
        return s.substring(0, 1);
    }

    private boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r && s.charAt(l) == s.charAt(r)) {
            l++;
            r--;
        }
        return l >= r;
    }
}
