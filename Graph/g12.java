
//Bellman ford algorithm
import java.util.*;
import java.util.LinkedList;

public class g12 {

    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void creatGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0-vertex
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        // // 1 vertex
        graph[1].add(new Edge(1, 2, -4));
        // graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        // vertex 3
        graph[4].add(new Edge(4, 1, -1));
        // graph[4].add(new Edge(4, 5, 5));

        // vertex 4

        // graph[5].add(new Edge(4, 0, 1));
        // graph[5].add(new Edge(4, 2, 1));

    }

    static class pair implements Comparable<pair> {
        int n;
        int path;

        public pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(pair p2) {
            return this.path - p2.path;// path based sorting for my pairs
        }

    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {// tc=v+ElogV
        int dist[] = new int[graph.length];// dist[i] -> src to i
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;// +INFINITY
            }
        }
        int V = graph.length;
        ;
        // algo
        for (int i = 0; i < V - 1; i++) {
            for (int j = 0; j < graph.length; j++) {
                for (int k = 0; k < graph[j].size(); k++) {
                    Edge e = graph[j].get(k);
                    // u,v wt
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    // rela
                    if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                    }
                }

            }
        }
        // print sll durce to vertices shortest dist
        for (int i = 0; i < dist.length; i++) {
            System.out.println(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int v = 5;
        // int arr[]=new arr[v]
        ArrayList<Edge>[] graph = new ArrayList[v];// null-->empty arrayList

        creatGraph(graph);
        int src = 0;
        bellmanFord(graph, src);

    }
}
