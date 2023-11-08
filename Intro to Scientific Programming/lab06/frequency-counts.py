inpf = open("LOTR.txt", "r")

abc = "abcdefghijklmnopqrstuvwxyz"
wordsdict = {}
letters = {}

for i in abc:
    letters[i] = 0
for word in inpf:
    if word.strip() not in wordsdict:
        wordsdict[word.strip()] = 1
    else:
        wordsdict[word.strip()] += 1
    for char in word:
        if char in abc:
            letters[char] += 1
        
print(wordsdict, letters)

inpf.close()