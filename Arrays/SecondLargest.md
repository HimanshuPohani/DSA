


Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.

Approaches:
1. Sorting (O(n log n)):
Sort the array.
Traverse from the end to find the first element smaller than the largest.
Why less efficient? Sorting is unnecessary when only the second largest is needed.


2. Two Iterations (O(n)):
First pass: Find the largest element.
Second pass: Find the largest element smaller than the first.
Why less efficient? Requires two traversals of the array.






3. Single Iteration (O(n)) - Optimal:
Use two variables, first (largest) and second (second largest).
Traverse the array:
If num > first, update second = first and first = num.
Else if num > second and num != first, update second.
If second is not updated, return -1.

Reason of using Approach 3?
Single traversal: Faster than sorting or two-pass methods.
Optimal time complexity: O(n).
Space efficient: Uses only two variables.
