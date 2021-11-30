# Graphs
graph : is a non-linear data structure that can be looked at as a collection of vertices (or nodes) potentially connected by line segments named edges.

## Challenge 35 - Implement Graph
Implement Graph. The graph should be represented as an adjacency list, and should include the following methods:

+ add node
+ add edge
+ get nodes
+ get neighbors
+ size

## Approach & Efficiency
Time : O(1)

Space : O(n)


## API

+ add node

    + Arguments: value

   + Returns: The added node

   + Add a node to the graph

+ add edge

   + Arguments: 2 nodes to be connected by the edge, weight (optional)

   + Returns: nothing

   + Adds a new edge between two nodes in the graph If specified, assign a weight to the edge Both nodes should already be in the Graph

+ get nodes

   + Arguments: none

   + Returns all of the nodes in the graph as a collection (set, list, or similar)

+ get neighbors

   + Arguments: node

   + Returns a collection of edges connected to the given node

   + Include the weight of the connection in the returned collection

+ size

   + Arguments: none

   + Returns the total number of nodes in the graph

##  Challenge 36 - breadth-first

Implement a breadth-first traversal on a graph. And return a collection of nodes in the order they were visited.


## API

+ Write the following method for the Graph class:

    + breadth first
    + Arguments: Node
    + Return: A collection of nodes in the order they were visited.
    + Display the collection