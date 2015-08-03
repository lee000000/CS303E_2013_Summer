def main():
  annualR = input("Enter rate: ")
  monthR = float(annualR) / 1200

  investAmount = float(input("Enter invest amount: "))
  year = int(input("Enter number of years: "))

  totalInvest = (investAmount * ((1 + monthR) ** (12 * year)))
  print("Total is " + str(totalInvest))
main()