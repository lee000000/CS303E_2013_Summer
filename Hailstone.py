#  File: Hailstone.py

#  Description: The program will print out the interger that has the longest Hailstone sequence cycle within the range entered.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Mar 5 2014

#  Date Last Modified: Mar 5 2014

def main():
  n = int ( input ("Enter starting number of the range: "))
  while (n <= 0):
    pring("")
    n = int ( input ("Enter starting number of the range: "))
  print("")
  m = int ( input ("Enter ending number of the range: "))
  while ( m <= 0 or m < n):
    print("")
    m = int ( input ("Enter ending number of the range: "))
  max_cycle = 0
  for n in range (n, m + 1, 1):
    var_n = n
    step = 0    
    if ( n == 1): 
      step = 0
    else:
      while (var_n > 1):
        if (var_n % 2 == 0):
          var_n = var_n / 2
        else:
          var_n = var_n * 3 + 1
        step += 1
    if (max_cycle <= step):
      max_cycle = step
      max = n
  print("")
  print("The number", max, "has the longest cycle length of", str(max_cycle) + ".")
main()
