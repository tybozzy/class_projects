import math

a = 100000
z = (a * 2) - 1
x = 1

for i in reversed(range(a)):
    x = (i + 1) ** 2 / x
    x += z
    z -= 2

print("Pi computed using continued fractions:", (4/x))
print("Pi computed using math.pi:", math.pi)
    
    