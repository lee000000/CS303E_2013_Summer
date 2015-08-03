#  File: DNA.py

#  Description: This program will find the longest common base sequence in two strands of DNA (or lines of characters) enterned by the user.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Mar 28 2014

#  Date Last Modified: Mar 28 2014

def min(a, b):
  if ( len(str(a)) <= len(str(b))):
    return a
  else:
    return b

def max(a, b):
  if ( len(str(a)) >= len(str(b))):
    return a
  else:
    return b  

def main():
  first_num = input ("Enter first strand: ")
  if (len(first_num) <= 1):
    first_num = input ("Enter first strand: ")        
  sec_num = input ("Enter second strand: ")
  if (len(sec_num) <= 1):
    sec_num = input ("Enter second strand: ")          
  print("")
  short_text = min( first_num, sec_num )              
  long_text = max( first_num, sec_num )                
  window = len(short_text)
  result = ""
  is_printed = False 
  while (window > 0):
    start_index = 0
    for start_index in range (0 , len(short_text) - window + 1 ):
      sub_str = short_text [ start_index : start_index + window ]
      if (long_text.find(sub_str, 0 , len(long_text) + 1) == -1):
        start_index += 1
      elif ((long_text.find(sub_str, 0 , len(long_text) + 1) != -1 )and \
             len(sub_str) < len(result)):
        start_index += 1
      elif ((long_text.find(sub_str, 0 , len(long_text) + 1) != -1 )and \
             len(sub_str) >= len(result)):
        result = sub_str
        if (is_printed == False):
          print("Common Substring(s): ")
          is_printed = True
        print(result)
        start_index += 1
    window = window - 1
  if (result == ""):
    print ("No Common Substrings Found")
main()