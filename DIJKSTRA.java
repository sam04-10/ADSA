import java.util.*;
public class SingleSourceShort {
    static ArrayList<ArrayList<int[]>> adj(int[][] edges,int V){
        ArrayList<ArrayList<int[]>> a=new ArrayList<>();
        for(int i=0;i<V;i++) a.add(new ArrayList<>());
        for(int[] e:edges){
            a.get(e[0]).add(new int[]{e[1],e[2]});
            a.get(e[1]).add(new int[]{e[0],e[2]});
        }
        return a;
    }
    static int[] dijkstra(int V,int[][] edges,int src){
        ArrayList<ArrayList<int[]>> a=adj(edges,V);
        int[] d=new int[V]; Arrays.fill(d,Integer.MAX_VALUE); d[src]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(x->x[0]));
        pq.offer(new int[]{0,src});
        while(!pq.isEmpty()){
            int[] c=pq.poll(); int dist=c[0],u=c[1];
            for(int[] n:a.get(u)){
                if(d[n[0]]>dist+n[1]){
                    d[n[0]]=dist+n[1];
                    pq.offer(new int[]{d[n[0]],n[0]});
                }
            }
        }
        return d;
    }
    public static void main(String[] s){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of vertices: "); int V=sc.nextInt();
        System.out.print("Enter number of edges: "); int E=sc.nextInt();
        int[][] edges=new int[E][3];
        System.out.println("\nEnter each edge as: u v weight");
        for(int i=0;i<E;i++){edges[i][0]=sc.nextInt();edges[i][1]=sc.nextInt();edges[i][2]=sc.nextInt();}
        System.out.print("\nEnter source vertex: "); int src=sc.nextInt();
        int[] r=dijkstra(V,edges,src);
        System.out.println("\nShortest distances from source "+src+":");
        for(int x:r) System.out.print(x==Integer.MAX_VALUE?"INF ":x+" ");
        sc.close();
    }
}
