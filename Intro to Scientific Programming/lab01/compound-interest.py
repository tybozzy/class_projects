principal = int(input("Enter the principal amount: "))  # asks for the principal amount
interest = int(input("Enter the rate of interest: ")) / 100  # asks for the rate of interest
compoundInterest = int(input("Enter the number of times interest is compounded in a year: "))  # asks for the compound interest
years = int(input("Enter the total number of years borrowed: "))  # asks for years borrowed

total = principal * (1 + (interest/compoundInterest))**(compoundInterest * years)  # math for the compound equation, stores answer in variable "total"

print("The total amount paid is:" + "%.2f" % total)  # prints variable "total" rounded to the nearest hundredth
