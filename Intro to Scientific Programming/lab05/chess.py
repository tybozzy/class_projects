#Reads the board
def read_board(filename):
    board = []
    fp = open(filename, 'r')
    for line in fp:
        board.append(line[0:8])
    fp.close()
    return board

#moves the pawn, sees if it checks king
def threaten_P(piece, row, col):
    moves = [(1, 1), (-1, 1)]
    for dr, dc in moves:
        r = row
        c = col
        r += dr
        c += dc
        if r < 0 or r >= 8 or c < 0 or c >= 8:
            break
        p = board[r][c]
        if p == 'k':
            return True
        if p != '.':
            break

#moves the knight, sees if it checks king
def threaten_N(piece, row, col):
    moves = [(2, 3), (3, 2), (-2, 3), (-3, 2), (2, -3), (3, -2), (-2, -3), (-3, -2)]
    for dr, dc in moves:
        r = row
        c = col
        r += dr
        c += dc
        if r < 0 or r >= 8 or c < 0 or c >= 8:
            break
        p = board[r][c]
        if p == 'k':
            return True

#moves the bishop, sees if it checks king
def threaten_B(piece, row, col):
    moves = [(1, 1), (1, -1), (-1, 1), (-1, -1)]
    for dr, dc in moves:
        r = row
        c = col
        while True:
            r += dr
            c += dc
            if r < 0 or r >= 8 or c < 0 or c >= 8:
                break
            p = board[r][c]
            if p == 'k':
                return True
            if p != '.':
                break

#moves the rook, sees if it checks king
def threaten_R(piece, row, col):
    moves = [(0, 1), (1, 0), (0, -1), (-1, 0)]
    for dr, dc in moves:
        r = row
        c = col
        while True:
            r += dr
            c += dc
            if r < 0 or r >= 8 or c < 0 or c >= 8:
                break
            p = board[r][c]
            if p == 'k':
                return True
            if p != '.':
                break

#moves the queen, sees if it checks king
def threaten_Q(piece, row, col):
    moves = [(0, 1), (1, 0), (0, -1), (-1, 0), (1, 1), (1, -1), (-1, 1), (-1, -1)]
    for dr, dc in moves:
        r = row
        c = col
        while True:
            r += dr
            c += dc
            if r < 0 or r >= 8 or c < 0 or c >= 8:
                break
            p = board[r][c]
            if p == 'k':
                return True
            if p != '.':
                break

# runs all of the peice functions
def threatens_BK(piece, row, col):
    if piece == 'P':
        return threaten_P(piece, row, col)
    elif piece == 'N':
        return threaten_N(piece, row, col)
    elif piece == 'B':
        return threaten_B(piece, row, col)
    elif piece == 'R':
        return threaten_R(piece, row, col)
    elif piece == 'Q':
        return threaten_Q(piece, row, col)

# goes through all the peices, checks if king is in check
def is_bk_in_check(board):
    for r in range(8):
        for c in range(8):
            piece = board[r][c]
            if threatens_BK(piece, r, c):
                return True


board = read_board('chess.txt')
if is_bk_in_check(board) == True:
    print("The black king is in check")
else:
    print("The black king is not in check")