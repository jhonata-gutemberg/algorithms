from typing import List

def pair_sum_sorted(nums: List[int], target: int) -> List[int]:
    left = 0
    right = len(nums) - 1
    while (left < right):
        sum = nums[left] + nums[right]
        if (sum > target):
            right -= 1
        elif (sum < target):
            left += 1
        else:
            return [left, right]
    return []