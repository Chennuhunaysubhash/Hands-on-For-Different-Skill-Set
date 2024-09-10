n = int(input('Enter No of Numbers: '))
l1 = []
for i in range(0, n):
    a = int(input(f'enter the numbers-{i+1}: '))
    l1.append(a)
print(l1)
for i in range(0, n):
    for j in range(0, n-1):
        if l1[j] > l1[j+1]:
            l1[j], l1[j+1] = l1[j+1], l1[j]
# l1.sort() if you want using sort method

print(l1)
print(f"2nd big number in among given numbers is {l1[-2]}")
