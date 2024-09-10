import cv2
import numpy as np
path = 'resource/front.png'
path1 = 'resource/back.png'

img1 = cv2.imread(path, 0)
img2 = cv2.imread(path1)
print(img1)
print(img2)

img1 = cv2.resize(img1,(0,0), None,0.5,0.5)
img2 = cv2.resize(img2,(0,0), None,0.5,0.5)

img1 = cv2.cvtColor(img1,cv2.COLOR_GRAY2BGR)
hor = np.hstack((img1,img2,img1))
ver = np.vstack((img1,img2))

cv2.imshow("ver", ver)
cv2.imshow("hor", hor)

cv2.waitKey(0)