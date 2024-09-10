import speech_recognition as sr
import pyttsx3
import requests
from bs4 import BeautifulSoup
import datetime as dt
import pywhatkit as pk
import wikipedia as wiki
import pyautogui
import pyjokes
import os

listener = sr.Recognizer()
speaker = pyttsx3.init()

rate = speaker.getProperty('rate')
speaker.setProperty('rate', 150)

voices = speaker.getProperty('voices')

speaker.setProperty('voice', voices[1].id)


def speak(text):
    speaker.say('yes boss ' + text)
    speaker.runAndWait()


def speak_ex(text):
    speaker.say(text)
    speaker.runAndWait()


# def whatsapp():
#     try:
#         speak_ex('ok boss, please tell me whatsapp number')
#         whatsapp_num = take_command()
#         number = whatsapp_num.replace(' ', '')
#         # print(number)
#         speak_ex('boss, tell me the massages')
#         whatsapp_msg = take_command()
#         # print(whatsapp_msg)
#         speak("please tell sending time in 24 format  ")
#         speak('hours   ')
#         print('hours: ')
#         hr = take_command()
#         hr1 = int(hr)
#         speak('minutes   ')
#         print('minutes: ')
#         mn = take_command()
#         mn1 = int(mn)
#         pk.sendwhatmsg('+91'+number, whatsapp_msg, hr1, mn1)
#
#     except:
#         speak_ex('boss whatsapp web not connect and please retry.')
#         # whatsapp()


va_name = 'alexa'

speak_ex('I am your ' + va_name + 'tell me boss.')


def take_command():
    command = ''
    try:
        with sr.Microphone() as source:
            print('Listening...')
            voice = listener.listen(source)
            command = listener.recognize_google(voice)
            command = command.lower()
            if va_name in command:
                command = command.replace(va_name + ' ', '')
                # print(command)
                # speak(command)

    except:
        print('Check your MicroPhone')
        speak_ex('Check your MicroPhone')
    return command

while True:
    user_command = take_command()
    if 'close' in user_command:
        print('See you again boss. I will be there when ever you call me')
        speak('See you again boss. I will be there when ever you call me')
        break
    elif 'time' in user_command:
        cut_time = dt.datetime.now().strftime("%I:%M %p")
        print(cut_time)
        speak(cut_time)
    elif 'play' in user_command:
        user_command = user_command.replace('play ', '')
        print('playing ' + user_command)
        speak('playing ' + user_command + 'enjoy boss.')
        pk.playonyt(user_command)
        break
    elif 'search for' in user_command or 'google' in user_command or 'get the results for' in user_command:
        user_command = user_command.replace('search for ', '')
        user_command = user_command.replace('google ', '')
        user_command = user_command.replace('get the results for ', '')
        speak('searching for ' + user_command)
        pk.search(user_command)
        break
    elif 'who is' in user_command or 'get the details' in user_command:
        user_command = user_command.replace('who is ', '')
        user_command = user_command.replace('get the details ', '')
        info = wiki.summary(user_command, 2)
        print(info)
        speak(info)
    elif 'who are you' in user_command:
        speak_ex('I am your ' + va_name + 'tell me boss.')
    elif 'open chrome' in user_command:
        os.system("start chrome")
    elif 'joke' in user_command:
        speak_ex(pyjokes.get_joke())
    elif 'open notepad' in user_command:
        os.system("start notepad")
    elif 'open word' in user_command or 'window word' in user_command:
        os.system("start winword")
    elif 'open point' in user_command or 'power point' in user_command:
        os.system("start powerpnt")
    elif 'open excel' in user_command or 'excel' in user_command or 'el' in user_command:
        os.system("start excel")
    elif 'open edge' in user_command or 'open msedge' in user_command or 'open browser' in user_command:
        os.system("start msedge")
    elif 'screen' in user_command:
        time_stamp = dt.datetime.now().strftime('%Y-%m-%d %H-%M-%S')
        file_name = f'{time_stamp}.png'
        m = pyautogui.screenshot()
        m.save(fr'C:\Users\hunay\Desktop\python_project\newpythonproject\data\{file_name}')
        speak_ex('Done Boss')
    elif 'open cmd' in user_command:
        speak_ex('ok boss, open see you again')
        os.system("cmd")
        break
    elif 'weather in' in user_command:
        # speak_ex("Please tell me city name boss")
        search = user_command
        # search = 'weather in bhimavaram'
        url = f'https://www.google.com/search?&q={search}'
        r = requests.get(url)
        s = BeautifulSoup(r.text, "html.parser")
        update = s.find("div", class_="BNeawe").text
        # print('Your city:', update)
        speak_ex(search)
        speak_ex(update)
    else:
        speak_ex('please say it again boss.')
