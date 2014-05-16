package main;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import data.Graph;
import dijkstra.Dijkstra;
import reading.ReadGraph;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Graph g= ReadGraph.ReadUnorientedGraphFromEdgeList("EdgeListTest");
		LinkedList<Integer> res=Dijkstra.doDijkstra(g, 0, 8);
		if(res!=null){
			System.out.println("length="+res.pollLast());
			System.out.println("path");
			for(Integer i:res)
				System.out.println(i);
		}
		
	}

}
