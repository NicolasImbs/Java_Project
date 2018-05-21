import java.util.ArrayList;

public abstract class K_Shortest_Path<V extends Comparable<V>> {
	
	protected int n;
	protected int m;
	
	
	public K_Shortest_Path(int nbVertices, int nbEdges) {
		this.n= nbVertices;
		this.m = nbEdges;
	}
	
}