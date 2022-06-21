// Alice Board | ONLINE ASSESMENT | SDE1

// QUESTION:
// Alice is playing a board game. 
// In this game, 
// Alice has been given an array A of size N, 
// containing integer coordinate points (xi and yi) and in order to win this game, 
// Alice has to cover all the given points on the board. 
// In one step,
// Alice can move his player either up, 
// down, 
// right, 
// or left by any distance 
// (i.e if there are points on (1, 1) and (1, 4), 
// Alice can move her player from (1, 1) to (1, 4) in one step).
// Alice noticed that using this way it is impossible for her to cover all the points, 
// therefore he decided to add some extra points on the board.

// Help Alice cover all points given by adding a minimum number of extra points.

// Example:
// Given,
// N = 2
// A = [[1, 2], [2, 1]]
  
// Approach
// As Alice can not move from points (1, 2) to (2, 1) according to the given constraints.
// Alice can add a point (1, 1)
// So now, Alice will move from (1, 2) -> (1, 1) -> (2, 1) covering all the given points.
// Thus the answer is 1.

// Example:
// Given,
// N = 2
// A = [[2, 1], [4, 1]]
  
// Approach
// Alice can easily move from (2, 1 -> 4, 1)just by moving right, 
// without adding any extra point.
// Thus, 
// the answer is 0.
  
// Solution
