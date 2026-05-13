# Graph Traversal and Representation System

## A. Project Overview

This project implements a graph data structure using an adjacency list representation.
A graph consists of:

* **Vertices (nodes)** — individual elements identified by an ID
* **Edges** — connections between vertices

Two traversal algorithms are implemented:

* **Breadth-First Search (BFS)** — explores level by level
* **Depth-First Search (DFS)** — explores as deep as possible


#### B. Class Descriptions

### Vertex Class

Represents a node in the graph.

* Stores a unique ID
* Provides getter and string representation

### Edge Class

Represents a connection between two vertices.

* Contains source and destination
* Used to describe relationships

### Graph Class

Implements the graph using an **adjacency list**:

* Each vertex maps to a list of neighbors
* Efficient for sparse graphs

Key methods:

* `addVertex()` — adds a vertex
* `addEdge()` — connects two vertices
* `printGraph()` — prints structure
* `bfs()` — Breadth-First Search
* `dfs()` — Depth-First Search

### Experiment Class

Handles:

* Running traversal algorithms
* Measuring execution time
* Testing different graph sizes


## C. Algorithm Descriptions

### Breadth-First Search (BFS)

**Steps:**

1. Start from a selected node
2. Add it to a queue
3. Visit neighbors level by level
4. Mark visited nodes to avoid repetition

**Use cases:**

* Finding shortest path
* Level-order traversal

**Time Complexity:**
O(V + E)


### Depth-First Search (DFS)

**Steps:**

1. Start from a node
2. Visit it and go deeper recursively
3. Backtrack when no unvisited neighbors remain

**Use cases:**

* Path finding
* Cycle detection

**Time Complexity:**
O(V + E)


## D. Experimental Results

### Small Graph Output

```
BFS: 1 2 3 4 5 6 7
DFS: 1 2 4 6 3 5 7
```

### Execution Time Comparison

| Graph Size | BFS Time (ns) | DFS Time (ns) |
| ---------- | ------------- | ------------- |
| 10         | 245600        | 171800        |
| 30         | 526600        | 642800        |
| 100        | 1716800       | 2498400       |


## E. Screenshots

(Add screenshots in docs/screenshots folder)

* Graph structure output
* BFS traversal output
* DFS traversal output
* Performance results


## F. Analysis

### 1. How does graph size affect performance?

As the graph size increases, execution time also increases.
This is expected because both BFS and DFS visit all vertices and edges.


### 2. Which traversal is faster?

* For small graphs, DFS was slightly faster
* For larger graphs, BFS performed better


### 3. Does it match O(V + E)?

Yes.
Execution time increases linearly with the number of vertices, which matches O(V + E).


### 4. How does graph structure affect traversal order?

* BFS follows levels (layer by layer)
* DFS goes deep first before backtracking
  Different structures lead to different traversal orders.


### 5. When is BFS preferred?

* When shortest path is required
* When level-wise processing is needed


### 6. What are the limitations of DFS?

* Can go too deep (inefficient for shortest path)
* May cause stack overflow in large graphs
* Does not guarantee shortest path


## G. Reflection

This assignment helped me understand how graph traversal algorithms work in practice.
I learned the difference between BFS and DFS in terms of traversal strategy and performance.

One challenge was implementing recursion correctly in DFS and ensuring all nodes were visited only once.
Another challenge was measuring and comparing execution times for different graph sizes.

Overall, this project improved my understanding of graph data structures and algorithm analysis.
