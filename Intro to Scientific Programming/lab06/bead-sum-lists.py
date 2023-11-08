file = "small-beads.in"
#file = str(input("Enter input file: "))
k = int(input("Enter bead sum (k): "))

l = list()
t = list()

inpf = open(file, "r")

for i in inpf:
    l.append(int(i))

for i in l:
    if i < k:
        if k - i in l:
            temp = k - i
            tupl = (i, temp)
            if (temp, i) not in t:
                t.append(tupl)

inpf.close()

for i in t:
    print(i)