from typing import List

def triplet_sum(nums: List[int]) -> List[List[int]]:
    triplets = []
    nums.sort()
    for i in range(len(nums)):
        if i > 0 and nums[i] == nums[i - 1]:
            continue
        pairs = find_pairs(i, nums)
        for pair in pairs:
            triplets.append([nums[i]] + pair)
    return triplets

def find_pairs(i:int, nums: List[int]) -> List[List[int]]:
    a = nums[i]
    l = i + 1
    r = len(nums) - 1
    pairs = []
    while l < r:
        b = nums[l]
        c = nums[r]
        s = b + c
        if s < -a:
            l += 1
        elif s > -a:
            r -= 1
        else:
            pairs.append([b, c])
            l += 1
            while l < r and nums[l] == nums[l - 1]:
                l += 1
    return pairs
