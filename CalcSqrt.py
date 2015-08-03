#  File: CalcSqrt.py

#  Description: The program prints out the square root of a number n entered by the user.

#  Student Name: Chengxi Li

#  Student UT EID: Chengxi Li

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Feb 28, 2014

#  Date Last Modified: Feb 28, 2014

def main():
  print("")
  n = int ( input ("Enter a positive number: "))
  while (n < 0):
    print("Error. Please try again")
    n = int ( input ("Enter a positive number: "))
  oldGuess = float( n / 2)
  newGuess = ( ( n / oldGuess) + oldGuess )/ 2.0
  while ( abs ( newGuess - oldGuess) >= 1.0E-06):
    oldGuess = newGuess
    newGuess = ( ( n / oldGuess) + oldGuess )/ 2.0
  diff = newGuess - n ** 0.5
  print("")
  print("Square root is:", newGuess)
  print("")
  print("Difference is:", diff)

main()