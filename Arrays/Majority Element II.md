Question:
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.


Approach:
The algorithm identifies at most two candidates that could appear more than 
𝑛/3times using the Boyer-Moore Voting Algorithm, verifies their counts in a second pass, and returns them sorted.








