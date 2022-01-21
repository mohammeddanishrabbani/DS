// Problem Description

// The Queue interface of the Java collections framework provides the functionality of the queue data structure. It extends the Collection interface.

// Classes that Implement Queue:

// Since the Queue is an interface, we cannot provide the direct implementation of it. In order to use the functionalities of Queue, we need to use classes that implement it:

// ArrayDeque
// LinkedList
// PriorityQueue
// In queues, elements are stored and accessed in First In, First Out manner. That is, elements are added from the behind and removed from the front.

// In Java, we must import java.util.Queue package in order to use Queue.

// Syntax:

//  Queue<String> names= new ArrayDeque<>();
// The above statement creates a Queue of Strings, we can now push and remove Strings from this queue easily.

// Methods of Queue:

// add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
// offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
// element() - Returns the head of the queue. Throws an exception if the queue is empty.
// peek() - Returns the head of the queue. Returns null if the queue is empty.
// remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
// poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
// size() - Return an integer denoting the total number of elements in the queue at present.
// Task:

// Complete the code given below.

// You need to answer Q queries, in each query you are given two integers x and y:

// if x = 1 then push the integer y  to the back of the queue.
// if x = 2 then return the front element of the queue if the queue is not empty else return -1
// if x = 3  then remove the front element from the queue if the queue is not empty else do nothing. No need to return anything in this query.

// Problem Constraints

// 1 <= Q <= 100

// 1 <= x <= 3

// 1 <= y <= 100


// Input Format

// First line of input contains a single integer Q.

// Next Q lines each contain two integers x and y for that query.


// Output Format

// For each query in which x = 2 print its answer in separate lines.


// Example Input

// Input 1:

//  5
//  2 -1
//  1 5
//  3 -1
//  1 5
//  2 -1

// Example Output

// Output 1:

//  -1
//  5

// Example Explanation

// Explanation 1:

//  Query 1: x = 2 so we need to print the front element of the queue , since the queue is empty we will print -1.
//  Query 5: x = 2 Queue contains only element 5 so we will print 5.


import java.lang.*;
import java.util.*;

public class Queues{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;

        Queue<Integer> r=new ArrayDeque<>();
        for(i=0;i<n;i++)
        {
            int x=sc.nextInt();
            int y=sc.nextInt();
            switch(x)
            {
                case 1:
                r.offer(y);
                break;
                case 2:
                try
                {
                int b=r.element();
                System.out.println(b);
                }
                catch(Exception e)
                {
                System.out.println(-1);
                }
                
                
                break;
                case 3:
                int b=r.poll();
                break;
            }
        }
        
    }
}