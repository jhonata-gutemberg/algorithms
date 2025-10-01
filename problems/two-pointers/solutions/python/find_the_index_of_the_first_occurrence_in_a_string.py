class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        n = len(haystack)
        m = len(needle)
        for l in range(n - m + 1):
            r = 0
            while r < m and haystack[l + r] == needle[r]:
                r += 1
            if r == m:
                return l
        return -1
