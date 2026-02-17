# Advanced Object-Oriented Programming  
## Lab Assignment 1: Breadth First Search (BFS) using Queues

---

## 🎯 Learning Objectives

By completing this lab assignment, the following concepts are implemented and demonstrated:

- Understanding and implementation of the Breadth First Search (BFS) algorithm
- Object-oriented graph representation using adjacency lists
- Application of encapsulation principles
- Proper exception handling and input validation
- Development of comprehensive test cases

---

## 📘 Background

### What is a Graph?

A graph is a data structure that represents relationships between objects.

It consists of:

- **Vertices (Nodes)** → Represent entities (cities, users, etc.)
- **Edges** → Represent connections between vertices

This implementation uses an **undirected graph**.

---

### What is Breadth First Search (BFS)?

Breadth First Search is a graph traversal algorithm that explores the graph level by level.

Starting from a source vertex:

1. Visit the source vertex
2. Visit all its neighbors
3. Visit neighbors of neighbors
4. Continue until all reachable vertices are visited

---

### Key Characteristics

- **Data Structure Used:** Queue (FIFO - First In First Out)
- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)
- **Applications:**  
  - Shortest path in unweighted graphs  
  - Finding connected components  
  - Web crawling  
  - Social network analysis  

---

## 🛠 Design Requirements

### 1️⃣ Graph Representation

- Implemented using a `Graph` class
- Uses `ArrayList<ArrayList<Integer>>` for adjacency list
- BFS is implemented as a non-static instance method

### 2️⃣ Encapsulation

- Adjacency list is private
- Visited array is local to BFS method
- Queue is private within BFS method
- Public methods:
  - `addEdge(int v1, int v2)`
  - `bfs(int startVertex)`
  - Getter methods (if required)

### 3️⃣ Constructor Design

- Constructor accepts number of vertices
- Initializes adjacency list
- Validates that number of vertices is positive

---

## 📂 Project Structure

```
Lab1_YourRollNumber/
│
├── Graph.java
├── BFSTest.java
└── README.md
```

---

## 🚀 Implementation Details

### Graph.java

Contains:

- `Graph(int numVertices)` – Constructor
- `addEdge(int v1, int v2)` – Adds undirected edge
- `bfs(int startVertex)` – Performs BFS traversal
- Proper input validation using `IllegalArgumentException`

---

### BFSTest.java

Driver class that:

- Creates graph
- Adds edges
- Calls BFS from different starting vertices
- Tests edge cases
- Tests exception handling

---

## 🧪 Test Cases Included

- ✅ Normal Connected Graph
- ✅ Single Vertex Graph
- ✅ Disconnected Graph
- ✅ Complete Graph
- ✅ Invalid Vertex Handling
- ✅ Different Starting Vertices

---

## 📌 Example

### Example Graph

```
0 -- 1
|    |
2 -- 3
```

### Code

```java
Graph g = new Graph(4);
g.addEdge(0, 1);
g.addEdge(0, 2);
g.addEdge(1, 3);
g.addEdge(2, 3);
g.bfs(0);
```

### Expected Output

```
0123
```

---

### Complexity Analysis

- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

---

## 👨‍💻 Author

Name: ISHANT  
Course: Advanced Object-Oriented Programming  
Lab: BFS using Queues
