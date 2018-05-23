
public abstract class Graph<V extends Comparable<V>> {

	public int nbVertices;
	public int nbEdges;
	protected String[] names;
	protected int n;
	protected int m;


	public Graph(int nbVertices, int nbEdges) {
		this.n = nbVertices;
		this.m = nbEdges;
		
	}
	
	
	public int numberOfVertices() {
		return nbVertices;
	}

	public int numberOfEdges() {
		return nbEdges;
	}
	
	public Graph() {
		this(0,0);
	}
	
	public int order() {
		return n;
	}
	
	public int size() {
		return m;
	}


	@SuppressWarnings("unused")
	public int getIndex(String vertex) {
		for (int i = 0; i < nbVertices; i++)
			if (vertex.equals(names[i])) {
				return i;
			} else {
				return -1;
			}
		return 0;
	}
	
	public String[] getNeighbors(String vertex)
    {
            int source = getIndex(vertex);
            if(source == -1)
            {
                    System.out.print("getNeighbors failed: Vertex ");
                    System.out.print(vertex);
                    System.out.println(" does not exist.");
                    return null;
            }

	return Edge.from(source).copyIntoArray();
    }

}
