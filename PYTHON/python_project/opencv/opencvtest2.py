import cv2
frw = 240
fra = 160

cap = cv2.VideoCapture('resource/video.mp4')
# cap.set(3,frw)
# cap.set(4,fra)
while True:
    su, img = cap.read()
    img = cv2.resize(img, (frw, fra))
    cv2.imshow('video', img)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
