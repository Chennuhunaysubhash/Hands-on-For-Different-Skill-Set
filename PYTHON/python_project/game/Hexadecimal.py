hex = input("Enter Hexadecimal Number: ")

c = count = i = 0
len = len(hex) - 1
while len >= 0:
    if hex[len] >= '0' and hex[len] <= '9':
        rem = int(hex[len])
    elif hex[len] >= 'A' and hex[len] <= 'F':
        rem = ord(hex[len]) - 55
    elif hex[len] >= 'a' and hex[len] <= 'f':
        rem = ord(hex[len]) - 87
    else:
        c = 1
        break
    count = count + (rem * (16 ** i))
    print(count)
    len = len - 1
    i = i + 1

if c == 0:
    print("\nDecimal Value = ", count)
else:
    print("\nInvalid Input!")