# write the elements in array by taking input from the user, get length of array from the user


def getArr():

    arr_len = int(input("enter length of array : "))

    arr = []
    for i in range(arr_len):
        arr.append(int(input("enter element : ")))

    return arr

# getArr()