#  File: ISBN.py

#  Description: The program checks the validity of each ISBN in the file isbn.txt and save the result in another file isbnOut.txt.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: April 15

#  Date Last Modified: April 15

def remove_hyphen(var):         #define a function to remove all the "-" from each ISBN
  var = var.split("-")
  return ''.join(var)
  
def first_sum(var):             #define the function to calculate the first partial sums
  i = 0
  sum = 0
  s1 = []                       #s1 is the list for the first partial sums
  global is_valid
  is_valid = True               # set a boolean variable for determine whether to continue with the loop
  if (len(var) == 10):
    for i in range (0, len(var)):
      if (var[i].isdigit() == True):
        sum = sum + int(var[i])
        s1.append(sum)
      elif (var[i] == "X" or var[i] == "x" ):
        sum = sum + 10
        s1.append(sum)
      else:
        is_valid = False
        break
  else:
    is_valid = False
  if (is_valid == True):
      return s1
  else:
    is_valid = False

def second_sum(var):          #define the function to calculate the second partial sums
  j = 0
  sum = 0
  for j in range (0 ,len(var)):
    sum = int(var[j]) + sum
  return sum


def main():
  newfile = open ("isbn.txt" , "r")        #open file "isbn.txt" in "read" mode
  output = open("isbnOut.txt", "w")        #open new file "isbnOut.txt" in "write" mode
  line = newfile.readlines()               #read each line of the "isbn.txt" file into a list
  while ("\n" in line):                    #remove all the "\n" in the list
    line.remove("\n")
  out_txt = ""
  k = 0
  for k in range (0 , len(line)):
    line[k] = line[k].rstrip("\n")         #remove all the "\n" for each item in the list
    line_var = remove_hyphen(line[k])      #call remove_hyphen() function
    list_sum = first_sum(line_var)         #call function first_sum() to calculate the 1st partial sums
    if (is_valid == True):
      #use boolean variable to continue with second partial sum or write to the output file
      sum = second_sum(list_sum)
      if (sum % 11 == 0):                  #check if the final second partial sum is divisible by 11
        out_txt = line[k] + "  " + "Valid" + "\n"
        output.write(out_txt)
      else:
        out_txt = line[k] + "  " + "Invalid" + "\n"
        output.write(out_txt)
    else:
      out_txt = line[k] + "  " + "Invalid" + "\n"
      output.write(out_txt)
  newfile.close()                          #close "isbn.txt"
  output.close()                           #close "isbnOut.txt"
main()