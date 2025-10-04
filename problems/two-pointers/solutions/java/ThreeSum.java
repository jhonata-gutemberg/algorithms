package java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;
            int c = nums[i];
            while (l < r) {
                int a = nums[l];
                int b = nums[r];
                int s = a + b;
                if (s < -c) {
                    l++;
                } else if (s > -c) {
                    r--;
                } else {
                    triplets.add(List.of(c, a, b));
                    l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return triplets;
    }
}
