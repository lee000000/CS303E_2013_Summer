#  File: CreditCard.py

#  Description: This program uses the Luhn's algorithm to test the validity of the entered 16 digits credit card number and output the result. Extra Credit: The program also tells if the number entered indicates whether the card is a VISA or MasterCard.

#  Student Name: Chengxi Li

#  Student UT EID: cl29385

#  Course Name: CS 303E

#  Unique Number: 53466

#  Date Created: Feb 3 2014

#  Date Last Modified: Feb 5 2014

def main():
  cardno = int(input("Enter 16-digit credit card number: "))
  firstd = cardno//(10 ** 15)
  secd = (cardno // (10 ** 14)) % 10
  dg_sum = 0  
  for x in range(16, 0, -1):
    x = len(str(cardno))
    if x % 2 == 1:
      dg_sum = dg_sum + (cardno % 10 * 2)//10 + (cardno % 10 * 2)%10
    else:
     dg_sum = dg_sum + cardno % 10
    cardno = cardno // 10
  if dg_sum%10 == 0:
    if firstd == 4:
      print("Valid credit card number")
      print("VISA")
    elif firstd == 5 and (secd == 0 or secd == 1 or secd == 2 or\
         secd == 3 or secd == 4 or secd == 5):
      print("Valid credit card number")
      print("MasterCard")
    else:
      print("Valid credit card number")
  else:
    print("Invalid credit card number")    
main()