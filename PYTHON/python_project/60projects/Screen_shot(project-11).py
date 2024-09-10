import pyautogui
import datetime

time_stamp = datetime.datetime.now().strftime('%Y-%m-%d %H-%M-%S')
file_name = f'{time_stamp}.png'
m = pyautogui.screenshot()
m.save(fr'C:\Users\hunay\Desktop\python_project\60projects\resouce\{file_name}')
print('Done...!')

