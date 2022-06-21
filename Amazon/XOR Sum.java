// XOR SUM | ONLINE ASSESMENT | SDE1

// QUESTION:
// You are given an array A of length N. 
// You can perform the following operation on it:

// Pick 2 distinct indices i and j, 
// remove A[i] and A[j] from A, 
// then push (A[i] xor A[j]) at the back of A.
// Let's define F(A) as the minimum sum of elements of A after performing the above operation on A as many times as you want.
// You have to remove exactly 1 element from A such that the value of F(A) is minimized.

// Note:
// You pass the array A after removing the element in F(A).
// XOR of empty array is 0.
// Determine the minimum value of F(A) you can achieve by removing exactly 1 element from A.

// Example:
// Given,
// N = 3
// A = [1, 1, 2]
// Approach

// By removing 1st element from A, the array will become [1, 2], 
// then the minimum sum will be 1+2=3 as there is no need to apply any operation on it.
// By removing 2nd element from A, the array will become [1, 2], 
// then the minimum sum will be 1+2=3 as there is no need to apply any operation on it.
// By removing 3rd element from A, 
// the array will become [1, 1], 
// then apply operation combining these 2 elements, 
// then the array will become [1^1]=[0]. 
// So, 
// the sum will be 0.
// So, 
// the answer will be min(3, 3, 0) = 0.

// Example:
// Given
// N = 2
// A = [1, 2]

// Approach
// By removing 1st element from A, 
// the array will become [2], 
// then the minimum sum will be 2.
// By removing 2nd element from A, 
// the array will become [1], 
// then the minimum sum will be 1.
// So, 
// the answer will be min(2, 1)=1.

// Example:
// Given,
// N = 3
// A = [0,1,3]

// Approach
// By removing 1st element from A, 
// the array will become [1, 3], 
// then apply operation combining these 2 elements, 
// then the array will become [1^3]=[2]. So, the sum will be 2.
// By removing 2nd element from A, the array will become [0, 3], 
// then the minimum sum will be 0+3=3 as there is no need to apply any operation on it.
// By removing 3rd element from A, 
// the array will become [0, 1], 
// then minimum sum will be 0+1=1 as there is no need to apply any operation on it.
// So, 
// the answer will be min(2, 3, 1)=1.
