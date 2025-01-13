Question:
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.


Approach:

Find Pivot: Traverse the array from right to left to find the first index (pivot) where arr[i] < arr[i+1]. If no such index exists, the array is sorted in descending order, so reverse it to get the smallest permutation.

Find Swap Index: Traverse the array again from right to left to find the first index (i) greater than the pivot where arr[i] > arr[pivot].

Swap Elements: Swap arr[pivot] and arr[i].

Reverse Subarray: Reverse the subarray to the right of the pivot to get the next lexicographically smallest permutation.
