#  File: Day.py

#  Description: The program will print out the day with the inputs of the date and the year. 

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Feb 16 2014

#  Date Last Modified: Feb 17 2014

def main():
  x = int(input("Enter year: "))
  y = int(input("Enter month: "))
  b = int(input("Enter day: "))
  d = x // 100
  if (y == 1 or y == 2):
    a = y + 10
    c = (x - 1 ) % 100
    d = x // 100 - 1
  else:
    a = y - 2
    c = x % 100
    d = x // 100
  w = (13 * a - 1 ) // 5 
  x = c // 4 
  y = d // 4 
  z = w + x + y + b + c - 2 * d 
  if ((z % 7) >= 0):
    r = z % 7
  else:
    r = (r + 7) % 7
  print("")
#  print("The day is", ("Monday." if r == 1 else \
#                      ("Tuesday." if r == 2 else \
#                      ("Wednesday." if r == 3 else \
#                      ("Thursday." if r == 4 else \
#                      ("Friday." if r == 5 else \
#                      ("Saturday." if r == 6 else \
#                      ("Sunday."))))))))
  if (r == 1):
    day = "Monday."
  elif (r == 2):
    day = "Tuesday."
  elif (r == 3):
    day = "Wednesday."
  elif (r == 4):
    day = "Thursday."
  elif (r == 5):
    day = "Friday."
  elif (r == 6):
    day = "Saturday"
  else:
    day = "Sunday."
  print("The day is",day)
main()