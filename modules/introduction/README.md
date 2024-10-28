# Module 1: Introduction to Data Structures and Algorithms

Welcome to the first module of the Data Structures and Algorithms (DSA) course! In this module, you'll be introduced to key concepts that will be fundamental to your understanding of DSA, including Big O notation and recursion.

## Topics Covered:
1. **Big O Notation**: A mathematical notation used to describe the performance or complexity of an algorithm in terms of time or space.
2. **Recursion**: A programming technique where a function calls itself in order to solve a problem by breaking it into smaller subproblems.

---

### 1. Big O Notation

Big O notation is used to classify algorithms according to how their run time or space requirements grow as the input size grows. Understanding Big O is crucial for writing efficient code.

#### Common Time Complexities:
- **O(1)**: Constant time – the operation doesn't depend on the input size.
- **O(log n)**: Logarithmic time – operations reduce the problem size by a factor, often seen in divide-and-conquer algorithms like binary search.
- **O(n)**: Linear time – the run time grows directly proportional to the input size.
- **O(n^2)**: Quadratic time – the run time is proportional to the square of the input size, often seen in nested loops.

#### Examples:

- **O(1)**: Accessing an element in an array by index.
- **O(n)**: Iterating through a list.
- **O(n^2)**: Nested loops iterating over a 2D matrix.

---

### 2. Recursion

Recursion is a technique where a function solves a problem by calling itself on smaller instances of the same problem. It's often used in divide-and-conquer strategies.

#### Example:
```java
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));  // Output: 120
    }
}
```

## Learning Objectives:
Understand and calculate time complexity using Big O notation.
Apply recursive thinking to solve basic problems.

## Key Problems:
Calculate the time complexity of basic algorithms.
Write a recursive function to solve a common problem (e.g., factorial, Fibonacci).

## Quiz Questions:
What is the time complexity of accessing an element in an array by index?
Explain the difference between O(n) and O(n^2) time complexities.
Give an example of a problem that has an O(log n) time complexity.
Write a recursive function to calculate the sum of numbers from 1 to n.
Explain how recursion can be used to solve problems efficiently.

## Further Reading:
- [Big O Cheat Sheet](https://www.bigocheatsheet.com/)
- [Big O Cheat Sheet](https://bigocheatsheet.io/)
- [Introduction to Algorithms - MIT](https://ocw.mit.edu/courses/6-006-introduction-to-algorithms-spring-2020/resources/mit6_006s20_r01/)