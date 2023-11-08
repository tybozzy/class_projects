import random

choices = ("rock", "paper", "scissors")

on = True

print("Welcome to Rock, Paper, Scissors! Type \"quit""\"" " at anytime to quit.")

while on == True:
    com = random.choice(choices)
    user = input("Choose rock, paper, or scissors: ")
    if com == user:
        print("I chose", user, "too, it's a tie.")

    elif user == "rock":
        if com == "paper":
            print("I chose paper, you lose.")
        if com == "scissors":
            print("I chose scissors, you win.")

    elif user == "paper":
        if com == "scissors":
            print("I was scissors, you lose.")
        if com == "rock":
            print("I was rock, you win.")
    
    elif user == "scissors":
        if com == "I was rock, you lose.":
            print("You lose.")
        if com == "paper":
            print("I was paper, you win.")
    else:
        print("Thanks for playing.")
        on = False
