row = int(input("Enter number of rows for pyramid: "))
space = row
star = 1

for i in range(row + 1):
    print(space * " " + star * "*" + " " * space)
    star += 2
    space -= 1
