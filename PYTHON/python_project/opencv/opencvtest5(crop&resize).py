import cv2

path = 'resource/hunay.jpg'
img = cv2.imread(path)
print(img.shape)

width, height = 400, 400
img_resize = cv2.resize(img, (width, height))  # resize img
print(img_resize.shape)

img_crop = img[300:900, 300:1500]        # crop img

img_crop_resize = cv2.resize(img_crop, (img.shape[1], img.shape[0]))   # making cropped img into original size

cv2.imshow('normal', img)
cv2.imshow('crop', img_crop)
cv2.imshow('resize', img_resize)
cv2.imshow('original_size_crop', img_crop_resize)
cv2.waitKey(0)
