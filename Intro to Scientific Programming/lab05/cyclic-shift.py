k = int(input("Enter amount of spaces to shift by: "))
numList = []

for i in range(1, 101):
    numList.append(i)

def shift(numList, k):
    for i in range(k):
        x = numList[99]
        numList.pop()
        numList.insert(0, x)
    return numList

for i in numList:
    print(shift(numList,k)[i - 1], end = " ")

