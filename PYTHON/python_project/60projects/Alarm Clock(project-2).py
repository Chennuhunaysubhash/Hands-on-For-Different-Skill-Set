from datetime import datetime
from playsound import playsound

def alarm(a,b,c,d):
    global alarm_mood
    now = datetime.now()
    current_hour = now.strftime("%I")
    current_minute = now.strftime("%M")
    current_seconds = now.strftime("%S")
    current_period = now.strftime("%p")
    if (d == current_period):
        if (a == current_hour):
            if (b == current_minute):
                if (c == current_seconds):
                    print("Wake Up!")
                    playsound('alarm.mp3')
                    alarm_mood = False
                    return alarm_mood


alarm_time = input("Enter the time of alarm to be set:HH:MM:SS\n")
alarm_hour = alarm_time[0:2]
alarm_minute = alarm_time[3:5]
alarm_seconds = alarm_time[6:8]
alarm_period = alarm_time[9:11].upper()
alarm_mood = True
print("Setting up alarm..")
while alarm_mood:
    alarm(alarm_hour, alarm_minute, alarm_seconds, alarm_period)
