user_name = ['Hunaysubhash', 'Sai Krishna', 'Manasa', 'jyothi']
user_id = ['500342', '500343', '500344', '500345']
user_password = ['1433', '5371', '5601', '5261']
amount = [20000, 3000, 4020, 5000]


def display_balance(name, n):
    global amount
    for i in name:
        if i == n:
            ind = name.index(i)
            break
    print(f'Balance: {amount[ind]}')


def cash_withdrawal(f, ind1):
    global amount
    amount[ind1] = f


name = input('User Name: ')
id = input('User id: ')
password = input('Password: ')
if name in user_name and id in user_id and password in user_password:
    print("1.Balance Inquiry")
    print("2.Cash Withdrawal")
    print("3.Pin Change")
    # print("4.User Details")
    option_no = [1, 2, 3]
    option = int(input('Enter The Option Number: '))
    if option in option_no:
        if option == 1:
            display_balance(user_name, name)
        elif option == 2:
            withdraw_amount = int(input('Enter The Withdraw Amount: '))
            ind = user_id.index(id)
            am = int(amount[ind])
            if withdraw_amount > am:
                print('your account not contain such amount of money')
            else:
                final_amount = am - withdraw_amount
                cash_withdrawal(final_amount, ind)
                display_balance(user_name, name)
        elif option == 3:
            name1 = input('Please Enter The User Name: ')
            id1 = input('User id: ')
            password1 = input('Password: ')
            if name1 in user_name and id1 in user_id and password1 in user_password:
                password2 = input('New Password or Pin Entered: ')
                password3 = input('Re-Enter Password or Pin: ')
                ind = user_id.index(id1)
                if len(password2) == 4 and len(password3) == 4:
                    if password2 == password3:
                        user_password[ind] = password2
                        print(user_password)
                    else:
                        print("Both New and Re-enter passwords are not same.")
                else:
                    print('Please The length of password or pin should be 4.')
            else:
                print('Please Enter Valid Data')
        else:
            print('invalid option')
else:
    print("Your data not found")
