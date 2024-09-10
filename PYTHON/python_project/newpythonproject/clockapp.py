from tkinter import *
import time

root = Tk()
root.configure(bg = 'navajo white')

label1 = Label(root, font = 'comicsans 50', bg = 'navajo white')
label1.pack()

def get_time():
    cur_time  = time.strftime("%H:%M:%S %p")
    label1.configure(text=cur_time)
    label1.after(200,get_time)

get_time()

root.mainloop()






