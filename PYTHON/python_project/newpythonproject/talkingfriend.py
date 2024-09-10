import pyttsx3
vf = pyttsx3.init()

rate = vf.getProperty('rate')
vf.setProperty('rate', 150)


def vf_talking(text):
    vf.say(text)
    vf.runAndWait()


txt = "Hey, i am your virtual talking friend"
vf_talking(txt)

while txt != "bye":
    txt = input("What should I say :  ")
    txt = txt.lower()
    if txt!= "bye":
        vf_talking(txt)
    else:
        vf_talking("See you again friend, that wad nice talking to you")