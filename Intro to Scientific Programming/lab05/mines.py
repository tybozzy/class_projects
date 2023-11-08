board = []
mines = set()

def solve(): 
    board = read_board("mines.txt")
    find_mines("mines.txt")
    update_board(board)
    write_board(board, 'output.txt')
    
def read_board(filename):
    fp = open(filename, 'r')
    for line in fp: 
        row = []
        for ch in line:
            if ch == ".":
                row.append(0)
            elif ch == "*":
                row.append(9)
        board.append(row)
    fp.close()
    return board

def find_mines(filename):
    row = 0
    col = 0

    fp = open(filename, 'r')
    for line in fp: 
        for ch in line:
            if ch == "*":
                mines.add((row, col))
            col += 1
        col = 0
        row += 1
    fp.close()
    return mines

def count_neighbors(board, r, c):
    neighbors = set()
    r -= 1
    c -= 1
    for x in range(3):
        for y in range(3):
            neighbors.add((r, c))
            r += 1
        c += 1
        r -= 3
    return(len(neighbors & mines))
    
def update_board(board):
    for r in range(len(board)):
        for c in range(len(board[r])):
            if board[r][c] == 0:
                board[r][c] = count_neighbors(board, r, c)

def write_board(board, filename):
    fp = open(filename, 'w')
    for row in board:
        for cell in row:
            if cell == 0:
                fp.write('.')
            elif cell >= 9:
                fp.write('*')
            else:
                fp.write(str(cell))
        fp.write("\n")
    fp.close()
    
solve()