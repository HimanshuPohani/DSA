Question:
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Approach:
The approach uses Cyclic Replacements where elements are moved in cycles based on the GCD of (n) and (d). This ensures all elements are rotated to their correct positions efficiently in (O(n)) time and (O(1)) space.
