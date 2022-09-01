# Data Structure

- organizes and stores data
    - array :
        - Order the data sequentially
        - it places each value in its own slot
        - we can get to a slot using an index
        - arrays are great for random access when you know the index of the item you want to access. They are not so
          great when you dont know the index.
- Each has strengths and weakness
- What is the best data structure to use?
    - It depends...
    - The best data structure will depend on the data you want to store, how your application will need to access the
      data, the operations your application will perform, the most on the data, so there isn't one size fits all answer.
- how to know which data structure to use
    - it based on the application's specific needs

# Algorithms

- It describes the steps we have to perform to accomplish a specific task.
- ````
  # MAKING TEA
  1. boil water
  2. add a teabag to a cup
  3. Pour the boiling water into the cup
  4. Remove the teabag when tea is ready
  5. Add the desired amount of milk to the cup
  6. Add the desired amount of sugar to the cup
  7. Stir the contents of the cup with a spoon
  
  ````

# Big-O Notation

- Big-O Notation is a way of expressing the complexity related to the number of items that an algorithm has to deal
  with.
- Its written as capital O followed by expression in parentheses.
-

| Big-O    | Best to worst situation |
|----------|-------------------------|
| O(1)     | Constant                |
| O(logn)  | Logarithmic             |
| O(n)     | Linear                  |
| O(nlogn) | n log-star n            |
| O(n^2)   | Quadratic               |

sort algorithm:

- compare the performance of one algorithm with other algorithm.
- i.e implement one algorithm and then put a line of code that records hte start time and then run the implementation
  and then have a line of code that record the end time and we can subtract the start time from the end time and we get
  the running time of the implementation of that algorithm.
- we do same with another algorithm and than we compare the two.
- its not a good way
- Hardware is going to influence the running time of these algorithm.
- Time Complexity: we can have a look at the number of steps that it takes to execute an algorithm.

    - We have two types of complexity:
        - ### **Time Complexity:**
            - the number of steps involved to run an algorithm;
        - ### **Memory Complexity:**
            - The amount memory it takes to run an algorithm.

````

SORT ALGORITHM - Add sugar to Tea
1. Fetch the bowl containing the sugar
2. Get a spoon
3. Scoop out sugar using the spoon
4. pour the sugar from the spoon into the tea
5. Repeat steps 3 and 4 until you've added the desired amount of sugar

### Big O Notation
- Number of desired sugars = n
- total number of steps = 2n + 2
- As n grows, the number of steps grows
- The "2" in 2n and the "+2" remain constant, so they don't factor into the time complexity. The value of n determines the frowth rate
- Time complexity is O(n)
- Linear time complexity
````

# Arrays:

- Always specify the size in the array `int[] intArray = new int[7];` // here the size of an array is 7
- Arrays are not a dynamic data structure
    - Once you create an array instance, you cannot change its size.
    - We can't increase or decrease its size.
    - This is one disadvantage of array when we compare them with other data structure.
    - Array has a static length and when you create an array, there's one huge block of memory allocated for that array.
    - Arrays are really good at retrieving elements if you know the index

## Arrays in Memory:

- contiguous block in memory
    - dont have items or elements in an array scattered throughout memory.
    - All of the elements, items, whatever you want to call them, in an array, they are all stored as one contiguous
      block.
    - Elements of array are not scattered all over the place in the memory.
- Every element occupies the same amount of space in memory.
    - When working with objects, what stored in the variables is an object reference. example: String
    - When creating an array of objects, what's stored in the array elements is a reference to other objects.
    - Object references are always the same size.
    - if creating an array of String, you are actually storing in the array is a bunch of object references to the
      string instances.
    - The Object references to the different instances are always the same size.
    - Array occupy one contiguous block of memory and every element in the array occupies the same amount of space in
      memory.
- If an array starts at memory address `x`, and the size of each element in the array is `y`, we can calculate the
  memory address of the ith element by using the following expression: `x + i * y`
    - We can easily calculate the memory address of an array element based on its index.
    - if array starts at memory address x and the size of each element in the array is y, then we can calculate the
      memory address of the ith element, so array i, by using the following expression
- If we know the index of an element, the time to retrieve the element will be the same, no matter where it is in the
  array.
    - If we know the index of an element in the array, then the time or the number of steps we have to do to retrieve
      the element will be the same, no matter where it is in the array.
    - To get the memory address of an element is `x + i * y` and that works with the first element in the array, or the
      5000 element in the array or more...
    - All we ever have to do to get really quickly to that element is to do that simple calculation to get the memory
      address.

| Array | 0   | 1   | 2   | 3   | 4   | 5   | 6   |
|-------|-----|-----|-----|-----|-----|-----|-----|
| #     | 20  | 35  | -15 | 7   | 55  | 1   | -22 |

````
    Start address of array= 12, element size = 4 bytes
    
    Address of array[0] = 12 + (0 * 4) = 12 + 0 = 12
    Address of array[1] = 12 + (1 * 4) = 12 + 4 = 16
    Address of array[2] = 12 + (2 * 4) = 12 + 8 = 20
    Address of array[3] = 12 + (3 * 4) = 12 + 12 = 24
    Address of array[4] = 12 + (4 * 4) = 12 + 16 = 28
    Address of array[5] = 12 + (5 * 4) = 12 + 20 = 32
    Address of array[6] = 12 + (6 * 4) = 12 + 24 = 36
````

# Big-O Values for Array Operations

| OPERATION                                         | TIME COMPLEXITY      |
|---------------------------------------------------|----------------------|
| Retrieve with index                               | O(1) - Constant time | // if code does not require a loop its constant
| Retrieve without index                            | O(n) - Linear time   | // if code require a loop its a linear line
| Add an element to a full array                    | O(n)                 |
| Add an element to the end of an array (has space) | O(1)                 |
| Insert or update an element at a specific index   | O(1)                 |
| Delete an element by setting it to null           | O(1)                 |
| Delete an element by shifting elements            | O(n)                 |

## Retrieve an element from an Array

1. Multiply the size of the element by its index
2. Get the start address of the array
3. Add teh start address to the result of the multiplication.

Example of constant time complexity and is designated by O(1). Here steps to retrieve is constant, even thought the
number of element change.

- o(1) - as the number of item increases, the algorithm does not degrade at all.

| Number of elements (n) | Steps to Retrieve |
|------------------------|-------------------|
| 1                      | 3                 |
| 1000                   | 3                 |
| 100000                 | 3                 |
| 1000000                | 3                 |
| 100000000              | 3                 |

- Always good to see the worst case scenario of one algorithm to the worst case scenario of other algorithm.
  NOTE:
- Algorithm is not implementation i.e its not the same thing
    - An algorithm describes the steps you have to perform
    - an implementation is the code you write to perform those steps.
    - There can be many implementations of the same algorithm.
    - There can be many algorithms that accomplish hte same task
    - There can be many implementations of the same algorithm

# Reference

- [Big O Notation](https://en.wikipedia.org/wiki/Big_O_notation#/media/File:Comparison_computational_complexity.svg)