package reading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import data.Graph;

public class ReadGraph {
	public static Graph ReadOrientedGraphFromEdgeList(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		while(sc.hasNext()){
			int from=sc.nextInt();
			int to=sc.nextInt();
			int weight=sc.nextInt();
			graph.addOrientedEdge(from, to, weight);
		}
		sc.close();
		return graph;
	}
	public static Graph ReadOrinetedGraphFromAdjacencyMatrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		int[][] matrix=new int[count][count];
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				if(matrix[i][j]!=0)
					graph.addOrientedEdge(i, j, matrix[i][j]);
		sc.close();
		return graph;
	}
	public static Graph ReadUnorientedGraphFromEdgeList(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		while(sc.hasNext()){
			int from=sc.nextInt();
			int to=sc.nextInt();
			int weight=sc.nextInt();
			graph.addUnorientedEdge(from, to, weight);
		}
		sc.close();
		return graph;
	}
	public static Graph ReadUnorinetedGraphFromAdjacencyMatrix(String fname) throws FileNotFoundException{
		Scanner sc;
		if(fname.endsWith(".txt")){
			sc=new Scanner(new FileInputStream(fname));
		}
		else{
			sc=new Scanner(new FileInputStream(fname+".txt"));
		}
		int count=sc.nextInt();
		Graph graph=new Graph(count);
		int[][] matrix=new int[count][count];
		for(int i=0;i<count;i++)
			for(int j=0;j<count;j++)
				matrix[i][j]=sc.nextInt();
		for(int i=0;i<count;i++)
			for(int j=i;j<count;j++)
				if(matrix[i][j]!=0)
					graph.addUnorientedEdge(i, j, matrix[i][j]);
		sc.close();
		return graph;
	}	
}