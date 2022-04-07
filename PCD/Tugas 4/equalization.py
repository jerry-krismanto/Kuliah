import cv2

import numpy as np

#konversi grayscale agar dapat diproses Histogram Equalization
img = cv2.imread("D:/tes/bp.jpg", 0)

#Histogram Equalization
equ = cv2.equalizeHist(img)

cv2.imshow('grayscale', img)
cv2.imshow('equalization', equ)

cv2.waitKey(0)
cv2.destroyAllWindows()
