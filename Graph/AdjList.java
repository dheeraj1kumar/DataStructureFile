
import java.util.ArrayList;

public class AdjList {

	ArrayList<Integer>[] adj;

	@SuppressWarnings("unchecked")
	AdjList(int v) {
		adj = new ArrayList[v];
		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<Integer>();

		}
	}

	public void insert(int s, int d) {
		adj[s].add(d);
		adj[d].add(s);
	}

	public void creategraph() {
		insert(0, 1);
		insert(0, 2);
		insert(0, 3);
		insert(2, 1);
	}

	public void display() {
		for (ArrayList<Integer> arrayList : adj) {
			// System.out.println("\nVertex " + adj+ ":");
			System.out.println(arrayList);
		}
	}

	public static void main(String[] args) {
		AdjList g = new AdjList(4);
		g.creategraph();
		g.display();
	}

}

// Adjascency List representation in Java

// import java.util.*;

// class Graph {

// // Add edge
// static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
// am.get(s).add(d);
// am.get(d).add(s);
// }

// public static void main(String[] args) {

// // Create the graph
// int V = 5;
// ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

// for (int i = 0; i < V; i++)
// am.add(new ArrayList<Integer>());

// // Add edges
// addEdge(am, 0, 1);
// addEdge(am, 0, 2);
// addEdge(am, 0, 3);
// addEdge(am, 1, 2);

// printGraph(am);
// }

// // Print the graph
// static void printGraph(ArrayList<ArrayList<Integer>> am) {
// for (int i = 0; i < am.size(); i++) {
// System.out.println("\nVertex " + i + ":");
// for (int j = 0; j < am.get(i).size(); j++) {
// System.out.print(" -> " + am.get(i).get(j));
// }
// System.out.println();
// }
// }
// }