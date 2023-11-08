n = int(input("Prime numbers two to: "))

numList = []
primes = []

for i in range (n + 1):
    numList.append(True)
    
count = 0

for i in numList:
    if 1 < count and i == True:
        for x in range(n):
            if (count + count * (x + 1)) <= n:
                numList[count + count * (x + 1)] = False
    else:
        numList[i] = False
    if 1000 < count:
        break
    count += 1

count = 0
for i in numList:
    if i == True:
        primes.append(str(count))
        primes.append("\n")
    count += 1

prime = ''.join(primes)

file = open("primes.txt", "w")
file.write(prime)
file.close()
