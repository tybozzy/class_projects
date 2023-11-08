file = input("Enter file name: ")
inpf = open(file, "r")

numList = []

for i in inpf:
    numList.append(int(i))
inpf.close()

mean = sum(numList)/len(numList)

count = 0
for i in numList:
    if i > mean:
        count += 1
aboveAverage = (count/len(numList))*100

print("The average is:", mean)
print("The percentage of people above average:", aboveAverage)

if numList[0] >= mean:
    print("The student is above the class average.")
else:
    print("The student is below the class average.")
