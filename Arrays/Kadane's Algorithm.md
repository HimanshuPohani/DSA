


Question:
Given an integer array arr[]. You need to find the maximum sum of a subarray.

Approach:
Goal: Find the maximum sum of any contiguous subarray in a given array.

Key Idea: Use two variables:

maxEnding: Tracks the current subarray sum.
res: Tracks the maximum sum encountered so far.
Steps:

Start with res = arr[0] and maxEnding = arr[0].
Traverse the array from the second element:
Update maxEnding = max(maxEnding + arr[i], arr[i]) (extend or restart subarray).
Update res = max(res, maxEnding) (global max so far).
Return res.
Time Complexity: O(n).

Space Complexity: O(1).

