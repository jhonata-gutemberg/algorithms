from typing import List

def largest_container(heights: List[int]) -> int:
    n = len(heights)
    l = 0
    r = n - 1
    max_water = 0
    while l < r:
        water = min(heights[l], heights[r]) * (r - l)
        max_water = max(max_water, water)
        if heights[l] < heights[r]:
            l += 1
        elif heights[l] > heights[r]:
            r -= 1
        else:
            l += 1
            r -= 1
    return max_water
