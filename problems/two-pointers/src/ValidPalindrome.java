public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                stringBuilder.append(c);
            }
        }
        s = stringBuilder.toString();
        if (s.length() <= 1) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j && s.toCharArray()[i] == s.toCharArray()[j]) {
            i++;
            j--;
        }
        if (i >= j) {
            return true;
        }
        return false;
    }
}
