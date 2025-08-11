import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int l = 0, r = 1, n = nums.length - 1;
        boolean isDuplicationFound = false;
        while (l < r) {
            System.out.println(Arrays.toString(nums));
            if (nums[l] == nums[r]) {
               isDuplicationFound = true;
               if (r < n) {
                    r++;
                } else {
                    return l + 1;
                }
            } else if (isDuplicationFound) {
                int tmp = nums[l + 1];
                nums[l + 1] = nums[r];
                nums[r] = tmp;
                l++;
                if (r < n) {
                    r++;
                } else {
                    return l + 1;
                }
            } else {
                l++;
            }
        }
        return nums.length;
    }
}