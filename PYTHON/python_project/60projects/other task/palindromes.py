str1 = input("enter the string: ")
# str3 = str1.lower()
str2 = str1[::-1]
print(str1)
# print(str2)
if str1.casefold() == str2.casefold():
    print('palindromes')
else:
    print("not")

