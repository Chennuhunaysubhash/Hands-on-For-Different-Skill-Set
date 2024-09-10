import csv
import pandas as pd
import datetime
from datetime import date


def item_list():
    with open('trains_list.csv', 'r') as file:
        reader = csv.reader(file)
        for row in reader:
            print(row[0],row[1])


def comparing(p):
    with open('trains_list.csv', 'r') as file:
        reader = csv.reader(file)
        l = []
        b = 0
        for row in reader:
            l.append(row)
            c = l[b][2]
            c1 = c.lower()
            if p == c1:
                return l[b][0], l[b][1], c, l[b][3], l[b][4]
            b = b+1


def write_data(name, ph, id, pt, tr, d, t):
    with open('railway_databade.csv', 'r+') as f:
        mydatalist = f.readline()
        namelist = []
        for line in mydatalist:
            entry = line.split(',')
            namelist.append(entry[0])
        if name not in namelist:
            now = datetime.datetime.now()
            dtstring = now
            f.writelines(f'\n{name},{ph},{id},{pt},{tr},{d},{t},{dtstring}')


def ticket_print(n,p,id,c1,d1,e1,f1,g1,t1):
    print('#' * 120)
    print('Railway Booking')
    print('Indian Railway ')
    print('-' * 120)
    print('Name: ', n)
    print('Aadharr Id(or) Other Id:', id)
    print('phone: ', p)
    print('-' * 120)
    print('Train Name                Train id                 Route                              Time')
    print(c1, '              ', d1, '                 ', e1, '           ', f1)
    print('No Ticket: ', t1,'           Price: ',t1*28)
    print('Platform Number: ', g1)
    print('#' * 120)


condition = True
while condition:
    passeger_name = input("Enter the passenger name: ")
    passeger_phone = input("Phone Number: ")
    passeger_id = input("Id number:")
    aadhaar_num = passeger_id.replace(' ', '')
    length = len(aadhaar_num)
    passeger_path = input("Travelling Path: ")
    passeger_ticket = int(input('Number of Ticket: '))
    if length == 12:
        path1 = passeger_path.lower()
        try:
            c, d, e, f, g = comparing(path1)
            write_data(passeger_name, passeger_phone, passeger_id, passeger_path, c, d, passeger_ticket)
            ticket_print(passeger_name, passeger_phone, passeger_id,  c, d,e,f,g, passeger_ticket)

        except:
            print("Travelling Path Not found")

        con = input('\n Booking Close Or Not:')
        if con == 'yes' or con == 'y':
            condition = False

    else:
        print("Invaild Id Proof")






