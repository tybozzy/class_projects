spam = str(input("Enter text: "))
lowercase = 0
uppercase = 0
whitespace = 0
symbols = 0

for c in spam:
    if ord(c) >= 97 and ord(c) <= 122:
        lowercase += 1
    elif ord(c) >= 65 and ord(c) <= 90:
        uppercase += 1
    elif ord(c) >= 0 and ord(c) <= 32:
        whitespace += 1
    else:
        symbols += 1

print("White space ratio:", "{:.8f}".format(whitespace / len(spam)))
print("Lowercase ratio:", "{:.8f}".format(lowercase / len(spam)))
print("Uppercase ratio:", "{:.8f}".format(uppercase / len(spam)))
print("Symbols ratio:", "{:.8f}".format(symbols / len(spam)))