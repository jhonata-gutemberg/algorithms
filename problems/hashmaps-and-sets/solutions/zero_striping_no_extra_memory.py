from typing import List

def zero_striping(matrix: List[List[int]]) -> None:
    if not matrix or not matrix[0]:
        return
    m, n = len(matrix), len(matrix[0])
    first_col_contains_zero = first_row_contains_zero = False
    for r in range(m):
        if matrix[r][0] == 0:
            first_col_contains_zero = True
            break
    for c in range(n):
        if matrix[0][c] == 0:
            first_row_contains_zero = True
            break
    for r in range(1, m):
        for c in range(1, n):
            if matrix[r][c] == 0:
                matrix[0][c] = 0
                matrix[r][0] = 0
    for r in range(1, m):
        for c in range(1, n):
            if matrix[r][0] == 0 or matrix[0][c] == 0:
                matrix[r][c] = 0
    for r in range(m):
        if first_col_contains_zero:
            matrix[r][0] = 0
    for c in range(n):
        if first_row_contains_zero:
            matrix[0][c] = 0
