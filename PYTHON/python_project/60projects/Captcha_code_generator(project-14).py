import string
import random


print('Captcha code generator and verification ')
print('')
N = 7
res = ''.join(random.choices(string.ascii_uppercase + string.digits + string.ascii_lowercase, k=N))
print("The generated random string : " + str(res))

ver = input('Enter the captcha code:  ')
if res == ver:
    print('successfully done..')
else:
    print('please try again')
