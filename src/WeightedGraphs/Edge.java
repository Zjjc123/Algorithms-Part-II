package WeightedGraphs;

public class Edge
{
	private final int v, w;
	private final double weight;
	
	public Edge(int v, int w, double weight)
	{
		this.v = v;
		this.w = w;
		this.weight = weight;  
	}
	
	public int either()
	{
		return v;
	}
	
	// Returns the other vertex
	public int other(int vertex)
	{
		if (vertex == v)
			return w;
		else 
			return v;
	}
	
	public int comparable(Edge that)
	{
		if (this.weight < that.weight)
			return -1;
		else if (this.weight > that.weight)
			return 1;
		else 
			return 0;
	}
}
