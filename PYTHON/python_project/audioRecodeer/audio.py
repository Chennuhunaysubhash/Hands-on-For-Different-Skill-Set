import sounddevice
from scipy.io.wavfile import write
import datetime

time_stamp = datetime.datetime.now().strftime('%Y-%m-%d %H-%M-%S')
file_name = f'{time_stamp}.wav'

fs = 44100
second = int(input("Enter the time duration in second: "))
print('reading...\n')
record_voice = sounddevice.rec(int(second * fs), samplerate=fs, channels=2)
sounddevice.wait()

write(file_name, fs, record_voice)
print('Finished....\nn Please Check it...')

