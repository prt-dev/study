# greatest number of candies among the kids.

# maximum element in an array
from input_items import getArr
from list1 import maxVal

def greatestCandies(arr=[3,5,7,9,2], extraCandies=3):
    maxVal1 = maxVal(arr)
    arrT = []
    for i in range(len(arr)):
        if(arr[i] + extraCandies > maxVal1):
            arrT.append(True)
        else:
            arrT.append(False)

    return arrT
