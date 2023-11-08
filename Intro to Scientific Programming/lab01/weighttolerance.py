w = int(input("Enter desired weight: "))  # asks for desired weight
n = int(input("Enter tolerance (as percentage): ")) / 100  # asks for part tolerance and converts it to decimal percentage

print("The range of accepted weight for the part is from", (w - (w*n)), "to", (w + (w*n)))  # prints the final answer including mathy bit
