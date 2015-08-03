#  File: Cipher.py

#  Description: This programm will first read the input.txt file to which the user will decide wether to encrypt or deccrypt the lines read. The output will be stored in the output.txt file.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Partner Name:

#  Partner UT EID:

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: April 4 2014

#  Date Last Modified: April 4 2014

def ciph():                         #define the function to read and input the input.txt
  file = open ( 'input.txt', 'r')
  filecontent = file.read()
  lenfile = len(filecontent)
  oddIndex = 1
  evenIndex = 0
  oddStr = ""
  evenStr = ""
  for evenIndex in range ( 0 , lenfile , 2):     #save all even index number to evenStr
    evenStr = evenStr + filecontent [ evenIndex : evenIndex + 1]
    evenIndex = evenIndex + 2
  for oddIndex in range ( 1 , lenfile  , 2):     #save all odd index number to oddStr
    oddStr = oddStr + filecontent [ oddIndex : oddIndex + 1]
    oddIndex = oddIndex + 2
  return oddStr + evenStr                        #function returns oddStr + evenStr
  file.close()

def decrypt():                    #define the function to read and decrypt the output.txt
  file = open ( 'output.txt', 'r')
  filecontent = file.read()
  lenfile = len(filecontent)
  if (lenfile % 2 == 0):         
  #calculate the length of the original character with odd index
    lenOdd = int(lenfile / 2)
  else:
    lenOdd = int((lenfile - 1) / 2)
  newStr = ""
  index = 0
  for index in range (0 , lenOdd):
  #rearrange the characters and save to newStr
    newStr = newStr + filecontent [ lenOdd + index : lenOdd + index + 1 ]\
		+ filecontent [ index : index + 1]
    index += 1
  return newStr            #function returns newStr
  file.close()
 

def main():
  command = input ("Do you want to encrypt or decrpyt? (E / D): ")
  print("")
  if (command == "E"):      #condition if user enters E to encrypt
    outStr = ciph()         #call function ciph() and save function result to outStr
    out_file = open ('output.txt', 'w')      #create output.txt and write outStr to it
    out_file.write (outStr)
    out_file.close()                         #save and close output.txt
    print("Output written to output.txt")
  elif (command == "D"):   #condition if user enters D to decrypt
    outStr = decrypt()       #call function decrypt() and save function result to outStr
    out_file = open('output.txt','w')     #create output.txt and wrtite outStr to it
    out_file.write (outStr)
    out_file.close()                      #save and close output.txt
    print("Output written to output.txt")
  elif (command != "E" and command != "D"):        #conditions when wrong commands are entered
    print("Wrong input. Bye.")
    return False   
main()
  
