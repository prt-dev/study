# Reverse an array

def reverseArr(arr=[3,5,7,9,2]):

    left = 0
    right = len(arr)-1

    while(left < right):

        arr[left],arr[right] = arr[right],arr[left]
        left = left+1
        right = right-1
        # print(arr,left, right)

    return arr


# move all zero's to end

def moveZeros(arr = [3,0,5,7,0,5]):
    
    left = 0
    right = 0

    while(left < len(arr)):
        if(arr[left] == 0):
            arr[left], arr[right+1] = arr[right+1],arr[left]
            right+=1
        
        left+=1
        print(arr,left,right)

    return arr

        # if(left < right):
            
