
public class Edge {
	Node source;
	Node destination;
	private int weight;

	
	public Edge(Node s, Node d, int weight) {
		this.source = s;
		this.destination = d;
		this.weight = weight;
	}
	
	public Node from() {return source;}
	public Node to() {return destination;}
	public int getWeight() {return weight;}
	
	
//	public int getNeighbourIndex(int nodeIndex) {
//	    if (this.source == nodeIndex) {
//	      return this.destination;
//	    } else {
//	      return this.source;
//	   }
//	  }
	
}
