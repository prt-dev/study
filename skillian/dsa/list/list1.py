# maximum element in an array
from input_items import getArr

def maxVal(arr=[3,5,7,9,2]):
    maxV = arr[0]

    for i in range(1, len(arr)):

        if maxV < arr[i]:
            maxV = arr[i]

    return maxV


# ret = maxVal(getArr())

# print("maximum value is : ", ret)


def secondmaxVal(arr):
    if arr[1] < arr[0]:
        maxVal = arr[0]
        secondMax = arr[1]
    else:
        maxVal = arr[1]
        secondMax = arr[0]

    for i in range(2, len(arr)):

        if secondMax < arr[i]:
            secondMax = arr[i]
        
            if maxVal < secondMax:
                secondMax = maxVal
                maxVal = arr[i]
            

    return secondMax
