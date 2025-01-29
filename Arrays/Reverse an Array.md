


Question:
You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Approach:
We use the two-pointer technique to reverse the array. The steps are as follows:

Initialization:

Define two pointers, left and right.
Set left to point to the first element of the array (index 0) and right to point to the last element of the array (index n-1).
Swapping Elements:

While left is less than right:
Swap the elements at the left and right indices.
Increment the left pointer (move it to the next element).
Decrement the right pointer (move it to the previous element).
Termination:

The process continues until the left pointer is no longer less than the right pointer.
At this point, the array is reversed in place.
Return the Array:

Return the modified array after completing the swapping process.

Time Complexity
O(n)
Space Complexity
O(1)
