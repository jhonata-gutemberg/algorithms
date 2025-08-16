import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] arg) {
        merge(new int[] {2,0}, 1, new int[] {1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            for (int k = n - 1; k >= 0; k--) {
                nums1[k] = nums2[k];
            }
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
