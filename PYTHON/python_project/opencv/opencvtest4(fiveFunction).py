import cv2
import numpy as np

kernel = np.ones((5, 5), np.uint8)
print(kernel)

path = 'resource/front.png'
img = cv2.imread(path)

imggray = cv2.cvtColor(img, cv2.COLOR_BGR2HSV)     # gray img
imgblre = cv2.GaussianBlur(img, (5, 5), 0)     # blur
imgCanny = cv2.Canny(img, 100, 500)    # outLine img
imgdilation = cv2.dilate(imgCanny, kernel, iterations=2)     # dilation img
imgerode = cv2.erode(imgdilation, kernel, iterations=1)      # erode img
cv2.imshow('normal', img)
cv2.imshow('grayImg', imggray)
cv2.imshow('blurImg', imgblre)
cv2.imshow('cannyImg', imgCanny)
cv2.imshow('dilationImg', imgdilation)
cv2.imshow('erodeImg', imgerode)
cv2.waitKey(0)
