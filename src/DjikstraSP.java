import java.util.ArrayList;
import java.util.Arrays;

public class DjikstraSP {
	boolean marque[];
	int [] precedent;
	double [] distance;
	Integer s;
	Graph g;
	
	public DjikstraSP() {
	}
	
	public boolean estPositif(Graph g) {
		
		for(Edge de: g.getListEdge()) {
			if(de.getWeight() < 0.0)
				return false;
		}
		return true;
	}
	
	public double[] getD() {
		return distance;
	}
	
	public void djikstraSP(Graph g, Integer s) {
		marque = new boolean[g.order()];
		distance = new double[g.order()];
		Arrays.fill(distance, Double.MAX_VALUE);
		distance[g.findN(s)] = 0.0;
		int totalmarque=0;
		while(totalmarque < g.order()) {
			int min = min(distance, marque);
			marque[min]=true;
			totalmarque++;
			ArrayList<Integer> voisin = new ArrayList<Integer>();
			voisin = (ArrayList<Integer>) g.getVoisin(min, g);
			for(int i=0; i<voisin.size();i++) {
				if(marque[voisin.get(i)]==false) {
					if(distance[min] != Double.MAX_VALUE) {
						double w = 0;
						for(Edge e: g.getListEdge()) {
							if(g.findN(e.from().getId()) == min && g.findN(e.to().getId()) == i) {
								w = e.getWeight();
							}
						}
						if(distance[min] + w < distance[i]) {
							distance[i] = distance[min] + w;
						}
					}
				}
			}
			break;
		}
	}

	public  int min(double[] distance, boolean[] marque) {
		int min=0, i=0;
		while(i<distance.length) {
			if(marque[i] == false) {
				if(distance[i] < distance [min]) {
					min = i;
				}
			}
			i++;
		}
		return min;
	}
	
	public static void main (String[] args){
		int[][] test = {{0,10,10},
		                {10,30,7},
		                {20,30,6},
		                {0,20,3},
		                {0,30,2}};
		int size = test.length;
		int order = 4;
		Edge[] listE = new Edge[5];
		for(int i=0; i<test.length;i++) {
			listE[i] = new Edge(new Node(test[i][0]),new Node(test[i][1]),test[i][2]);
		}
		Node[] listN = new Node[4];
		for(int i=0; i<listE.length;i++) {
			int t=0;
			for(int j=0; j<listN.length;j++) {
				if(listN[j] != null) {
					if(test[i][0] == listN[j].getId()){
						t=1;
					}
				}
			}
			if(t==0) {
				listN[i] = new Node(test[i][0]);
			}
			t=0;
			for(int j=0; j<listN.length;j++) {
				if(listN[j] != null) {
					if(test[i][1] == listN[j].getId()){
						t=1; 
					}
				}
			}
			if(t==0) {
				listN[i] = new Node(test[i][1]);
			}
		}
		Graph g = new Graph(listE,listN, order, size);
		DjikstraSP d = new DjikstraSP();
		d.djikstraSP(g,0);
		double[] dist = d.getD();
		for(int i=0; i<dist.length;i++) {
			System.out.println(g.getListNode()[i].getId() + "  " + dist[i]);
		}
		
	}
}

