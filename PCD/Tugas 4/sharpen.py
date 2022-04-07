import cv2
import numpy as np

img = cv2.imread("D:/tes/bp.jpg")

#sharpen
kernel = np.array([[-1, -1, -1],
                   [-1, 9, -1],
                   [-1, -1, -1]])
sharpen = cv2.filter2D(src=img, ddepth=-1, kernel=kernel)

cv2.imshow("original", img)
cv2.imshow("sharpen", sharpen)

cv2.waitKey()
cv2.destroyAllWindows()