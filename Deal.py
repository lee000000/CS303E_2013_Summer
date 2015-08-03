# File: Deal.py

# Description: This program will simulate the Monty Hall game and compute the probability of winning after changing the door.

# Student Name: Chengxi Li

# Student UT EID: cl29385

# Partner's Name:

# Partner's UT EID:

# Course Name: CS 303E

# Unique Number: 53466

# Date Created: Mar 15 2014

# Date Last Modified: Mar 15 2014
  
def main():
  num = int( input ("Enter number of times you want to play: "))
  win = 0
  i = 1
  print("")
  print("Prize","	","Guess","	","View","	","New Guess")
  for i in range (1, num + 1):
    import random
    prize = random.randint(1, 3)
    guess = random.randint(1, 3)
    view = random.randint(1, 3)
    while (view == prize or view == guess):
      view = random.randint(1, 3)
    newguess = random.randint(1, 3)
    while (newguess == guess or newguess == view):
      newguess = random.randint(1, 3)
    if (newguess == prize):
      win += 1
    print(" ", prize, " 	  ", guess, "	 ", view, "	   ", newguess)
    i += 1
  print("")
  print("Probability of winning if you switch = ", round(win/num, 2))
  print("Probability of winning if you do not switch = ", round(1 - win/num,2))
main()