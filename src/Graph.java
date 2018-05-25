import java.util.ArrayList;
import java.util.List;

public abstract class Graph {

	public int nbVertices;
	public int nbEdges;
	protected String[] names;
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
	
	public List<Integer> getVoisin(int v, Graph g) {
		List<Integer> voisin = new ArrayList<Integer>();
		for(Edge e: g.getListEdge()) {
			if(e.from().getId()==v) {
				voisin.add(e.to().getId());
			}
		}
		return voisin;
	}
}
