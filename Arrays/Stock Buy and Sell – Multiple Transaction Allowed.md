The cost of stock on each day is given in an array price[]. Each day you may decide to either buy or sell the stock i at price[i], you can even buy and sell the stock on the same day. Find the maximum profit that you can get.

Note: A stock can only be sold if it has been bought previously and multiple stocks cannot be held on any given day.

Approach:
We use the "Greedy Approach" to solve this problem. The key observation is that to maximize the profit, we should focus on all opportunities for profit, i.e., any instance where the stock price increases between two consecutive days.

Steps:

Traverse the price array starting from the second day (index 1).
Compare the price of the current day (prices[i]) with the previous day (prices[i-1]).
If prices[i] > prices[i-1], it means there's a potential profit by buying on the previous day (i-1) and selling on the current day (i).
Add the profit (prices[i] - prices[i-1]) to the result.
Repeat this for every day in the array.
Return the total profit.
Key Concept for Beginners
When you sell a stock on a day after buying it, the profit is:

Profit=Selling Price−Buying Price
Instead of focusing on explicitly tracking buy and sell days, this approach simply accumulates all profitable price differences. Essentially, if there’s an opportunity to make money between two consecutive days, we take it.

