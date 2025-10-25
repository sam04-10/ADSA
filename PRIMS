import java.util.*;
public class Prims {
    static int minKey(int[] key, boolean[] mst, int V) {
        int min = Integer.MAX_VALUE, idx = -1;
        for (int i = 0; i < V; i++) if (!mst[i] && key[i] < min) { min = key[i]; idx = i; }
        return idx;
    }
    static void printMST(int[] p, int[][] g, int V) {
        int cost = 0;
        System.out.println("Edge Weight");
        for (int i = 1; i < V; i++) {
            System.out.println(p[i] + " - " + i + " " + g[i][p[i]]);
            cost += g[i][p[i]];
        }
        System.out.println("Total cost of MST: " + cost);
    }
    static void prim(int[][] g, int V) {
        int[] p = new int[V], key = new int[V];
        boolean[] mst = new boolean[V];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0; p[0] = -1;
        for (int c = 0; c < V - 1; c++) {
            int u = minKey(key, mst, V); mst[u] = true;
            for (int v = 0; v < V; v++)
                if (g[u][v] != 0 && !mst[v] && g[u][v] < key[v]) { p[v] = u; key[v] = g[u][v]; }
        }
        printMST(p, g, V);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt(), g[][] = new int[V][V];
        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < V; i++) for (int j = 0; j < V; j++) {
            g[i][j] = sc.nextInt(); if (i == j) g[i][j] = 0;
        }
        prim(g, V);
        sc.close();
    }
}
