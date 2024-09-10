import pyqrcode
import png
from pyqrcode import QRCode
import datetime

time_stamp = datetime.datetime.now().strftime('%Y-%m-%d %H-%M-%S')
file_name = f'{time_stamp}.png'
file_name1 = f'{time_stamp}.svg'

http_link = input('Please Enter the  website links or phone number or links: ')

url = pyqrcode.create(http_link)
url.svg(file_name1, scale=8)
url.png(file_name, scale=6)
