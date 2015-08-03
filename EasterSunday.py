#  File: EasterSunday.py

#  Description: This program will determine which date of the entered year is the Easter Sunday using Carl Friedrich Gauss's algorithm.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Feb 8 2014

#  Date Last Modified: Feb 8 2014

def main():
  y = int(input("Enter year: "))
  a = y % 19
  b = y // 100
  c = y % 100
  d = b // 4
  e = b % 4
  g = (8 * b + 13) // 25
  h = (19 * a + b - d - g + 15) % 30
  j = c // 4
  k = c % 4
  m = (a + 11 * h) // 319
  r = (2 * e + 2 * j - k - h + m + 32) % 7
  n = (h - m + r + 90) // 25
  p = (h - m + r + n + 19) % 32
  if (n == 3):
    mon = str("March")
  else:
    mon = str("April")
  print("In", y , "Easter Sunday is on", p , mon)
#  print("y ", y)
#  print("a ", a)
#  print("a ", a)
#  print("b ", b)
#  print("c ", c)
#  print("d ", d)
#  print("e ", e)
#  print("g ", g)
#  print("h ", h)
#  print("j ", j)
#  print("k ", k)
#  print("m ", m)
#  print("r ", r)
#  print("n ", n)
#  print("p ", p)
main()