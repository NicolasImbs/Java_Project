import java.util.ArrayList;

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
		distance[0] = 0.0;
		int totalmarque =0;
		while(totalmarque <= g.order()) {
			int min = min(distance, marque);
			marque[min]=true;
			totalmarque++;
			ArrayList<Integer> voisin = new ArrayList<Integer>();
			voisin = (ArrayList<Integer>) g.getVoisin(min, g);
			for(Integer n: voisin) {
				if(marque[g.findE(n)]==false) {
					double d = distance[min] + g.getListEdge()[g.findE(n)].getWeight(); 
					if(distance[g.findE(n)] < d) {
						distance[g.findE(n)-1] = distance[g.findE(n)];
					}
					else {
						distance[g.findE(n)-1] = d;
					}
				}
			}
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
		int[][] test = {{0,1,10},
		                {1,3,7},
		                {2,3,6},
		                {0,2,3},
		                {0,3,2}};
		int size = test.length;
		int order = 4;
		Edge[] listE = new Edge[5];
		for(int i=0; i<test.length;i++) {
			listE[i] = new Edge(new Node(test[i][0]),new Node(test[i][1]),test[i][2]);
		}
		Graph g = new Graph(listE, order, size);
		DjikstraSP d = new DjikstraSP();
		d.djikstraSP(g,0);
		double[] dist = d.getD();
		for(double a: dist) {
			System.out.println(a);
		}
		
	}
}

