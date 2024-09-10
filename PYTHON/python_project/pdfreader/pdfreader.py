import PyPDF2
import pyttsx3

reader = pyttsx3.init()

rate = reader.getProperty('rate')
reader.setProperty('rate', 150)

voices = reader.getProperty('voices')        # getting details of current voice
# reader.setProperty('voice', voices[0].id)  #changing index, changes voices. o for male
reader.setProperty('voice', voices[1].id)    # changing index, changes voices. 1 for female


def read(txt):
    reader.say(txt)
    reader.runAndWait()


print('')
print('Note-1: File Should Be In PDF Format And Same Location.')
print('Note-2: If Not In Same Location Then Give File Path Along With File Name Without Extension.')
print('')
count = 0
try:
    file_name = input("Enter File Name Without Extension: ")
    file_name = file_name + '.pdf'
    pdf_book = open(file_name, 'rb')
except:
    print('File Not In System')
    count = 1
try:
    pdfReader = PyPDF2.PdfFileReader(pdf_book)
    pages = pdfReader.numPages
    print('Total Pages: ', pages)

    page_num = int(input("Enter Page No: "))
    page_num = page_num - 1

    read('OK Boss')
    read('reading')
    print("reading...")
    for num in range(page_num, pages):
        page = pdfReader.getPage(page_num)
        text = page.extractText()
        text = text.replace('-', ' ')
        text = text.replace('Page', ' ')
        text = text.replace('/', ' or ')
        text = text.replace('.', ' ')
        text = text.replace('1', ' ')
        read(text)
except:
    if count == 0:
        print("PDF File Is Not Decrypted... OR Not In Actual Location ")

    input()
