import java.util.ArrayList;
import java.util.List;

public class Graph {

	protected int o;
	protected int s;
	public Edge[] listedge;
	public Node[] listnode;


	public Graph(Edge[] l, Node[] ln, int or, int si) {
		this.listedge = l;
		this.listnode  = ln;
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
	
	public Node[] getListNode() {
		return listnode;
	}
	
	public List<Integer> getVoisin(int v, Graph g) {
		int ver = g.listnode[v].getId();
		List<Integer> voisin = new ArrayList<Integer>();
		for(int i=0;i<g.listedge.length;i++) {
			if(g.listedge[i].from().getId()==ver) {
				voisin.add(findN(g.listedge[i].to().getId()));
			}
		}
		return voisin;
	}
	
	public int findE(int v) {
		int a=0;
		
		for(int i=0; i<listedge.length;i++) {
			if (listedge[i].to().getId() == v) {
				a=i;
			}
		}
		return a;
	}
	
	public int findN(int v) {
		int a=0;
		for(int i=0; i<listnode.length;i++) {
			if (listnode[i].getId() == v) {
				a=i;
			}
		}
		return a;
	}
}
