def main():
  amount = 6
  price = 16.47
  outFile = open ('output.txt', 'w')
  outFile.write ("%2d %5.2f" % (amount, price))
  print ("%2d %5.2f" % (amount, price), file = outFile)
  outFile.close()
main()