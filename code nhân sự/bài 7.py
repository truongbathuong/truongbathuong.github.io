import random

def compare_numbers(number, user_guess):
    cow = 0
    bull = 0
    for i in range(len(number)):
        if user_guess[i] == number[i]:
            cow += 1
        else:
            if user_guess[i] in number:
                bull += 1
    return cow, bull

if __name__ == "__main__":
    playing = True  # gotta play the game
    number = str(random.randint(1000, 9999))  # random 4 digit number
    guesses = 0

    print("Welcome to the Cows and Bulls Game!")

    while playing:
        user_guess = input("Enter a number: ")
        if user_guess == "exit":
            print("Exited the game.")
            break
        if len(user_guess) != 4:
            print("Invalid answer, please try again!")
            continue

        cow, bull = compare_numbers(number, user_guess)
        guesses += 1

        print(f"{str(cow)} cows, {str(bull)} bulls.")

        if user_guess == number:
            playing = False
            print(f"You win the game after {guesses} guesses! The number was {number}.")
            break
        else:
            print("Your guess isn't quite right, try again.\n")