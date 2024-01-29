
import java.util.*;

public class g14 {
    static class Edge implements Comparable<Edge> {

        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;

        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;

        }
    }

    static void creatGraph(ArrayList<Edge> edges) {
        // for (int i = 0; i < graph.length; i++) {
        // graph[i] = new ArrayList<>();
        // }

        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));

    }

    static class pair implements Comparable<pair> {
        int v;
        int cost;

        public pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost;
        }
    }

    static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void intit() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskalMst(ArrayList<Edge> edges, int V) {
        intit();
        Collections.sort(edges);// O(ElogE)
        int mstCost = 0;
        int count = 0;
        for (int i = 0; count < V - 1; i++) {// O(V)
            Edge e = edges.get(i);
            // (src,dest,wt)

            int parA = find(e.src);// src=a
            int parB = find(e.dest);// dest=b
            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {

        int V = 4;
        // int arr[]=new arr[v]
        ArrayList<Edge> edges = new ArrayList<>();// null-->empty arrayList

        creatGraph(edges);
        kruskalMst(edges, V);

    }
}
