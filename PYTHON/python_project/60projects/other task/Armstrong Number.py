num = int(input("Enter a number: "))
order = len(str(num))
sum1 = 0
temp = num

while temp > 0:
    digit = temp % 10
    # sum1 += digit ** order
    sum1 += pow(digit, order)
    temp //= 10

if num == sum1:
    print(num, "is an Armstrong number")
else:
    print(num, "is not an Armstrong number")
