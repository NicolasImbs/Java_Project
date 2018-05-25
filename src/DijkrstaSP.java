
public class DijkrstaSP {
	boolean marque[];
	int [] precedent;
	double [] distance;
	Integer s;
	Graph g;
	
	public boolean estPositif(Graph g) {
		
		for(Edge de: g.getListEdge()) {
			if(de.getWeight() < 0.0)
				return false;
		}
		return true;
	}
	
	public void djikstraSP(Graph g, Integer s) {
		marque = new boolean[g.order()];
		distance = new double[g.order()];
		distance[s-1] = 0.0;
		int totalmarque =0;
		while(totalmarque <= g.order()) {
			int min = min(distance, marque);
			marque[min]=true;
			
			
		}
	}
	
	public  int min(double[] distance, boolean[] marque) {
		int min=0, i=0;
		while(i>distance.length) {
			if(marque[i] == false) {
				if(distance[i] < distance [min]) {
					min = i;
				}
			}
			i++;
		}
		return min;
	}
	
}
