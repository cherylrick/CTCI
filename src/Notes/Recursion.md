#ALL ABOUT RECURSION

1. Recursion is useful for tasks that can be defined in terms of similar sub tasks. Example: sort, search and traversal problems
2. **Recursive Function**
    1. Any function that calls itself is a recursive function.+
    2. A recursive function performs a task in part by calling itself to perform the subtasks
3. Recursive algorithms have recursive case and base case
    1. Recursive Case - the function calls itself to perform a sub task
    2. Base Case - the function does not recurse and returns here
4. If a recursive function is written incorrectly such that it never reaches a base case, it recurses infinitely which leads to the occurrence of stack overflow and then the program crashes
5. In many cases additional data structures or arguments are needed to track recursion level.
6. It maybe useful to write a separate wrapper function to do initialization for complex recursive functions. It helps keep the recursive function clean.
    1. Wrapper Function - Move the data structure and argument initialization code here
    2. Recursive Function - Move the recursive code here
7. Iterative solutions are usually more efficient than recursive solutions:
    1. There is a relatively large overhead for function calls on most platforms
    2. Iterative functions which use looping constructs instead of recursive function calls, do not suffer from this over head.
8. Recursive calls are generally used to preserve the current values of local variables and restore them when the sub task performed by the recursive call is completed
9. A recursive algorithm can be implemented without recursive calls by using a custom stack, but it is usually more trouble than it is worth.



#PROBLEMS
Find the factorial of a number
Perform Binary Search on a Sorted Array