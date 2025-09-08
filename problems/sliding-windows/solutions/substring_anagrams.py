def substring_anagrams(s: str, t: str) -> int:
    expected_frequency, window_frequency = [0] * 26, [0] * 26
    l = r = count = 0
    for c in t:
        expected_frequency[ord(c) - ord('a')] += 1
    while r < len(s):
        window_frequency[ord(s[r]) - ord('a')] += 1
        if r - l + 1 == len(t):
            if expected_frequency == window_frequency:
                count += 1
            window_frequency[ord(s[l]) - ord('a')] -= 1
            l += 1
        r += 1
    return count
