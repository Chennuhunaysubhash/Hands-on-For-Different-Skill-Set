from random import randint


def encryption_key(messages1, r1):
    asci = []
    asci_3 = ''
    for i in messages1:
        a = ord(i)
        asci.append(a)
    for j in asci:
        b = j + r1
        c = chr(b)
        asci_3 += c
    return asci_3


def decryption_key(d, r1):
    asci_4 = []
    original = ''
    for i in d:
        a = ord(i)
        asci_4.append(a)
    for k in asci_4:
        f = k - r1
        g = chr(f)
        original = original + g
    return original


def user_data():
    messages = input("Please Enter The Messages:  ")
    r = randint(1, 10)
    if r == 5:
        r = randint(1, 4)
    c = encryption_key(messages, r)
    print('Encryption Message :  ', c)
    condition = input('If you want decrypted message(Yes/No): ')
    if condition.lower() == 'yes':
        e = decryption_key(c, r)
        print('Decryption Messages and Original Messages: ', e)
    else:
        print('Process End...')


flag = True
print('Encryption and Decryption Process')
while flag:
    cond = input("if you want Encryption Messages? (Y/N): ")
    if cond.lower() == 'y':
        user_data()
    else:
        print("Process End And See You Again")
        flag = False
