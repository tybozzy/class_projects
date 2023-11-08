import random
import time

def experiment():
    count = 0
    while True:
        count += 1
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        d3 = random.randint(1, 6)
        d4 = random.randint(1, 6)
        d5 = random.randint(1, 6)
        if d1 == d2 == d3 == d4 == d5 == 6:
            return count

trials = 1000
start = time.time()
rolls = 0
for i in range(trials):
    rolls += experiment()
print(rolls/trials)
print(time.time() - start)