1. CSCI 2720 – Spring 2026
Programming Assignment 3: Binary Search Tree

Student Information:
---------------------
Name: Kasey Lane
Email: kal04342@uga.edu

2. How to Compile and Run Program

Project folder structure:
src/
  cs2720/p3/NodeType.java
  cs2720/p3/BinarySearchTree.java
  cs2720/p3/BinarySearchTreeDriver.java

Compile:
    javac src/cs2720/p3/*.java

Run:
    java -cp src cs2720.p3.BinarySearchTreeDriver <inputfile>

Examples:
    java -cp src cs2720.p3.BinarySearchTreeDriver int-input.txt
    java -cp src cs2720.p3.BinarySearchTreeDriver double-input.txt
    java -cp src cs2720.p3.BinarySearchTreeDriver string-input.txt

When the program starts it will ask the following:
    Enter list type (i - int, d - double, s - String):

Type:
    i  for integers
    d  for doubles
    s  for Strings

It then loads that file into a BST of the chosen type, shows the menu, and allows interactive commands.

3. Program Description

Implemented:
- NodeType<T extends Comparable<T>>
- BinarySearchTree<T extends Comparable<T>>
- BinarySearchTreeDriver (main)

The program builds a binary search tree (BST) that stores either int, double, or String values, depending on the user’s choice at runtime.

The BST supports:
- Insert (i)
- Delete (d)
- Print Tree (p)      
- Retrieve/Search (r)
- Count Leaf Nodes (l)
- Find Single Parents (s)
- Find Cousins (c)
- Is Proper (o)
- Is Complete (m)
- Quit (q)

Error handling:
- If inserting an item that already exists, print: "The item already exists in the tree."
- If searching and item is not found: "Item is not present in the tree"
- If deleting an item that is not present:
    * numeric trees: "The number is not present in the tree"
    * string tree:   "Item is not present in the tree"
- Also check that the input file can be opened. If not, print an error and stop.

Time complexity:
- Finding the node and its ancestors is basically a BST search.
- Worst case height h, which in an unbalanced BST can be O(n).
- Printing cousins is O(1) after we know aunt/uncle.
Overall complexity: O(n). In the worst case for an unbalanced BST, O(n).  
Recurrence form (worst case path down one side): T(n) = T(n-1) + O(1) ⇒ T(n) = O(n).  
If the tree were balanced, h = O(log n), so O(log n).

5. Complexity Summary (Big-O)
- insert:      O(n) average O(log n), worst O(n)
- delete:      O(n) average O(log n), worst O(n)
- retrieve:    O(n) average O(log n), worst O(n)
- inOrder:     Θ(n)
- getNumLeafNodes: Θ(n)
- getSingleParent: Θ(n)
- getCousins(x): O(n) (worst O(n))
- isProper:    Θ(n) (check every node)
- isComplete:  Θ(n) (level-order traversal once)
