package java;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = m - 1;
        int r = n - 1;
        int k = nums1.length - 1;
        while (l >= 0 && r >= 0) {
            if (nums1[l] > nums2[r]) {
                nums1[k] = nums1[l];
                l--;
            } else {
                nums1[k] = nums2[r];
                r--;
            }
            k--;
        }
        while (r >= 0) {
            nums1[k] = nums2[r];
            r--;
            k--;
        }
    }
}
