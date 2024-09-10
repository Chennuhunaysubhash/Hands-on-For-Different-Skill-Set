list1 = [1, 2, 3, 4, 5, 6, 43, 5, 3, 2, 3, 1]
print(type(list1))
a = len(list1)
print(a)
print(list1)
list1 = list(set(list1))
# print(list1)
b = len(list1)
# print(b)
c = a-b
print("{} elements are duplicate in list".format(c))
