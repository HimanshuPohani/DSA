Question:
Given an array arr[] denoting heights of N towers and a positive integer K.

For each tower, you must perform exactly one of the following operations exactly once.

Increase the height of the tower by K
Decrease the height of the tower by K
Find out the minimum possible difference between the height of the shortest and tallest towers after you have modified each tower.

Note: It is compulsory to increase or decrease the height by K for each tower. After the operation, the resultant array should not contain any negative integers.





Approach:
The approach is based on sorting the array and then determining the minimum difference between the tallest and shortest towers after modifying their heights. Here's the step-by-step explanation:

Sort the Array: Sorting helps in identifying the minimum and maximum heights after modifications more easily.

Initial Difference: Compute the difference between the highest and lowest towers before modifications (arr[n-1] - arr[0]).

Iterate Through the Towers:

For each tower, consider it as the boundary between modified heights:
Modify the first part of the array by increasing the height by K for the smallest element.
Modify the second part of the array by decreasing the height by K for the largest element.
Skip cases where arr[i] - K becomes negative (heights can't be negative).
Calculate New Heights:

Compute the new minimum height as the smaller of:
The smallest height after adding K to the initial smallest element.
The current tower height minus K.
Compute the new maximum height as the larger of:
The previous tower height after adding K.
The initial largest element after subtracting K.
Update Result:

Compare the new difference (maxH - minH) with the previously computed difference (res), and keep the minimum.
Return Result: The final res holds the minimum difference between the tallest and shortest towers.
