package java;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            int l = i;
            int r = 0;
            while (r < m) {
                if (haystack.toCharArray()[l] != needle.toCharArray()[r]) {
                    break;
                }
                l++;
                r++;
            }
            if (r == m) {
                return i;
            }
        }
        return -1;
    }
}
