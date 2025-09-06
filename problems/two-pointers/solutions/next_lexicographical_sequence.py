def next_lexicographical_sequence(s: str) -> str:
    letters = list(s)
    pivot = len(s) - 2
    while pivot >= 0 and letters[pivot] >= letters[pivot + 1]:
        pivot -= 1
    if pivot == -1:
        return "".join(reversed(letters))
    rightmost = len(s) - 1
    while rightmost >= 0 and letters[rightmost] <= letters[pivot]:
        rightmost -= 1
    letters[pivot], letters[rightmost] = letters[rightmost], letters[pivot]
    letters[pivot + 1:] = reversed(letters[pivot + 1:])
    return "".join(letters)
