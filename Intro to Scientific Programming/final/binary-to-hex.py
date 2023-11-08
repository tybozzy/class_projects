import math
inp = str(input("Enter binary string:"))
hexDict = {'0000':'0', '0001':'1', '0010':'2', '0011':'3', '0100':'4', '0101':'5', '0110':'6', '0111':'7', '1000':'8', '1001':'9', '1010':"a", '1011':'b', '1100':'c', '1101':'d', '1110':'e', '1111':'f'}
outList = []
inpList = [i for i in inp]

if len(inpList) % 4 != 0:
    while len(inpList) % 4 != 0:
        inpList.insert(0, "0")

x = 0
y = 4
for i in range(math.floor(len(inpList)/4)):
    temp = hexDict[''.join(inpList[x:y])]
    outList.append(temp)
    x += 4
    y += 4

print(''.join(outList))