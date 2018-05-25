
public abstract class Graph {

	public int nbVertices;
	public int nbEdges;
	
	protected int n;
	protected int m;
	public Edge[] listedge;


	public Graph(int nbVertices, int nbEdges, Edge[] l) {
		this.n = nbVertices;
		this.m = nbEdges;
		this.listedge = l;
		
	}
	public int numberOfVertices() {
		return nbVertices;
	}

	public int numberOfEdges() {
		return nbEdges;
	}
	
	public int order() {
		return n;
	}
	
	public int size() {
		return m;
	}
	
	public Edge[] getListEdge() {
		return listedge;
	}
}
