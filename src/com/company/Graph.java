package com.company;

import java.util.LinkedList;
    public class Graph {
        private int V;   // Number of vertices
        private LinkedList<Integer> adj[]; // Adjacency List representation

        // Constructor
        public Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i) {
                adj[i] = new LinkedList();
            }
        }

        // Function to add an edge into the graph
        void addEdge(int v, int w) {
            adj[v].add(w); // Add w to v's list.
            adj[w].add(v); // Since the graph is undirected
        }

        // Print the adjacency list representation of the graph
        void printGraph() {
            for (int i = 0; i < V; i++) {
                System.out.print("Vertex " + i + ":");
                for (Integer vertex : adj[i]) {
                    System.out.print(" -> " + vertex);
                }
                System.out.println();
            }
        }
    }
