package data;

public class Edge implements Comparable<Edge>{
	private Integer endPoint;
	private int weight;
	public Integer getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Integer endPoint) {
		this.endPoint = endPoint;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public Edge(Integer endPoint, int weight) {
		super();
		this.endPoint = endPoint;
		this.weight = weight;
	}
	@Override
	public int compareTo(Edge arg0) {
		return this.endPoint.compareTo(arg0.endPoint);
	}
}
