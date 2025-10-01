class Solution:
    def isHappy(self, n: int) -> bool:
        def get_next(num):
            total = 0
            while num > 0:
                digit = num % 10
                total += digit**2
                num //= 10
            return total
        i = n
        j = get_next(n)
        while j != 1 and i != j:
            i = get_next(i)
            j = get_next(get_next(j))
        return j == 1
