"""
Let A be an N by M matrix in which every row and every column is sorted.

Given i1, j1, i2, and j2, compute the number of elements of M smaller than M[i1, j1] and larger than M[i2, j2].

For example, given the following matrix:

[[1, 3, 7, 10, 15, 20],
 [2, 6, 9, 14, 22, 25],
 [3, 8, 10, 15, 25, 30],
 [10, 11, 12, 23, 30, 35],
 [20, 25, 30, 35, 40, 45]]
And i1 = 1, j1 = 1, i2 = 3, j2 = 3, return 15 as there are 15 numbers in the matrix smaller than 6 or greater than 23.

"""

# import
from typing import List

# function
def count_nums_in_range(matrix: List[List[int]], i1: int, j1: int, i2: int, j2: int) -> int:
    # get the number at the given index (i1, j1) and (i2, j2)
    numSmaller = matrix[i1][j1]
    numLarger = matrix[i2][j2]
    
    # print(numSmaller, numLarger)
    print("numSmaller:", numSmaller, "numLarger:", numLarger)
    
    count_in_range = 0
    
    # iterate through the matrix
    for row in matrix:
        for num in row:
            print(num)
            if num < numSmaller or num > numLarger:
                count_in_range += 1
    
    return count_in_range


    
matrix = [[1, 3, 7, 10, 15, 20],
          [2, 6, 9, 14, 22, 25],
          [3, 8, 10, 15, 25, 30],
          [10, 11, 12, 23, 30, 35],
          [20, 25, 30, 35, 40, 45]]

i1 = 1
j1 = 1
i2 = 3
j2 = 3

# Call the function with the test case
result = count_nums_in_range(matrix, i1, j1, i2, j2)

# Define the expected output based on the problem statement
expected_output = 15

# Check if the result matches the expected output
if result == expected_output:
    print("Test case passed!")
else:
    print("Test case failed. Expected:", expected_output, "Got:", result)








    
    
    
    

    
    