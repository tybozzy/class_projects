count = 0
lines = 0

with open('fruits.txt', 'r') as fp:
    while lines < 10000:
        if fp.readline().strip() == "avocado":
            count += 1
        lines += 1
print("The number of avocados is", count)
