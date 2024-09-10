# import validate_email
import re
from validate_email import validate_email


def email_check(mail):
    is_valid = validate_email(mail)
    return is_valid


def password_check(m):
    reg = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!#%*?&]{8,18}$"
    match_re = re.compile(reg)
    res = re.search(match_re, m)
    if res == 'None':
        return False
    else:
        return True


def email_data():
    email = input("Enter the Email id: ")
    re_email = input("please Re-enter email id: ")
    pswd = input("Enter the password: ")
    re_pswd = input("please Re-enter the password: ")
    print('\n', "#"*24)
    em1 = email_check(email)
    em2 = email_check(re_email)
    if em1 == em2:
        if email == re_email:
            print("Email valid and accept...")
        else:
            print('email not matching....')
    else:
        print('email not valid....')

    if len(pswd) >= 8:
        r = password_check(pswd)
        r1 = password_check(re_pswd)
        if r == r1:
            if r:
                c = True
            else:
                c = False
        else:
            print("Invalid Password")
        if pswd == re_pswd and c == True:
            print("password valid and accept...")
        else:
            print('password not matching....')
            print('Please Re-again onc\'s')
    else:
        print("Password to short")
    print("#"*24)


condition = True
while condition:
    a = input("If you went to checking mail and password validation(y/n): ")
    if a.lower() == 'y':
        print('*'*24)
        email_data()
    else:
        print('Validation is Closed........')
        condition = False
