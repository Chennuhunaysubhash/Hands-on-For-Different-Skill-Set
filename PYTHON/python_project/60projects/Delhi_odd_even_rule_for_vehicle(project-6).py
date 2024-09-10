import datetime


def bike_number(num):
    s = 0
    while num > 0:
        s = s + num % 10
        num = int(num/10)
    return s


def check_num(x):
    d = bike_number(x)
    if d > 9:
        out_put = bike_number(d)
    else:
        out_put = d
    return out_put


def even_or_odd(y):
    if y % 2 == 0:
        if y == 0:
            print('Invalid Or You Enter All Zeros(like xx 37 cx 0000)')
        else:
            bike_condition = 'EVEN'
            return bike_condition
    else:
        bike_condition = 'ODD'
        return bike_condition


def input_number(condition1, b1):

    c = int(b1)
    check = bike_number(c)
    if check > 9:
        out_put1 = check_num(check)
        bike_condition1 = even_or_odd(out_put1)
    else:
        bike_condition1 = even_or_odd(check)
    if condition1 == bike_condition1:
        print('Vehicle On Road ')
    else:
        print('Vehicle Not On Road ')


now = datetime.datetime.now()
now1 = now.strftime("%A")
weeks_odd = ['monday', 'wednesday', 'friday']
weeks_even = ['tuesday', 'thursday', 'saturday']
# if now1.lower() in weeks_odd:
# print('Today is Odd Number Vehicle On Road')
# elif now1.lower() in weeks_even:
# print('Today is Even Number Vehicle On Road')

vehicle_num = input('Enter The Vehicle Number: ')
print(vehicle_num.upper())
vehicle_num = vehicle_num.replace(' ', '')
a = len(vehicle_num)
if a <= 10:
    b = vehicle_num[6:10]
    if now1.lower() in weeks_odd:
        print('Today Is Odd Number Vehicle On Road')
        condition = 'ODD'
        input_number(condition, b)
    elif now1.lower() in weeks_even:
        print('Today Is Even Number Vehicle On Road')
        condition = 'EVEN'
        input_number(condition, b)
    else:
        print("Today Is SUNDAY So Road Are Block")
else:
    print("Invalid Vehicle Number")
