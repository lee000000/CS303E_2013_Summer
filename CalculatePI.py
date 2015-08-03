#  File: CalculatePI.py

#  Description: This programm will compute the approximate value of PI using Monte Carlo simulation.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Mar 23 2014

#  Date Last Modified: Mar 23 2014

import random
import math
print("Computation of PI using Random Numbers")
print("")

def computePI( numThrows ):                 #define function "computePI"
  global pi                                 #define a global variable pi
  i = 1                                     #initial value for loop
  success = 1                               #initial value for number of darts in the circle
  for i in range (1, numThrows + 1):        #compute total number of darts in the circle
    xPos = random.uniform (-1.0, 1.0)
    yPos = random.uniform (-1.0, 1.0)
    if (math.hypot(xPos, yPos)<= 1):
      success += 1
    pi = (success / numThrows) * 4                  #compute PI
    i += 1
  return pi


def main():                                 #main function
  j = 2
  numThrows = 100
  while (numThrows <= 10000000):
#  for j in range (2, 8):                    #compute 6 simulated pi values with different number of throws
#    numThrows = 10 ** j
    computePI( numThrows )                  #call function computePI with result "pi"
    new_pi = format ( pi, ".6f" )           #format the pi variable to show 6 decimal places
    diff = round(pi - math.pi , 6)          #compute and round the difference to 6 decimal places
    space = (7 - j) * (" ")                 #align the columns  
    print("num = ", numThrows, space, "Calculated PI = ", new_pi, "Difference = ","{:+f}".format(diff))
    numThrows = numThrows * 10
  print("")
  print("Difference = Calculated PI - math.pi")
main() 
    