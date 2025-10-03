import java.u l.Scanner;
public class graph
{
sta c final int MAX = 100;
sta c int[] queue = new int[MAX];
sta c int front = -1, rear = -1;
sta c int[] visited = new int[MAX];
// Enqueue Func on
sta c void enqueue(int vertex)
{
if (rear == MAX - 1)
{
System.out.println("Queue Overflow");
return;
}
{
if (front == -1)
front = 0;
}
rear++;
queue[rear] = vertex;
}
// Dequeue Func on
sta c int dequeue()
{
if (front == -1 || front > rear)
{
return -1;
}
int vertex = queue[front];
front++;
return vertex;
}
// BFS Func on
sta c void BFS(int[][] graph, int ver ces, int start)
{
int i;
// Ini alize all ver ces as unvisited
for (i = 0; i < ver ces; i++)
{
visited[i] = 0;
}// Start BFS
enqueue(start);
visited[start] = 1;
System.out.print("BFS Traversal: ");
while (front != -1 && front <= rear)
{
int current = dequeue();
System.out.print(current + " ");
for (i = 0; i < ver ces; i++) {
if (graph[current][i] == 1 && visited[i] == 0)
{
enqueue(i);
visited[i] = 1;
}
}
}
System.out.println();
// Reset front and rear for subsequent tests if desired
front = -1;
rear = -1;
}
// Main Func on
public sta c void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[][] graph = new int[MAX][MAX];
int ver ces, i, j, start;
System.out.print("Enter number of ver ces in the graph: ");
ver ces = sc.nextInt();
System.out.println("Enter adjacency matrix:");
for (i = 0; i < ver ces; i++)
{
for (j = 0; j < ver ces; j++)
{
graph[i][j] = sc.nextInt();
}
}
System.out.print("Enter star ng vertex for BFS (0 to " + (ver ces - 1) + "): ");
start = sc.nextInt();
BFS(graph, ver ces, start);
sc.close();
}
}
