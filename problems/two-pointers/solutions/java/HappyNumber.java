package java;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow = n;
        int faster = getNext(n);
        while (faster != 1 && faster != slow) {
            slow = getNext(slow);
            faster = getNext(getNext(faster));
        }
        return faster == 1;
    }

    private int getNext(int n) {
        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += (int) Math.pow(digit, 2);
            n /= 10;
        }
        return total;
    }
}
