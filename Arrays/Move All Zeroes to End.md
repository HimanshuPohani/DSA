Question:
You are given an array arr[] of non-negative integers. Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements. The operation must be performed in place, meaning you should not use extra space for another array.


Approach Used: Two-Pointer Technique
Steps:
Initialize a variable count as 0.
This pointer keeps track of the position to place the next non-zero element.
Iterate through the array:
If the current element is non-zero:
Swap the current element with the element at index count.
Increment count to move to the next position for the next non-zero element.
After the loop ends, all non-zero elements are shifted to the beginning, and the zeroes are pushed to the end.
