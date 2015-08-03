#  File: WordSearch.py

#  Description: This programm will locate  each word in the word grid in the file named hidden.txt and output results to the file found.txt.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Partner Name:

#  Partner UT EID:

#  Course Name: CS 303E 

#  Unique Number: 53466

#  Date Created: April 22 2014

#  Date Last Modified: April 22 2014


#open file hidden.txt
def openfile():
  global newFile
  newFile = open ("hidden.txt", "r")
  return newFile

# find the numbers of columns and rows of the grid
def gridIndex():
  global index
  global line
  newFile = openfile()
  line = newFile.readlines()
  index = str(line[0]).split()  
  return index

#output word to text file
def output_word(x):
  global outFile
  outFile = open ("found.txt", "w")
  return outFile.write(x)
  
  

  


def main():
  index = gridIndex()
  newline = []

# m lines of letters
  m = int(index[0])

# n letters in each line
  n = int(index[1])

#create a list of words that need to be found
  for item in line:
    item = item.rstrip("\n")
    item = "".join(item.split(" "))
    newline.append(item)
  wordlist = newline[m + 4: len(newline) - 1 ]

#recreate the list of the lines in the grid without "\n"
  wordgrid_row = newline[2: m + 2]

#create a list of the columns in the grid
  i = 0
  j = 0
  wordgrid_column = []
  for i in range (0 , len(wordgrid_row[0])):
    temp_st = ""
    for j in range (0 , len(wordgrid_row)):
      temp_st = temp_st + str(wordgrid_row[j][i])
    wordgrid_column.append(temp_st)

#find the location of a given word
  result_list = []
  begin_index = 0
  end_index = 0
  in_row = True
  in_column = False
  for item in wordlist:
    k = 0
    l = 0
##   if (item in wordgrid_row  
  print(result_list)
  newFile.close()
main()