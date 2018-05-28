import java.util.ArrayList;
import java.util.List;

public class Graph {

	protected int o;
	protected int s;
	public Edge[] listedge;


	public Graph(Edge[] l, int or, int si) {
		this.listedge = l;
		this.o= or;
		this.s=si;
	}
	
	public int order() {
		return o;
	}
	
	public int size() {
		return s;
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
	
	public int findE(int v) {
		int a=0;
		for(int i = 0; i<listedge.length;i++) {
			if (listedge[i].to().getId() == v) {
				a=i;
			}
		}
		return a;
	}
}
