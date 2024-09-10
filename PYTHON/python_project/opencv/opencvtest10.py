import cv2
import numpy as np

circles = np.zeros((4, 2))


def mousepoints(event,x,y,flags,parameter):
    c = 0
    if event == cv2.EVENT_LBUTTONDOWN:
        print(x,y)
        circles[c] = x, y
        c = c + 1
        print(circles)


path = 'resource/card.jpg'
img = cv2.imread(path)
while True:
    width, height = 250, 350
    pts1 = np.float32([[793, 657], [2217, 553], [945, 2897], [2401, 2769]])
    pts2 = np.float32([[0, 0], [width, 0], [0, height], [width, height]])
    matrix = cv2.getPerspectiveTransform(pts1, pts2)
    output = cv2.warpPerspective(img, matrix, (width, height))
    cv2.imshow('original image', img)
    # for x in range (0,4):
    # cv2.circle(img,(pts1[x][0],pts1[x][1]),5,(0,0,255),cv2.FILLED)

    cv2.imshow("original image", img)
    cv2.imshow("output", output)
    cv2.setMouseCallback('Origanl', mousepoints)

    cv2.waitKey(0)

