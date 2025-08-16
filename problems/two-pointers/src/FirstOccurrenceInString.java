class FirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int s = 0; s < n - m + 1; s++) {
            int f = 0;
            while (f < m && needle.toCharArray()[f] == haystack.toCharArray()[s + f]) {
                f++;
            }
            if (f == m) {
                return s;
            }
        }
        return -1;
    }
}
