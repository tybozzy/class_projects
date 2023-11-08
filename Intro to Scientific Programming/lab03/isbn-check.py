# notes for isbn
# use list splicing ([0:9])
# len = 10
# everything but last is numeric

d = int(10)
total = 0
isNumeric = True
length = True

isbn = str(input("Enter the ISBN: ")) # asks for the ISBN

if len(isbn) != 10: # if the list does not have a len of 10
    length = False
else:
    length = True

for i in isbn:
    if i.isnumeric() == False:
        isNumeric = False

for i in isbn:
    if i == "X":
        x = 10
    else:
        x = int(i)
    total += x * d
    d -= 1
    
print(total) # (debug)

if length == True and isNumeric == True and total % 11 == 0: # equation bit
    print("ISBN number accepted.")
else:
    print("ISBN number invalid.")
