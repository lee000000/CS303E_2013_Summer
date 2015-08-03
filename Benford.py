#  File: Benford.py

#  Description: The program reads the file "Census_2009.txt" and prints out the total count of numbers beginning with number from 1 through 9 respectively. 

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number:  53466

#  Date Created: April 28 2014

#  Date Last Modified: April 28 2014


def main():
#read file "Census_2009.txt"
  global pop_num
  pop_num = []
  inFile = open ("./Census_2009.txt", "r")
  count = 0
  for line in inFile:
    if (count == 0):
      count += 1
      continue
    else:
      count += 1
      line = line.strip()
      word_list = line.split()
      pop_num.append (word_list[-1])
  inFile.close()
  print ("{:<7} {:<9} {:}".format("Digit","Count","%"))


#create dictionary numdict
  numdict = {}
  digit = 1
  for digit in range (1, 10):
    numlist = []
    for item in pop_num:
      if (int(item[0]) == digit):
        numlist = numlist + [item]
    numdict [digit] = numlist


#count
  total_count = 0
  count_list = []
  for item in numdict.values():
    total_count = len(item)
    count_list = count_list + [total_count]

#print result
  ratio = 0
  i = 0
  for i in range (0, len(count_list)):
    ratio = round(count_list[i] / sum(count_list) * 100 , 1)
    print ( "{:<7} {:<9} {:<7}".format(i+1 , count_list[i],ratio))
     
main()