import datetime
from datetime import date



def write_data(name, ad, age1, spc1, v):
    with open('Vaccination.csv', 'r+') as f:
        mydatalist = f.readline()
        namelist = []
        for line in mydatalist:
            entry = line.split(',')
            namelist.append(entry[0])
        if name not in namelist:
            now = datetime.datetime.now()
            dtstring = now.strftime('%H:%M:%S')
            f.writelines(f'\n{name},{ad},{age1},{spc1},{v},{dtstring}')


def data(a, min_age, vacc):
    current_date = date.today()
    current_year = current_date.year
    num = input('Enter The Aadhaar Number: ')
    aadhaar_num = num.replace(' ', '')
    # length of aadhaar_num
    length = len(aadhaar_num)
    if length == 12:
        candidate_name = input('Enter The Candidate Name As For Aadhaar Card: ')
        date_of_birth = input('Date Of Birth (DD-MM-YYYY): ')
        special_condition = input('Frontline Warriors Or Not (Yes/No): ')
        spc = special_condition.lower()
        year = date_of_birth[6:10]
        year = int(year)
        age = current_year - year
        if (age >= 18 and spc == 'yes'):
            print('Vaccination Successfully Done')
            write_data(candidate_name, num, age, spc, vacc)
            amount = a + 1
            return amount
        elif (age >= min_age and spc == 'no'):
            print('Vaccination Successfully Done')
            write_data(candidate_name, num, age, spc, vacc)
            amount = a + 1
            return amount
        else:
            print(f'Vaccination only for {min_age} years')
            return a
    else:
        print('Enter Current Aadhaar Number')
        return a


vaccination_am = int(input("Amount of Vaccination:  "))
min_age_vaccination = int(input('Enter Minimum age for Vaccination: '))
vaccine_name = input('Enter Vaccine Name: ')
amount = 0
while amount < vaccination_am:
    amount = data(amount, min_age_vaccination, vaccine_name)
    if amount < vaccination_am:
        print('Next One')
    else:
        print("Vaccination are over")

