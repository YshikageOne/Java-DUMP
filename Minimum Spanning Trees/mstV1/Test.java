package mstV1;

import mstV1.Edge;
import mstV1.KruskalAlgo;

public class Test {
	
	public static void main(String[] args) {
		int numVertices = 6;
		int numEdges = 12;
		KruskalAlgo graph = new KruskalAlgo(numVertices, numEdges);
		
		//edge 1
		graph.edges[0].start = 0;
		graph.edges[0].end = 1;
		graph.edges[0].weight = 4;
		
		//edge 2
		graph.edges[1].start = 0;
		graph.edges[1].end = 2;
		graph.edges[1].weight = 4;
		
		//edge 3
		graph.edges[2].start = 1;
		graph.edges[2].end = 2;
		graph.edges[2].weight = 2;
				
		//edge 4
		graph.edges[3].start = 1;
		graph.edges[3].end = 3;
		graph.edges[3].weight = 5;
		
		//edge 5
		graph.edges[4].start = 2;
		graph.edges[4].end = 3;
		graph.edges[4].weight = 5;
				
		//edge 6
		graph.edges[5].start = 2;
		graph.edges[5].end = 4;
		graph.edges[5].weight = 11;
			
		//edge 7
		graph.edges[6].start = 3;
		graph.edges[6].end = 4;
		graph.edges[6].weight = 2;
						
		//edge 8
		graph.edges[7].start = 3;
		graph.edges[7].end = 5;
		graph.edges[7].weight = 6;
		
		//edge 9
		graph.edges[8].start = 4;
		graph.edges[8].end = 5;
		graph.edges[8].weight = 7;
				
		//edge 10
		graph.edges[9].start = 0;
		graph.edges[9].end = 3;
		graph.edges[9].weight = 10;
			
		//edge 11
		graph.edges[10].start = 1;
		graph.edges[10].end = 4;
		graph.edges[10].weight = 8;
						
		//edge 12
		graph.edges[11].start = 2;
		graph.edges[11].end = 5;
		graph.edges[11].weight = 9;
		
		graph.minimumSpanningTree();
		
	}
}
