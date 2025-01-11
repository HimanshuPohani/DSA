import math
            
class Solution:
    #Function to rotate an array by d elements in counter-clockwise direction. 
    def rotateArr(self, arr, d):
        n = len(arr)
        
        d %= n
        cycles = maths.gcd(n,d)
        
        for i in range(cycles):
            startEle = arr[i]
            currIdx = i
            while True:
                nextIdx = (currIdx +d) % n
                if nextIdx == i:
                    break
                
                    
                
                 arr[currIdx] = arr[nextIdx]
                 currIdx = nextIdx
            arr[currIdx] = startEle
            
            
            
            
