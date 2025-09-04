![Two pointers](docs/assets/two-pointers.png)

## 🧠 What is the Two Pointers Algorithm?
The **Two Pointers** technique uses two indices to traverse a data
structure (like arrays, strings, or linked lists). Instead of nested
loops, it moves pointers intelligently to achieve faster solutions,
often reducing complexity from **O(n²) → O(n)**.

## 🎯 Pointer Setups

1.  **Opposite Ends** → One pointer at the start, the other at the end
    (e.g., pair sum in sorted array).
2.  **Same Direction** → Both start at the beginning, moving at
    different speeds (e.g., cycle detection, sliding window).

## 📌 Common Use Cases

-   Arrays / Strings: Find pairs with target sum, check palindrome,
    remove duplicates.
-   Subarrays / Substrings: Longest substring without repeats, sliding
    window problems.
-   Linked Lists: Detect cycles, find middle node.
-   Partitioning: Dutch National Flag problem (sorting 0s, 1s, 2s).

## 🧩 Example -- Two Sum in a Sorted Array

``` python
def two_sum(nums, target):
    left, right = 0, len(nums) - 1
    while left < right:
        s = nums[left] + nums[right]
        if s == target:
            return [left, right]
        elif s < target:
            left += 1
        else:
            right -= 1
```

✅ Runs in **O(n)** instead of **O(n²)**.

## 🚀 Key Benefits

-   **Efficiency**: Cuts down unnecessary iterations.
-   **Simplicity**: Straightforward once recognized.
-   **Versatility**: Works for arrays, strings, and linked lists.

## 💪 Exercises

| Problem                                                                                                                                                                                        | Difficulty                                              | Complexity |                         Status                          |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------|-----------:|:-------------------------------------------------------:|
| [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array)                                                                                       | ![License](https://img.shields.io/badge/Easy-greenblue) |       O(n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Remove Element](https://leetcode.com/problems/remove-element/description/?envType=problem-list-v2&envId=two-pointers)                                                                         | ![License](https://img.shields.io/badge/Easy-greenblue) |       O(n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=problem-list-v2&envId=two-pointers) | ![License](https://img.shields.io/badge/Easy-greenblue) |   O(n * m) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/?envType=problem-list-v2&envId=two-pointers)                                                                 | ![License](https://img.shields.io/badge/Easy-greenblue) |   O(n + m) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=two-pointers)                                                                     | ![License](https://img.shields.io/badge/Easy-greenblue) |       O(n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Happy Number](https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=two-pointers)                                                                             | ![License](https://img.shields.io/badge/Easy-greenblue) |   O(log n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Move Zeroes](https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=two-pointers)                                                                               | ![License](https://img.shields.io/badge/Easy-greenblue) |       O(n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Reverse String](https://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=two-pointers)                                                                         | ![License](https://img.shields.io/badge/Easy-greenblue) |       O(n) | ![License](https://img.shields.io/badge/Done-greenblue) |
| [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/?envType=problem-list-v2&envId=two-pointers)                                                   | ![License](https://img.shields.io/badge/Medium-orange)  |            |   ![License](https://img.shields.io/badge/Todo-gray)    |
| [3Sum](https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=two-pointers)                                                                                             | ![License](https://img.shields.io/badge/Medium-orange)  |            |   ![License](https://img.shields.io/badge/Todo-gray)    |
| [3Sum Closest](https://leetcode.com/problems/3sum-closest/description/?envType=problem-list-v2&envId=two-pointers)                                                                             | ![License](https://img.shields.io/badge/Medium-orange)  |            |   ![License](https://img.shields.io/badge/Todo-gray)    |
| [4Sum](https://leetcode.com/problems/4sum/description/?envType=problem-list-v2&envId=two-pointers)                                                                                             | ![License](https://img.shields.io/badge/Medium-orange)  |            |   ![License](https://img.shields.io/badge/Todo-gray)    |
| [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/?envType=problem-list-v2&envId=two-pointers)                                     | ![License](https://img.shields.io/badge/Medium-orange)  |            |   ![License](https://img.shields.io/badge/Todo-gray)    |
