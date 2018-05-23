
public class Edge<V> {
	private final V source, destination;
	private int weight;

	
	public Edge(V s, V d, int weight) {
		this.source = s;
		this.destination = d;
		this.weight = weight;
	}
	
	public V from() {return source;}
	public V to() {return destination;}
	public int getWeight() {return weight;}
	
	
//	public int getNeighbourIndex(int nodeIndex) {
//	    if (this.source == nodeIndex) {
//	      return this.destination;
//	    } else {
//	      return this.source;
//	   }
//	  }
	
}
