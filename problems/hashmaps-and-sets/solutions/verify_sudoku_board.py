from typing import List

def verify_sudoku_board(board: List[List[int]]) -> bool:
    row_sets = [set() for _ in range(9)]
    column_sets = [set() for _ in range(9)]
    subgrid_sets = [[set() for _ in range(3)] for _ in range(3)]
    for r in range(9):
        for c in range(9):
            num = board[r][c]
            if num == 0:
                continue
            if num in row_sets[r] or num in column_sets[c] or num in subgrid_sets[r // 3][c // 3]:
                return False
            row_sets[r].add(num)
            column_sets[c].add(num)
            subgrid_sets[r // 3][c // 3].add(num)
    return True
