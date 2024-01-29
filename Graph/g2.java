
// //graph traversal
// //1=Breadth first search
// //2 =Defth first search
import java.util.LinkedList;
import java.util.*;

// public class g2 {

//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void creatGraph(ArrayList<Edge> graph[]) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0-vertex
//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 2, 1));

//         // 1 vertex
//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         // vertex2
//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         // vertex 3
//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         // vertex 4

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 3, 1));
//         graph[4].add(new Edge(4, 5, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         graph[6].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge>[] graph) { // 0(V+E)
//         Queue<Integer> q = new LinkedList<>();
//         boolean vis[] = new boolean[graph.length];
//         q.add(0);// source=0;
//         while (!q.isEmpty()) {
//             int curr = q.remove();

//             if (!vis[curr]) {// viit curr
//                 System.out.print(curr + " ");
//                 vis[curr] = true;
//                 for (int i = 0; i < graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);

//                     q.add(e.dest);
//                 }

//             }
//         }
//         System.out.println("\navobe is bfs and down is dfs");
//     }

//     public static void dfs(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
//         // visit

//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for (int i = 0; i < graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if (!vis[e.dest]) {
//                 dfs(graph, e.dest, vis);
//             }
//         }
//     }

//     // public static void DFS(ArrayList<Edge>[] graph,int s)
//     // {
//     // boolean visited[] = new boolean[graph.length];
//     // LinkedList<Integer> stack = new LinkedList<Integer>();
//     // visited[s] = true;
//     // stack.add(s);
//     // while (stack.size() != 0) {
//     // s = stack.pollLast();
//     // System.out.print(s + " ");
//     // Iterator<Integer> i = adj[s].listIterator();
//     // while (i.hasNext()) {
//     // int n = i.next();
//     // if (!visited[n]) {
//     // visited[n] = true;
//     // stack.add(n);
//     // }
//     // }
//     // }
//     // }
//     public static void main(String[] args) {

//         int v = 7;
//         // int arr[]=new arr[v]
//         ArrayList<Edge>[] graph = new ArrayList[v];// null-->empty arrayList

//         creatGraph(graph);
//         bfs(graph);

//         dfs(graph, 0, new boolean[v]);
//     }
// }

//graph traversal

//1=Breadth first search

//2 =Defth first search
/*import java.util.LinkedList;
import java.util.*;

public class g2 {

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
        graph[1].add(new Edge(1, 2, 1));

        // vertex2
        graph[2].add(new Edge(2, 0, 1));

        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 4, 1));

        // vertex 3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        // graph[3].add(new Edge(3, 5, 1));

        // vertex 4

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        // graph[4].add(new Edge(4, 5, 1));

        // graph[5].add(new Edge(5, 3, 1));
        // graph[5].add(new Edge(5, 4, 1));
        // graph[5].add(new Edge(5, 6, 1));

        // graph[6].add(new Edge(6, 5, 1));
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

        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
      }

    // public static void DFS(ArrayList<Edge>[] graph,int s)
    // {
    // boolean visited[] = new boolean[graph.length];
    // LinkedList<Integer> stack = new LinkedList<Integer>();
    // visited[s] = true;
    // stack.add(s);
    // while (stack.size() != 0) {
    // s = stack.pollLast();
    // System.out.print(s + " ");
    // Iterator<Integer> i = adj[s].listIterator();
    // while (i.hasNext()) {
    // int n = i.next();
    // if (!visited[n]) {
    // visited[n] = true;
    // stack.add(n);
    // }
    // }
    // }
    // }
    public static void main(String[] args) {

        int v = 5;
        // int arr[]=new arr[v]
        ArrayList<Edge>[] graph = new ArrayList[v];// null-->empty arrayList

        creatGraph(graph);
        bfs(graph);

        dfs(graph, 0, new boolean[v]);
    }
}*/

import java.io.*;
import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int s, int d) {
        adj[s].add(d);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " " + "\n");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    void DFS(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> stack = new LinkedList<Integer>();
        visited[s] = true;
        stack.add(s);
        while (stack.size() != 0) {
            s = stack.pollLast();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    stack.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(1, 3);
        System.out.println("Following is Breadth First Traversal" +
                "(starting from vertex 2)");
        g.BFS(0);
        g.DFS(0);
    }
}

/*
 * 01243
 * 02431
 */