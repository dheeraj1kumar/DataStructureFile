import java.util.*;

public class g5 {

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
        graph[0].add(new Edge(0, 3, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        // vertex2
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        // vertex 3
        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        // vertex 4

        graph[4].add(new Edge(4, 3, 1));

    }

    public static boolean detedctCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (detedctCycleUtil(graph, vis, i, -1)) {
                    return true;// cycle exist in one of the part
                }
            }
        }
        return false;
    }

    public static boolean detedctCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            // case 3
            if (!vis[e.dest]) {
                if (detedctCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // case1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // case 2--> do nothing continue
        }
        return false;
    }

    public static void main(String[] args) {

        int v = 5;
        // int arr[]=new arr[v]
        ArrayList<Edge>[] graph = new ArrayList[v];// null-->empty arrayList

        creatGraph(graph);
        System.out.println(detedctCycle(graph));

    }
}