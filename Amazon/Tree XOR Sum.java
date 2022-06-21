// Tree XOR Sum | OA | SDE1 | 2022
  
// Question: 
// You are given a tree with N vertices numbered from 1 to N. 
// The ith edge connects vertex Xi and vertex Yi bidirectionally. 
// You have to divide this tree into three connected components by cutting any two edges of the tree. 
// Let the three components be C1, C2 and C3. 
// Let X1, X2, X3 be the XOR of all vertices of the components C1, C2 and C3 respectively.

// Minimize the difference between the maximum and minimum xor values of the components. 
// In short, 
// you have to minimize the value of max(X1, X2, X3) - min(X1, X2, X3).

// Notes:
// A tree is an undirected, 
// connected and acyclic graph.
// A set of nodes forms a connected component in a tree if any node from the set of nodes can reach any other nodes by traversing edges.
// The bitwise XOR of integers A and B, A XOR B, 
// is when A XOR B is written in base two, 
// the digit in the 2^k's place(k >= 0) is 1, 
// if exactly one of A and B is 1, and 0 otherwise. 
// For example, 
// XOR of (101)2 and (110)2 is (011)2.
// Cutting an edge means partitioning the vertices of the tree into two disjoint subsets. 
// In other words, 
// cutting an edge results in an increase in the number of connected components.
  
// Example:
// if N = 4
// Edges = [[1,2], [2,3], [4,1]]

// You can cut the edge between 2 and 3 and the edge between 1 and 4.
// The components are C1 = {1, 2}, C2 = {3} and C3 = {4}. 
// So the XOR values are X1 = 3(1 XOR 2), X2 = 3 and X3 = 4
// Thus, 
// the answer is 4-3 = 1.
  
// If N = 5, 
// Edges = [[1, 2], [1, 4], [1, 5], [3, 4]]

// You can cut the edge between 3 and 4 and the edge between 1 and 4.
// The Components are now C1 = {1, 2, 5}, C2 = {3} and C3 = {4}. 
// So, 
// the XOR values are X1 = 6(1 XOR 2 XOR 5), X2 = 3 and X3 = 4.
// Thus the answer is 6 - 3 = 3. 
  
// Solution
