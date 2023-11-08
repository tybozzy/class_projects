import math

initial = int(input("Enter the initial amount of C-14 in the artifact (in grams): "))  # asks for the initial amount of C-14
current = int(input("Enter the current amount of C-14 in the artifact (in grams): "))  # asks for the current amount of C-14

# euler = float(2.7183)  # storing Euler's constant in variable "euler"
rod = float(3.9 * (10**-12))  # storing the rate of decay in variable "rod"
year = 31536000  # seconds in a year

timeFin = math.log(current/initial)/-abs(rod)  # equation to solve for t
timeFin /= year  # converts seconds into years and storing

print("The age of the artifact is: " + "%.2f" % timeFin)  # prints final answer
