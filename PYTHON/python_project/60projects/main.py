import csv
import datetime
from datetime import date

with open('Item_price.csv', 'r') as file:
    reader = csv.reader(file)
    l =[]
    for row in reader:
        l.append(row)
    print(l[0][0])

