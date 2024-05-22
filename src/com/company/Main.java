package com.company;

import java.util.LinkedList;
// Main method to demonstrate the graph

public class Main {
    public static void main(String args[]) {
        Graph g = new Graph(4);
        // Adding edges to create a complete graph
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);

        // Print the adjacency list representation of the above graph
        g.printGraph();
    }
}