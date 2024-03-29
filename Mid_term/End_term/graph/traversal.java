package Mid_term.End_term.graph;

//graph traversal
//1=Breadth first search
//2 =Defth first search
import java.util.LinkedList;
import java.util.*;

public class traversal {

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
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        // vertex2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // vertex 4

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge>[] graph) { // 0(V+E)
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);// source=0;
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {// viit curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);

                    q.add(e.dest);
                }

            }
        }
        System.out.println("\navobe is bfs and down is dfs");
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // visit

        System.out.print(+curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static void main(String[] args) {

        int v = 7;
        // int arr[]=new arr[v]
        ArrayList<Edge>[] graph = new ArrayList[v];// null-->empty arrayList

        creatGraph(graph);
        bfs(graph);

        dfs(graph, 0, new boolean[v]);
    }
}
