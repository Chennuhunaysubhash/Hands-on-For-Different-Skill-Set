import pywhatkit as pk
import speech_recognition as spr
listener = spr.Recognizer()
number = input('Enter whatapp Number: ')


command = input('enter whatapp msg: ')

hr = int(input("Hour(24 hours format): "))
mn = int(input("minutes: "))
pk.sendwhatmsg('+91'+number, command, hr, mn)