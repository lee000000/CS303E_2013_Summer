#  File: GuessingGame.py

#  Description: This program will guess the number the user thinks between 1 and 100.

#  Student Name:Chengxi Li

#  Student UT EID:cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: May 1 2014

#  Date Last Modified:May 1 2014

#define the function that guesses the number
def guess():

#initial values for variable hi, lo, guess and count
  hi = 100
  lo = 0
  guess = 50
  count = 1
  global is_correct
  is_correct = False
  while (lo < hi):
    print("")
    print ("Guess ", count,": The number you thought was", guess)
    a = input ("Enter 1 if my guess was high, -1 if low, and 0 if correct: ")
#if guess is correct
    if (a == "0"):
      is_correct = True
      break
#if guess is too high
    elif (a == "1"):
      hi = guess
      guess = ( lo + hi) // 2
      count += 1
#if guess is too low
    elif (a == "-1"):
      lo = guess
      guess = (lo + hi) // 2
      count += 1
    else:
      continue
  return is_correct

      

def main():
  print ("Guessing Game")
  print ("")
  print ("Think of a number between 1 and 100 inclusive.")
  print ("And I will guess what it is in 7 tries or less.")
  print("")
  is_play = input ("Are you ready? (y/n): ")
  while (is_play != "y" and is_play != "n"):
      is_play = input ("Are you ready? (y/n): ")
  if (is_play == "y"):
#call function guess() and assign the result to global variable is_correct
    is_correct = guess() 
  elif (is_play == "n"):
    print ("")
    print ("Bye")
    return False
  if (is_correct == True):
    print ("")
    print ("Thank you for playing the Guessing Game.")
main()