import cv2
fr_width = 240
fr_height = 160

cap = cv2.VideoCapture(0)    # 0 for default cam and 1 for second cam
cap.set(3, fr_width)
cap.set(4, fr_height)
while True:
    su, img = cap.read()

    cv2.imshow('video', img)

    if cv2.waitKey(1) & 0xFF == ord('q'):
        break
