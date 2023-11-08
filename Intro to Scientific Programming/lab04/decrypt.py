# read the next line from the input file
# initialize an empty string for the output line
# for each character c in the input line
# if c is between characters a and z or A and Z, convert c to its corresponding plain 
    # text character y and append y to the output line
# else append character c to the output line
# write the output line (along with a new line) to the output file and go to output file, 
    # and go to step a


lines = 1


inpf = open("book.txt", "r", encoding = "utf8", errors = "ignore")
outf = open("output.txt", "w", encoding = "utf8", errors = "ignore")

while lines < 7990: # until the end of the book
    for c in inpf.readline(): # for every line in the book
        for c2 in c: # for each character in the line
            if ord(c2) >= 68 and ord(c2) <= 90 or ord(c2) >= 100 and ord(c2) <= 122: # between 65-90 or 97-122
                asci = ord(c2) - 3
                chars = chr(asci)
                outf.write(chars)
            elif ord(c2) >= 65 and ord(c2) <= 67 or ord(c2) >= 97 and ord(c2) <= 99:
                asci = ord(c2) + 23
                chars = chr(asci)
                outf.write(chars)
            else:
                outf.write(c2)
    lines += 1
outf.close()
inpf.close()