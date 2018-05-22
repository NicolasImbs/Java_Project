
public class Graph {

	public int numVertices;
	public int numEdges;
	protected String[] names;

	public int numberOfVertices() {
		return numVertices;
	}

	public int numberOfEdges() {
		return numEdges;
	}

	@SuppressWarnings("unused")
	public int getIndex(String vertex) {
		for (int i = 0; i < numVertices; i++)
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

	return Edges[source].copyIntoArray();
    }

}
