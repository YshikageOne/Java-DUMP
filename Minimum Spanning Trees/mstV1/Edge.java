package mstV1;

public class Edge implements Comparable<Edge>{

	int start, end, weight;
	
	@Override
    public int compareTo(Edge secondEdge) {
        return this.weight - secondEdge.weight;
    }
}
