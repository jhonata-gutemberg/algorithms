package java;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int l = 0;
        while (l < nums.length && nums[l] != 0) {
            l++;
        }
        for (int r = l + 1; r < nums.length; r++) {
            if (nums[r] != 0) {
                nums[l] = nums[r];
                nums[r] = 0;
                while (l < nums.length && nums[l] != 0) {
                    l++;
                }
            }
        }
    }
}
