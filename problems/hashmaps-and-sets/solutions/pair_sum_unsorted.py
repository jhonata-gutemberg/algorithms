from typing import List

def pair_sum_unsorted(nums: List[int], target: int) -> List[int]:
    hash_map = {}
    for i, x in enumerate(nums):
        y = target - x
        if y in hash_map:
            return [hash_map[y], i]
        hash_map[x] = i
    return []
