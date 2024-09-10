import csv


def item_list():
    with open('saving_accounts_data.csv', 'r') as file:
        reader = csv.reader(file)
        found = 0
        ml = []
        account = input("enter the account: ")
        for row in reader:
            if (row[1] != account):
                ml.append(row)
            else:
                found = 1
        if found == 0:
            print('data not found')
            file.close()
        else:
            file = open('saving_accounts_data.csv', 'w',newline='')
            csvw = csv.writer(file)
            csvw.writerows(ml)
            file.close()


item_list()