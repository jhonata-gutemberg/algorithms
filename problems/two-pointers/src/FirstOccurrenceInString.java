class FirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            int j = 0;

            while (j < m && haystack.toCharArray()[i + j] == needle.toCharArray()[j]) {
                j += 1;
            }

            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
