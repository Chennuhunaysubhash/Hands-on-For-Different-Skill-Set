import random
passlen = int(input("enter the length of password: "))
try:
    s = "abcdefghijklmnopqrstuvwxyz01234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()?"
    p = "".join(random.sample(s, passlen))
    print(p)

except ValueError:
    print('to mach length')
