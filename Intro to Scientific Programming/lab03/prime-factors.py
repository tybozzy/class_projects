# mod the number by n to see if the number is prime, 
#divide by 2 then if that works store or input the 2. divide the first
#number by the stored/output number

# outer loop running that goes until its out of factors (number is 1)
# inner loop that tries to pull out factors

prime = True
d = 0
n = int(input("Enter an integer: "))

print("The prime factors are: ")

for i in range(2, abs(n)):
    if i % n == 0:
        prime = False
        print(prime)
        continue
    for i in range(abs(n), 2):
        d = n / i
        print(d)

# I know it's unfinished