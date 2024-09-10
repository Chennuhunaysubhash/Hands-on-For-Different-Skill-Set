import csv
import datetime
from datetime import date


def write_data(name, ph, am, pay):
    with open('pay_mood.csv', 'r+') as f:
        mydatalist = f.readline()
        namelist = []
        for line in mydatalist:
            entry = line.split(',')
            namelist.append(entry[0])
        if name not in namelist:
            now = datetime.datetime.now()
            dtstring = now
            f.writelines(f'\n{name},{ph},{am},{pay},{dtstring}')


def item_list():
    with open('Item_price.csv', 'r') as file:
        reader = csv.reader(file)
        for row in reader:
            print(row[0],"  ",row[1])


def total(c):
    with open('Item_price.csv', 'r') as file:
        reader = csv.reader(file)
        l = []
        sum = 0
        for row in reader:
            l.append(row)
        for i in c:
            if i-1 < len(l):
                if i == int(l[i-1][0]):
                   k = int(l[i-1][2])
                   sum = sum + k
            else:
                print('kk')
                break
        return sum


def bill_print(c):
    with open('Item_price.csv', 'r') as file:
        reader = csv.reader(file)
        l = []
        for row in reader:
            l.append(row)
        for i in c:
            if i-1 < len(l):
                if i == int(l[i-1][0]):
                    print(l[i-1][1], '                                 ',l[i-1][2])

            else:
                print('kk')
                break


def tax(am):
    t = (1 + 5/100)
    am1 = am*t
    am1 = am1 - am
    return am1


def discount(d):
    x = 9/100
    disc = d*x
    disc1 = disc - d
    return disc1

def paid_or_not(p):
    if p == 'yes':
        a = 'Paid'
        return a
    else:
        a = 'Not paid'
        return a




item = input('You Want Item List(yes/no): ')
item = item.lower()
if item == 'yes':
    item_list()
else:
    print('Ok ')

shop_open = True
while shop_open:
    print('')
    customer_name = input('Enter The Customer Name: ')
    customer_phone = input("Enter The Customer Phone Number: ")
    input_string = input('Enter Item Number: ')
    customer_items = input_string.split()
    today = date.today()
    for i in range(len(customer_items)):
        customer_items[i] = int(customer_items[i])

    print("\n*********************************************")
    print('SUpeR MobiLe....')
    print("----------------------------------------------")
    print('Name:', customer_name)
    print('Phone no:', customer_phone)
    print('Date:',today)
    print("----------------------------------------------")
    print('items                                   price')
    print(bill_print(customer_items))
    amount = total(customer_items)
    print("----------------------------------------------")
    print('amount:                                  ',amount)
    tax1 = tax(amount)
    print('Tax:                                   +',tax1)
    disc = discount(tax1)
    print('Discount:                              ', disc)
    print("----------------------------------------------")
    t=amount+tax1+disc
    print('Total:                                ',t)
    print("\n**********************************************")
    paid = input("Paid Or Not: ")
    paid = paid.lower()
    print('Bill:  ', paid_or_not(paid))
    pay_mood = input('payment mood: ')
    write_data(customer_name,customer_phone,t,pay_mood)
    a = input("open or close(o or c)")
    if a.lower() == 'c':
        shop_open = False
    else:
        continue