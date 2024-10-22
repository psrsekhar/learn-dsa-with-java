# Data Structures and Algorithms

A comprehensive guide to mastering Data Structures and Algorithms (DSA) using Java. This repository includes in-depth explanations, coding exercises, and interview preparation tools to help you solve complex problems and excel in technical interviews. Perfect for beginners and advanced learners alike!

## Overview

This repo covers fundamental concepts, data structures, and algorithms to solve coding problems effectively, with a focus on interview preparation. Each module includes key problems, concepts, and bonus challenges.

## Table of Contents

| **Module**                  | **Topics Covered**                                                                   | **Key Problems**                                                                                  | **Quizzes/Bonus**                        |
| --------------------------- | ------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------- | ---------------------------------------- |
| **1. Introduction**         | Big O notation, recursion                                                            | Recursive problem solving                                                                         | -                                        |
| **2. Arrays and Strings**   | Arrays, Strings, two pointers, sliding window, prefix sum                            | Reverse String, Squares of a Sorted Array, Maximum Average Subarray I, K Radius Subarray Averages | Arrays & Strings Quiz, Bonus Problems    |
| **3. Hashing**              | Hashing fundamentals, counting elements, checking existence                          | Pangram Sentence, Missing Number, Ransom Note, Longest Substring Without Repeating Characters     | Hashing Quiz, Bonus Problems             |
| **4. Linked Lists**         | Fast & slow pointers, linked list operations, reversing linked lists                 | Middle of Linked List, Remove Duplicates, Reverse Linked List II                                  | Linked Lists Quiz, Bonus Problems        |
| **5. Stacks and Queues**    | Stack & queue operations, string problems, monotonic stack                           | Simplify Path, Moving Average, Online Stock Span, Make The String Great                           | Stacks & Queues Quiz, Bonus Problems     |
| **6. Trees and Graphs**     | Binary trees (DFS, BFS), binary search trees, graphs (DFS, BFS), implicit graphs     | Min Depth of Binary Tree, Closest BST Value, Max Area of Island, Word Ladder, Find Path in Graph  | Trees & Graphs Quiz, Bonus Problems      |
| **7. Heaps**                | Heap operations, priority queues, top k problems                                     | Kth Largest Element in Array, K Closest Points, Min Cost to Connect Sticks                        | Heaps Quiz, Bonus Problems               |
| **8. Greedy Algorithms**    | Greedy strategies, maximizing & minimizing problems                                  | Maximum 69 Number, Max Units on a Truck, Reduce Array Size to Half                                | Greedy Quiz, Bonus Problems              |
| **9. Binary Search**        | Binary search on arrays, search in solution spaces                                   | Search Insert Position, Find Smallest Divisor, Split Array Largest Sum                            | Binary Search Quiz, Bonus Problems       |
| **10. Backtracking**        | Backtracking generation, combinations, permutations                                  | Generate Parentheses, Letter Combinations, Combination Sum III                                    | Backtracking Quiz, Bonus Problems        |
| **11. Dynamic Programming** | 1D DP, multidimensional DP, matrix DP                                                | Climbing Stairs, Coin Change, Unique Paths II, Best Time to Buy and Sell Stock                    | Dynamic Programming Quiz, Bonus Problems |
| **12. Bonus Topics**        | Difference arrays, tries, bit manipulation, Dijkstra’s Algorithm, modular arithmetic | Hamming Distance, Cheapest Flights Within K Stops, Implement Trie, Insert Interval                | Final Quiz, Bonus Problems               |

## Getting Started

### Prerequisites

- Basic understanding of programming language (Java)
- Familiarity with coding environments like Eclipse, VS Code, IntelliJ, or others

### How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/psrsekhar/learn-dsa-with-java.git
   ```
2. Navigate through the course modules in each folder.

## Project Structure

### Quizzes

Each module contains quizzes to test your understanding of the concepts. You can find the quizzes in the `quizzes/` folder for each module.

- **Module 1 Quiz**: [module1-quiz.md](./quizzes/module1-quiz.md)
- **Module 2 Quiz**: [module2-quiz.md](./quizzes/module2-quiz.md)
- **Module 3 Quiz**: [module3-quiz.md](./quizzes/module3-quiz.md)
- **Module 4 Quiz**: [module4-quiz.md](./quizzes/module4-quiz.md)
- **Module 5 Quiz**: [module5-quiz.md](./quizzes/module5-quiz.md)
- **Module 6 Quiz**: [module6-quiz.md](./quizzes/module6-quiz.md)
- **Module 7 Quiz**: [module7-quiz.md](./quizzes/module7-quiz.md)
- **Module 8 Quiz**: [module8-quiz.md](./quizzes/module8-quiz.md)
- **Module 9 Quiz**: [module9-quiz.md](./quizzes/module9-quiz.md)
- **Module 10 Quiz**: [module10-quiz.md](./quizzes/module10-quiz.md)
- **Module 11 Quiz**: [module11-quiz.md](./quizzes/module11-quiz.md)
- **Module 12 Quiz**: [module12-quiz.md](./quizzes/module12-quiz.md)

### Resources

- `resources/Cheatsheets.md` - Helpful algorithm and data structure cheatsheets
- `resources/Visualizations/` - Folder for visual aids or diagrams (if any)

### Folder Structure

```bash
learn-dsa-with-java/
│
├── README.md                     # Main repository overview
├── .gitignore                    # Git ignore file for Java projects
├── LICENSE                       # License file (e.g., MIT License)
├── quizzes/                      # Folder for quizzes across all modules
│   ├── module1-quiz.md
│   ├── module2-quiz.md
│   ├── module3-quiz.md
│   ├── module4-quiz.md
│   ├── module5-quiz.md
│   ├── module6-quiz.md
│   ├── module7-quiz.md
│   ├── module8-quiz.md
│   ├── module9-quiz.md
│   ├── module10-quiz.md
│   ├── module11-quiz.md
│   ├── module12-quiz.md
│
├── modules/introduction/          # Folder for Module 1: Introduction
│   ├── README.md                 # Module 1 overview and learning materials
│   ├── BigONotation.java         # Java implementation for Big O problems
│   ├── RecursionExamples.java    # Java implementation for recursion problems
│
├── modules/arrays-and-strings/    # Folder for Module 2: Arrays and Strings
│   ├── README.md                 # Module 2 overview and learning materials
│   ├── ReverseString.java        # Java implementation for reverse string
│   ├── SlidingWindow.java        # Java implementation for sliding window problems
│   ├── PrefixSum.java            # Java implementation for prefix sum problems
│
├── modules/hashing/               # Folder for Module 3: Hashing
│   ├── README.md                 # Module 3 overview and learning materials
│   ├── PangramChecker.java       # Java implementation for pangram problem
│   ├── LongestSubstring.java     # Java implementation for longest substring without repeating characters
│
├── modules/linked-lists/          # Folder for Module 4: Linked Lists
│   ├── README.md                 # Module 4 overview and learning materials
│   ├── LinkedListOperations.java # Java implementation for common linked list operations
│   ├── ReverseLinkedList.java    # Java implementation for reversing a linked list
│
├── modules/stacks-and-queues/     # Folder for Module 5: Stacks and Queues
│   ├── README.md                 # Module 5 overview and learning materials
│   ├── StackOperations.java      # Java implementation for stack-based problems
│   ├── QueueOperations.java      # Java implementation for queue-based problems
│   ├── MonotonicStack.java       # Java implementation for monotonic stack problems
│
├── modules/trees-and-graphs/      # Folder for Module 6: Trees and Graphs
│   ├── README.md                 # Module 6 overview and learning materials
│   ├── BinaryTreeDFS.java        # Java implementation for binary tree DFS traversal
│   ├── GraphBFS.java             # Java implementation for graph BFS traversal
│   ├── BinarySearchTree.java     # Java implementation for binary search trees
│
├── modules/heaps/                # Folder for Module 7: Heaps
│   ├── README.md                 # Module 7 overview and learning materials
│   ├── HeapOperations.java       # Java implementation for heap operations
│   ├── KthLargestElement.java     # Java implementation for Kth Largest Element in an Array
│   ├── KClosestPoints.java        # Java implementation for K Closest Points to Origin
│   └── MinCostToConnectSticks.java # Java implementation for Min Cost to Connect Sticks
│
├── modules/greedy-algorithms/    # Folder for Module 8: Greedy Algorithms
│   ├── README.md                 # Module 8 overview and learning materials
│   ├── Maximum69Number.java      # Java implementation for Maximum 69 Number
│   ├── MaxUnitsOnTruck.java      # Java implementation for Max Units on a Truck
│   └── ReduceArraySize.java      # Java implementation for Reduce Array Size to Half
│
├── modules/binary-search/        # Folder for Module 9: Binary Search
│   ├── README.md                 # Module 9 overview and learning materials
│   ├── SearchInsertPosition.java  # Java implementation for Search Insert Position
│   ├── FindSmallestDivisor.java   # Java implementation for Find Smallest Divisor Given a Threshold
│   └── SplitArrayLargestSum.java  # Java implementation for Split Array Largest Sum
│
├── modules/backtracking/        # Folder for Module 10: Backtracking
│   ├── README.md                 # Module 10 overview and learning materials
│   ├── GenerateParentheses.java   # Java implementation for Generate Parentheses
│   ├── LetterCombinations.java    # Java implementation for Letter Combinations of a Phone Number
│   └── CombinationSumIII.java     # Java implementation for Combination Sum III
│
├── modules/dynamic-programming/  # Folder for Module 11: Dynamic Programming
│   ├── README.md                 # Module 11 overview and learning materials
│   ├── ClimbingStairs.java        # Java implementation for Climbing Stairs
│   ├── CoinChange.java            # Java implementation for Coin Change
│   ├── UniquePathsII.java         # Java implementation for Unique Paths II
│   └── BestTimeToBuyAndSellStock.java # Java implementation for Best Time to Buy and Sell Stock
│
├── modules/bonus-topics/        # Folder for Module 12: Bonus Topics
│   ├── README.md                 # Module 12 overview and learning materials
│   ├── HammingDistance.java       # Java implementation for Hamming Distance
│   ├── CheapestFlightsWithinKStops.java # Java implementation for Cheapest Flights Within K Stops
│   ├── ImplementTrie.java         # Java implementation for Implementing a Trie (Prefix Tree)
│   └── InsertInterval.java        # Java implementation for Insert Interval
│
├── tests/                        # Folder for unit tests
│   ├── ArrayTests.java           # JUnit tests for array-based algorithms
│   ├── HashingTests.java         # JUnit tests for hashing problems
│   ├── LinkedListTests.java      # JUnit tests for linked list operations
│   ├── TreeTests.java            # JUnit tests for tree-based algorithms
│   ├── HeapTests.java            # JUnit tests for heap operations
│   ├── GreedyTests.java          # JUnit tests for greedy algorithms
│   ├── BinarySearchTests.java     # JUnit tests for binary search algorithms
│   ├── BacktrackingTests.java      # JUnit tests for backtracking algorithms
│   ├── DynamicProgrammingTests.java # JUnit tests for dynamic programming algorithms
│   └── BonusTopicsTests.java      # JUnit tests for bonus topics
└── resources/                    # Folder for extra materials (cheatsheets, diagrams, etc.)
    ├── Cheatsheets.md            # Helpful algorithm and data structure cheatsheets
    ├── Visualizations/           # Folder for visual aids or diagrams (if any)

```

## Contribution

Feel free to contribute by submitting pull requests for any improvements, adding new problems, or fixing errors in the content.
Happy Learning! 🎉
