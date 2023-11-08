income = int(input("Enter taxable income: "))

if income >= 0 and income <= 9700:
    tax = income * 0.1
    
if income >= 9701 and income <= 39475:
    tax = income * 0.12

if income >= 39476 and income <= 84200:
    tax = income * 0.22

if income >= 84201 and income <= 160725:
    tax = income * 0.24
    
if income >= 160726 and income <= 204100:
    tax = income * 0.32
    
if income >= 204101 and income <= 510300:
    tax = income * 0.35
    
if income >= 510301:
    tax = income * 0.37
    
print("Total tax owed is", "%.2f" % tax)