package data;

public class Graph {
	private Vertex[] graph;
	public Graph(int count) {
		super();
		this.graph = new Vertex[count];
		for(int i=0;i<count;i++){
			this.graph[i]=new Vertex(i);
		}
	}
	public void addUnorientedEdge(int from, int to, int weight){
		this.graph[from].addEdge(to,weight);
		this.graph[to].addEdge(from,weight);
		
	}
	public void addOrientedEdge(int from, int to, int weight){
		this.graph[from].addEdge(to, weight);		
	}
	public Vertex getVertex(Integer num){
		return graph[num];
	}
	public Vertex[] getAll(){
		return graph;
	}
}
