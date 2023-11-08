newborn = 1
monthold = 0
mature = 0

months = int(input("Enter the amount of months: "))

for i in range(1, months + 1):
    mature += monthold
    monthold = newborn
    newborn = mature
print("There will be", (newborn + mature + monthold), "pairs of rabbits \n")