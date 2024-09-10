import csv


def item_list():
    with open('saving_accounts_data.csv', 'r') as file:
        reader = csv.reader(file)
        m = []
        found = 0
        account = input('enter the account:')
        for row in reader:
            if row[1] == account:
                row[7] = 10000
                print('jj')
                found = 1
            m.append(row)
    if found == 0:
        print('jk')
        file.close()
    else:
        file = open('saving_accounts_data.csv', 'w', newline='')
        csw = csv.writer(file)
        csw.writerows(m)
        file.close()


item_list()