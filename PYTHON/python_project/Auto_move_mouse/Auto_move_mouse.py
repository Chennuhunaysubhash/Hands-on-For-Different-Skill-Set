import pyautogui
import time


print('')
sleep_time = float(input('Please Enter Sleep Time: '))
print('')
while sleep_time == 0 or sleep_time < 0.5:
    sleep_time = float(input('Please Enter Sleep Time More Then 0.4 Minutes: '))
    print('')

if sleep_time < 1:
    print('Ok Boss, I Will Move Your Mouse After Every', int(sleep_time*60), 'Seconds')
elif sleep_time == 1:
    print(' Ok Boss, I Will Move Your Mouse After Every', int(sleep_time), 'Minute')
else:
    print(' OK Boss, I Will Move Your Mouse After Every', sleep_time, 'Minutes')
while True:
    time.sleep(10)
    for i in range(100):
        pyautogui.moveTo(50, i*5)