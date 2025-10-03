import java.util.Scanner;
public class PrimMST
{
 private int findMinKey(int[] key, boolean[] mstSet, int V)
{
 int min = Integer.MAX_VALUE;
int min_index = -1;
 for (int v = 0; v < V; v++)
{
 if (!mstSet[v] && key[v] < min)
{ min = key[v];
min_index = v;
}
}
 return min_index;
}
 private void printMST(int[] parent, int[][] graph, int V)
{ int totalCost =
0;
System.out.println("\nMinimum Spanning Tree:");
System.out.println("Edge \t Weight");
 for (int i = 1; i < V; i++)
{
 int edgeWeight = graph[i][parent[i]];
 System.out.println(parent[i] + " - " + i + "\t " + edgeWeight);
totalCost += edgeWeight;
}
 System.out.println("\nTotal cost of MST: " + totalCost);
}
 public void primMST(int[][] graph, int V)
{
 int[] parent = new int[V]; int[]
key = new int[V]; boolean[] mstSet
= new boolean[V];
 for (int i = 0; i < V; i++)
{
 key[i] = Integer.MAX_VALUE;
mstSet[i] = false;

}
 key[0] = 0; parent[0]
= -1;
 for (int count = 0; count < V - 1; count++)
{
 int u = findMinKey(key, mstSet, V);
mstSet[u] = true; for (int v = 0; v <
V; v++)
{
 if (graph[u][v] != 0 && !mstSet[v] && graph[u][v] < key[v])
{ parent[v] = u;
key[v] = graph[u][v];
}

}

}
 printMST(parent, graph, V);

}
 public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of vertices: ");
 int V = sc.nextInt();
 int[][] graph = new int[V][V];
 System.out.println("Enter the adjacency matrix for the graph (enter 0 for no edge):");
 for (int i = 0; i < V; i++)
{ for (int j = 0; j < V;
j++)
{ graph[i][j] =
sc.nextInt();
 if (i == j)
{ graph[i][j] =
0;

}

}

}
 PrimMST mst = new PrimMST();
mst.primMST(graph, V);
 sc.close();
}
 }
Ouput ;
Enter the number of vertices: **5**
Enter the adjacency matrix for the graph (enter 0 for no edge):
0 2 0 6 0
2 0 3 8 5
0 3 0 0 7
6 8 0 0 9
0 5 7 9 0
Minimum Spanning Tree:
Edge Weight
0 - 1 2
1 - 2 3
0 - 3 6
1 - 4 5
Total cost of MST: 16
