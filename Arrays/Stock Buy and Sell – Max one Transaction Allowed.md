Question:
Given an array prices[] of length n, representing the prices of the stocks on different days. The task is to find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.

Note: Stock must be bought before being sold.

Approach:
The approach to solving the problem is based on tracking the minimum price so far and calculating the potential profit at each step:

Initialize Variables:

minSoFar: Store the minimum price encountered so far (initialized to the first element of the array).
res: Store the maximum profit found so far (initialized to 0).
Iterate Through Prices:

Start from the second day (i = 1) and loop through the array:
Update minSoFar to the smaller of the current minSoFar and the current price (prices[i]).
Calculate the profit for selling on the current day: prices[i] - minSoFar.
Update res to the maximum of the current res and this calculated profit.
Return Result:

After iterating through the array, res contains the maximum profit achievable with one transaction. If no profit is possible, res remains 0.
Key Idea:
By keeping track of the lowest price seen so far and the maximum profit at each step, we efficiently calculate the maximum profit in O(n) time and O(1) space.
Example:
Input: prices = [7, 1, 5, 3, 6, 4]
Day 2: minSoFar = 1, Profit = 5 - 1 = 4, res = 4
Day 5: minSoFar = 1, Profit = 6 - 1 = 5, res = 5
Output: 5 (Buy on Day 2, Sell on Day 5).







