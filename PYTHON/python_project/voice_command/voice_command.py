import pyttsx3
import os

engine = pyttsx3.init()
pyttsx3.speak('enter number to open application')

while True:

    print("\n 1. microsoft word \t 2. microsoft powerpoint \n\t 3. google chrome \n\t 4. notepad \t 0. for exit \n")
    print('enter Number to open application\n')
    p = input()
    p = p.upper()
    print(p)

    if ("DONT" in p) or("DON'T" in p) or ("NOT" in p):
        pyttsx3.speak('type Again')
        print(".")
        print(".")
        continue
    elif ('3' in p):
        os.system("start chrome")
    elif ('4' in p):
        os.system("start notepad")
    elif ('1' in p):
        os.system("start winword")
    elif ('2' in p):
        os.system("start powerpnt")
    elif('0' in p):
        pyttsx3.speak('exiting')
        break
    else:
        pyttsx3.speak(p)
        print("is invalid , please try again")
        pyttsx3.speak("is invalid, please try again")

