import java.util.*;
public class FLOYDWARSHALL {
    static final int INF = 100000000;
    static void floydWarshall(int[][] d) {
        int V = d.length;
        for (int k = 0; k < V; k++)
            for (int i = 0; i < V; i++)
                for (int j = 0; j < V; j++)
                    if (d[i][k] != INF && d[k][j] != INF)
                        d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
    }
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices: ");
        int V = sc.nextInt(), d[][] = new int[V][V];
        System.out.println("\nEnter the adjacency matrix:");
        for (int i = 0; i < V; i++) for (int j = 0; j < V; j++) d[i][j] = sc.nextInt();
        floydWarshall(d);
        System.out.println("\nShortest distance matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) System.out.print((d[i][j]==INF?"INF":d[i][j])+" ");
            System.out.println();
        }
        sc.close();
    }
}
