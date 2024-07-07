package mstV1;

import java.util.*;

import mstV1.Edge;

public class KruskalAlgo {
	
	//initialize the num of vertices and edges
	int numVertices, numEdges;
	Edge[] edges; //array of edges
	
	KruskalAlgo(int numVertices, int numEdges){
		this.numVertices = numVertices;
		this.numEdges = numEdges;
		
		edges = new Edge[numEdges];
		
		//initialize each edges in the array into an object
		for(int i = 0; i < numEdges; ++i) {
			edges[i] = new Edge();
		}
	}
	
	//check if adding an edges results in a cycle
	
	//find the root in a set that contains a particular value
	int find(int[] parent, int value) {
		if(parent[value] != value) {
			parent[value] = find(parent, parent[value]);
		}
			return parent[value];
	}
				
	//merge two disjoint sets
	public void union(int[] parent, int[] depth, int x, int y) {
		int xroot = find(parent, x);
		int yroot = find(parent, y);
					
	//comparing the depths of the roots of two sets
	//rank measures the depth of the tree
	if(depth[xroot] < depth[yroot]) {
		parent[xroot] = yroot;
	} else if(depth[xroot] > depth[yroot]) {
		parent[yroot] = xroot;
	} else {
		parent[yroot] = xroot;
		depth[xroot]++;
		}
	}
	
	//main function of making a Minimum Spanning Tree
	
	public void minimumSpanningTree() {
		Edge[] result = new Edge[numVertices]; //final tree
		int a = 0; //index variable, for result[]
		int b = 0; //index variable, for sorted edges
		
		for(b = 0; b < numVertices; ++b) {
			result[b] = new Edge();
		}
		
		
		//Step 1 : Sorting the edges in decreasing order
		Arrays.sort(edges);
		
		int[] parent = new int[numVertices];
		int[] depth = new int[numVertices];
		
		//Create subsets with single elements
		for(int i = 0; i < numVertices; ++i) {
			parent[i] = i;
			depth[i] = 0;
		}
		
		b = 0; //index used to pick the smallest edge
		
		//Adding edges to the final tree until its numVertices - 1
		while(a < numVertices - 1) {
			//Step 2 : Picking the smallest edge
			Edge nextEdge = edges[b++];
			
			int x = find(parent, nextEdge.start);
			int y = find(parent, nextEdge.end);
			
			//Step 3: Check if this edge forms a cycle
			//Step 4: If it doesn't for a cycle, include in the MST
			
			if(x != y) {
				result[a++] = nextEdge;
				union(parent, depth, x, y);
			}
			
			//else discard the next edge
			
		}
		
		//Print out the tree
		System.out.println("Minimum Spanning Tree");
		
		for(b = 0; b < a; ++b) {
			System.out.println(result[b].start + "--" + result[b].end + "==" + result[b].weight);
		}
	}
	
	
}
