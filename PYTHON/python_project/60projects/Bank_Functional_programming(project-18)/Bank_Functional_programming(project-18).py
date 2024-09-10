from random import randint
import datetime
import csv

admin_id = [56789, 56790, 56791]
admin_name = ['Hunaysubhash chennu', 'Sai krishna K', 'Manasa P']
admin_password = ['hunay@money_bank', 'saikrishna@money_bank', 'manasa@money_bank']


def remove_account():
    u = input('User Name: ')
    a = input('Account Number: ')
    ty = input('Account Type: ')
    if ty.casefold() == 'saving':
        path = 'saving_accounts_data.csv'
        try:
            with open(path, 'r') as file:
                reader = csv.reader(file)
                user = []
                account = []
                money = []
                for row in reader:
                    money.append(row[7])
                    user.append(row[0])
                    account.append(row[1])
                if u in user and a in account:
                    ind = user.index(u)
                    ind1 = account.index(a)
        except:
            print('Invalid Data')
    elif ty.casefold() == 'business':
        path = 'business_account_data.csv'
        try:
            with open(path, 'r') as file:
                reader = csv.reader(file)
                user = []
                account = []
                money = []
                for row in reader:
                    money.append(row[8])
                    user.append(row[0])
                    account.append(row[1])
                if u in user and a in account:
                    ind = user.index(u)
                    ind1 = account.index(a)
        except:
            print('Invalid Data')
    else:
        print('Invalid Data')
    try:
        with open(path, 'r') as file:
            reader = csv.reader(file)
            found = 0
            ml = []
            account = input(" Again Enter The Account: ")
            if ind == ind1:
                for row in reader:
                    if row[1] != account:
                        ml.append(row)
                    else:
                        found = 1
            else:
                print('..........')
            if found == 0:
                print('Data Not Found')
                file.close()
            else:
                file = open(path, 'w', newline='')
                csvw = csv.writer(file)
                csvw.writerows(ml)
                file.close()
                if a == account:
                    print('User Name: {} '.format(u))
                    print('Account Type: {}'.format(ty))
                    print('{} Account Is Removed. '.format(a))
                    print('Please Collect Your Money ')
                    print('Amount is {}'.format(money[ind]))
                    fi = int(money[ind]) - 35
                    print('Final Amount After Cut All Tax Is {}'.format(fi))
                else:
                    print('Invalid Data')
    except:
        print('Invalid Data')


def withdrawal_money():
    u = input('User Name: ')
    a = input('Account Number: ')
    ty = input('Account Type: ')
    if ty.casefold() == 'saving':
        path = 'saving_accounts_data.csv'
        am1 = 7
    elif ty.casefold() == 'business':
        path = 'business_account_data.csv'
        am1 = 8
    else:
        print('Invalid Data')
    try:
        with open(path, 'r') as file:
            reader = csv.reader(file)
            user = []
            account = []
            amount1 = []
            for row in reader:
                user.append(row[0])
                account.append(row[1])
                amount1.append(row[am1])
            if u in user and a in account:
                ind1 = account.index(a)
                ind = user.index(u)
                if ind == ind1:
                    money = int(input('Enter The Amount To Withdrawal: '))
                    amount2 = amount1[ind]
                    with open(path, 'r') as file1:
                        reader = csv.reader(file1)
                        m = []
                        found = 0
                        for row in reader:
                            if row[1] == a:
                                if money <= int(amount2):
                                    row[am1] = int(amount2) - money
                                    balance1 = int(amount2) - money
                                    # print('jj')
                                    found = 1
                                    print('Balance: {}'.format(balance1))
                                else:
                                    print('Money Overload... ')
                            m.append(row)
                    if found == 0:
                        # print('jk')
                        file1.close()
                    else:
                        file1 = open(path, 'w', newline='')
                        csw = csv.writer(file1)
                        csw.writerows(m)
                        file1.close()
                else:
                    print('Invalid Data')

            else:
                print('Invalid Data.')
    except:
        print('Incorrect Data Entered')


def deposit_money():
    u = input('User Name: ')
    a = input('Account Number: ')
    ty = input('Account Type: ')
    if ty.casefold() == 'saving':
        path = 'saving_accounts_data.csv'
        am1 = 7
    elif ty.casefold() == 'business':
        path = 'business_account_data.csv'
        am1 = 8
    else:
        print('Invalid Data')
    try:
        with open(path, 'r') as file:
            reader = csv.reader(file)
            user = []
            account = []
            amount1 = []
            for row in reader:
                user.append(row[0])
                account.append(row[1])
                amount1.append(row[am1])
            if u in user and a in account:
                ind1 = account.index(a)
                ind = user.index(u)
                if ind == ind1:
                    money = int(input('Enter The Amount To Deposit: '))
                    amount2 = amount1[ind]
                    with open(path, 'r') as file1:
                        reader = csv.reader(file1)
                        m = []
                        found = 0
                        for row in reader:
                            if row[1] == a:
                                row[am1] = int(amount2) + money
                                balance1 = int(amount2) + money
                                # print('jj')
                                found = 1
                                print('Balance: {}'.format(balance1))

                            m.append(row)
                    if found == 0:
                        # print('jk')
                        file1.close()
                    else:
                        file1 = open(path, 'w', newline='')
                        csw = csv.writer(file1)
                        csw.writerows(m)
                        file1.close()
                else:
                    print("Invalid Data Entered")

            else:
                print('Invalid Data.')
    except:
        print('Invalid Data')


def user_details():
    user = input('User Name: ')
    account_no = input("Account Number: ")
    account_type1 = input('Account Type: ')
    user_name = []
    account_number = []
    mobile_no = []
    account_type = []
    id_proof = []
    batch_name = []
    amount = []
    business_name = []
    date = []
    if account_type1.casefold() == 'saving':
        try:
            with open('saving_accounts_data.csv', 'r') as file:
                reader = csv.reader(file)
                for row in reader:
                    user_name.append(row[0])
                    account_number.append(row[1])
                    mobile_no.append(row[2])
                    account_type.append(row[3])
                    id_proof.append(row[4])
                    batch_name.append(row[5])
                    amount.append(row[7])
                    date.append(row[8])
            if user in user_name and account_no in account_number:
                ind = user_name.index(user)
                ind1 = account_number.index(account_no)
                if ind == ind1:
                    print("*" * 40)
                    print('User Name: {}'.format(user))
                    print('Account Number: {}'.format(account_no))
                    print('Mobile No: {}'.format(mobile_no[ind]))
                    print('Id Proof: {}'.format(id_proof[ind]))
                    print('Account Type: {}'.format(account_type[ind]))
                    print('Batch Name: {}'.format(batch_name[ind]))
                    print('Amount Or Balance: {}'.format(amount[ind]))
                    print("Creation Date and time: {}".format(date[ind]))
                    print("*" * 40)
                else:
                    print('Invalid Data')
            else:
                print('Invalid Data...')
        except:
            print("Invalid Data")
    elif account_type1.casefold() == 'business':
        try:
            with open('business_account_data.csv', 'r') as file:
                reader = csv.reader(file)
                for row in reader:
                    user_name.append(row[0])
                    account_number.append(row[1])
                    mobile_no.append(row[2])
                    account_type.append(row[3])
                    id_proof.append(row[4])
                    business_name.append(5)
                    batch_name.append(row[6])
                    amount.append(row[8])
                    date.append(row[9])
            if user in user_name and account_no in account_number:
                ind = user_name.index(user)
                ind1 = account_number.index(account_no)
                if ind == ind1:
                    print("*" * 40)
                    print('User Name: {}'.format(user))
                    print('Account Number: {}'.format(account_no))
                    print('Mobile No: {}'.format(mobile_no[ind]))
                    print('Id Proof: {}'.format(id_proof[ind]))
                    print('Account Type: {}'.format(account_type[ind]))
                    print('Business Name: {}'.format(batch_name[ind]))
                    print('Batch Name: {}'.format(batch_name[ind]))
                    print('Amount or Balance: {}'.format(amount[ind]))
                    print("Creation Date and time: {}".format(date[ind]))
                    print("*" * 40)
                else:
                    print('Invalid Data')
            else:
                print('Invalid Data...')
        except:
            print("Invalid Data")


def write_data(user, account_no, mobile, types, id1, batch, bank, amount):
    try:
        with open('saving_accounts_data.csv', 'r+') as f:
            mydatalist = f.readline()
            namelist = []
            for line in mydatalist:
                entry = line.split(' ,')
                namelist.append(entry[0])
            if name not in namelist:
                now = datetime.datetime.now()
                dtstring = now.strftime('%d/%m/%y %H:%M')
                f.writelines(f'\n{user},{account_no},{mobile},{types},{id1},{batch},{bank},{amount},{dtstring}')
    except:
        print('Invalid Data')


def write_data_for_business(user, account_no, mobile, types, id1, business, batch, bank, amount):
    try:
        with open('business_account_data.csv', 'r+') as f:
            mydatalist = f.readline()
            namelist = []
            for line in mydatalist:
                entry = line.split(' ,')
                namelist.append(entry[0])
            if name not in namelist:
                now = datetime.datetime.now()
                dtstring = now.strftime('%d/%m/%y %H:%M')
                f.writelines(
                    f'\n{user},{account_no},{mobile},{types},{id1},{business},{batch},{bank},{amount},{dtstring}')
    except:
        print('Invalid Data')


def balance_display_saving(uname1, account1):
    try:
        with open('saving_accounts_data.csv', 'r') as file:
            reader = csv.reader(file)
            uname = []
            uaccount_no = []
            uamont = []
            account_type = []
            for row in reader:
                # print(row[0],"  ",row[1])
                uname.append(row[0])
                uaccount_no.append(row[1])
                uamont.append(row[7])
                account_type.append(row[3])
        # print(uname)
        # print(uamont)
        # print(uaccount_no)
        if uname1 in uname and account1 in uaccount_no:
            ind = uaccount_no.index(account1)
            ind1 = uname.index(uname1)
            if ind == ind1:
                print('-' * 40)
                print('User Name: {}'.format(uname1))
                print('Account Number: {}'.format(account1))
                am = uamont[ind]
                print('Balance: {}'.format(am))
                print('-' * 40)
            else:
                print('Invalid Data')
        else:
            print('Invalid Data')
    except:
        print('Invalid Data')


def balance_display_business(uname1, account1):
    try:
        with open('business_account_data.csv', 'r') as file:
            reader = csv.reader(file)
            uname = []
            uaccount_no = []
            uamont = []
            account_type = []
            for row in reader:
                # print(row[0],"  ",row[1])
                uname.append(row[0])
                uaccount_no.append(row[1])
                uamont.append(row[8])
                account_type.append(row[3])
        # print(uname)
        # print(uamont)
        # print(uaccount_no)
        if uname1 in uname and account1 in uaccount_no:
            ind = uaccount_no.index(account1)
            ind1 = uname.index(uname1)
            if ind == ind1:
                print('-' * 40)
                print('User Name: {}'.format(uname1))
                print('Account Number: {}'.format(account1))
                am = uamont[ind]
                print('Balance: {}'.format(am))
                print('-' * 40)
            else:
                print('Invalid Data')
        else:
            print('Invalid Data')
    except:
        print('Invalid Data')


def balance():
    uname = input("User Name: ")
    uaccount = input('Account Number: ')
    account_type = input('Account Type: ')
    if account_type.casefold() == 'saving':
        balance_display_saving(uname, uaccount)
    elif account_type.casefold() == 'business':
        balance_display_business(uname, uaccount)
    else:
        print('Invalid Account Type..')

#
# def account_numbers(account_type):
#     if account_type.casefold() == 'saving':
#         with open('saving_accounts_data.csv', 'r') as file:
#             reader = csv.reader(file)
#             account_numbers1 = []
#             for row in reader:
#                 account_numbers1.append(row[1])
#             return account_numbers
#     elif account_type.casefold() == 'business':
#         with open('business_account_data.csv', 'r') as file:
#             reader = csv.reader(file)
#             account_numbers2 = []
#             for row in reader:
#                 account_numbers2.append(row[1])
#             return account_numbers2


def new_saving_account():
    try:
        user = input('Enter The User Name: ')
        user_id_proof = input("Enter The Id proof: ")
        user_phone = input('Mobile Number: ')
        account_type = input('Account Type: ')
        bank = input('Bank Name: ')
        batch = input("Enter The Batch Name: ")
        if account_type.casefold() == 'saving':
            with open('saving_accounts_data.csv', 'r') as file:
                reader = csv.reader(file)
                account_numbers1 = []
                for row in reader:
                    account_numbers1.append(row[1])
            account_num1 = randint(1001, 9999)
            account_num2 = randint(10, 99)
            user_account_number = '62234' + str(account_num2) + str(account_num1)
            # user_account_number ='62234235639'
            if user_account_number in account_numbers1:
                user_account_number1 = '34562' + str(account_num2) + str(account_num1)
                # user_account_number1 = '34562789456'
                print('-' * 40)
                print('user account number: {}'.format(user_account_number1))
                print('-' * 40)
                amount = int(input('Deposit Money: '))
                write_data(user, user_account_number1, user_phone, account_type.casefold(), user_id_proof, batch, bank,
                           amount)
            # print(user, user_phone,user_account_number,user_id_proof,account_type)
            else:
                print('-' * 40)
                print('User Account Number: {}'.format(user_account_number))
                print('-' * 40)
                amount = int(input('Deposit Money: '))
                write_data(user, user_account_number, user_phone, account_type.casefold(), user_id_proof, batch, bank,
                           amount)
        else:
            print('Incorrect Account Type.')
    except:
        print('Invalid Data')


def new_business_account():
    try:
        user = input('Enter The User Name: ')
        user_id_proof = input("Enter The Id proof: ")
        user_phone = input('Mobile Number: ')
        account_type = input('Account Type: ')
        business = input("Business Name: ")
        bank = input('Bank Name: ')
        batch = input("Enter The Batch Name: ")
        if account_type.casefold() == 'business':
            with open('business_account_data.csv', 'r') as file:
                reader = csv.reader(file)
                account_numbers1 = []
                for row in reader:
                    account_numbers1.append(row[1])
            account_num1 = randint(1001, 9999)
            account_num2 = randint(10, 99)
            user_account_number = '62234B' + str(account_num2) + str(account_num1)
            if user_account_number in account_numbers1:
                # print(user, user_phone,user_account_number,user_id_proof,account_type)
                user_account_number1 = '3634B' + str(account_num2) + str(account_num1)
                print('-' * 40)
                print('User Account Number: {}'.format(user_account_number1))
                print('-' * 40)
                amount = int(input('Deposit Money: '))
                write_data_for_business(user, user_account_number1, user_phone, account_type.casefold(), user_id_proof,
                                        business, batch, bank, amount)
            else:
                print('-' * 40)
                # print(user, user_phone,user_account_number,user_id_proof,account_type)
                print('User Account Number: {}'.format(user_account_number))
                print('-' * 40)
                amount = int(input('Deposit Money: '))
                write_data_for_business(user, user_account_number, user_phone, account_type.casefold(), user_id_proof,
                                        business, batch, bank, amount)
        else:
            print('Incorrect Account Type.')
    except:
        print('Invalid Data')


try:

    Id = int(input('Admin Id: '))
    name = input('Admin Name: ')
    password = input('Admin Password: ')
    if Id in admin_id and name in admin_name and password in admin_password:
        condition = True
        while condition:
            print()
            print("-" * 40)
            print('0.Closing.')
            print('1.Create New Saving Account.')
            print('2.Create New Business Account.')
            # print('3.Create New Joint Account.')
            print('3.Balance Check.')
            print('4.Display user details.')
            print('5.Remove User Account.')
            print('6.Withdrawal Money From Account.')
            print('7.Deposit money to account. ')
            print("-" * 40)
            print()
            choice = int(input('Option: '))
            if choice == 1:
                new_saving_account()
            elif choice == 2:
                new_business_account()
            elif choice == 3:
                balance()
            elif choice == 4:
                user_details()
            elif choice == 5:
                remove_account()
            elif choice == 6:
                withdrawal_money()
            elif choice == 7:
                deposit_money()
            elif choice == 0:
                print("Bank Closing Time.. ")
                print('Close')
                condition = False
            else:
                print('Invalid Option.')
    else:
        print('Your Are Not Admin Of This Work..')
except:
    print('Invalid Data')
