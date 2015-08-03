def main():
  line = input("Enter a string:")
  i = 0
  for i in range (0 , len(line)):
    if ( line[i] == " "):
      line = line[0:i] + line[i + 1:]
  freq = 0
  cha = ""
  word_dict = {}
  for ch in line:
    freq = line.count(ch)
    line.replace(ch,"")
    word_dict[ch] = freq
  print (word_dict)
main()