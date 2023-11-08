import random

card = random.randint(0, 51)
print("Random number:", card)

rankList = ["Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"]

num = card % 13

if card >= 0 and card <=12:
    suit = "Clubs"
if card >= 13 and card <=25:
    suit = "Diamonds"
if card >= 26 and card <=38:
    suit = "Hearts"
if card >= 39 and card <=51:
    suit = "Spades"
    
print("Your card is the", (rankList[num]), "of", suit)