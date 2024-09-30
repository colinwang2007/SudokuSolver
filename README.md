# SudokuSolver

This code finds the solution (or a solution if there are multiple) of any sudoku problem. The program is also an example of the algorithm backtracking, which I just learnt at the time.

Sudoku is a simple yet perplexing puzzle that I've struggled with for multiple years. The New York Times Games has three difficulty levels of sudoku. Every day, I could never solve the daily "hard" difficulty. I created this code to help solve tough sudoku problems for myself and others so I wouldn't need to leave a sudoku problem unfinished when I give up trying to solve it.

To use the program, enter the nine by nine grid inside the system monitor, each row taking up one line and each column seperated by a space. Type in the corresponding number for each grid or the number "0" for empty cells. An example input is shown below:

9 0 0 0 0 7 4 2 0
0 0 0 0 1 8 0 0 9
2 0 0 0 9 0 0 0 5
8 0 0 0 7 0 0 0 0
0 6 0 0 0 4 0 0 7
0 0 3 8 0 0 1 0 0
0 0 4 0 8 2 0 0 1
0 9 0 0 0 1 0 0 0
3 0 0 0 0 5 0 4 0

(New York Times, Sudoku: September 30, 2024, Hard Difficulty)

The program will output a similar looking grid, however all blank spaces (zeros) will be replaced with the correct corresponding number. The output for the above problem is:

9 3 1 6 5 7 4 2 8 
4 5 6 2 1 8 3 7 9 
2 8 7 4 9 3 6 1 5 
8 2 5 1 7 6 9 3 4 
1 6 9 5 3 4 2 8 7 
7 4 3 8 2 9 1 5 6 
6 7 4 3 8 2 5 9 1 
5 9 2 7 4 1 8 6 3 
3 1 8 9 6 5 7 4 2 
