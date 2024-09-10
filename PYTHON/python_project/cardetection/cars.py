import cv2

cap = cv2.VideoCapture('data/data_video2.avi')

car_cascade = cv2.CascadeClassifier('data/cars.xml')

while True:
    ret, frame = cap.read()
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)

    cars = car_cascade.detectMultiScale(gray, 1.1, 1)
    for (x, y, w, h) in cars:
        cv2.rectangle(frame, (x, y), (x+w, y+h), (0, 0, 255), 2)

    cv2.imshow("video", frame)
    if cv2.waitKey(33) == ord('q'):
        break

cv2.destroyAllWindows()
