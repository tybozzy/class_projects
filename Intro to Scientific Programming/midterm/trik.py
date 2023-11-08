string = input("Enter the swap string: ")
cup1 = False
cup2 = True
cup3 = False

for i in string:
    if i == "A":
        if cup1 == True:
            cup2 = cup1
            cup1 = False
        elif cup2 == True:
            cup1 = cup2
            cup2 = False
    elif i == "B":
        if cup2 == True:
            cup3 = cup2
            cup2 = False
        elif cup3 == True:
            cup2 = cup3
            cup3 = False
    elif i == "C":
        if cup1 == True:
            cup3 = cup1
            cup1 = False
        elif cup3 == True:
            cup1 = cup3
            cup3 = False

if cup1 == True:
    print("Coin is in cup 1.")
if cup2 == True:
    print("Coin is in cup 2.")
if cup3 == True:
    print("Coin is in cup 3.")


        
        
        