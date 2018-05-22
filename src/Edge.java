
public class Edge<V> {
	private final V source, destination;
	private int dist;

	
	public Edge(V s, V d, int dist) {
		this.source = s;
		this.destination = d;
		this.dist = dist;
	}
	
	public V from() {return source;}
	public V to() {return destination;}
	public int getDistance() {return dist;}
	
	
//	public int getNeighbourIndex(int nodeIndex) {
//	    if (this.source == nodeIndex) {
//	      return this.destination;
//	    } else {
//	      return this.source;
//	   }
//	  }
	
}
