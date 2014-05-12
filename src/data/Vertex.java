package data;

import java.util.ArrayList;
import java.util.Collections;

public class Vertex implements Comparable<Vertex>{
	private int num;
	private ArrayList<Edge> edges;
	private boolean isVisited;
	private Integer distance;
	public Vertex(int num) {
		super();
		this.num = num;
		this.edges=new ArrayList<>();
		this.isVisited=false;
		this.distance=Integer.MAX_VALUE;
	}
	public int getNum() {
		return num;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void markVisited() {
		this.isVisited = true;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	public void addEdge(Integer vnum, int weight){
		edges.add(new Edge(vnum, weight));
		Collections.sort(edges);
	}
	@Override
	public int compareTo(Vertex arg0) {
		return Integer.compare(distance, arg0.distance);
	}	
	public ArrayList<Edge> getEdges(){
		return edges;
	}
}
