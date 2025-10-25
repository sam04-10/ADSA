import java.util.*;
public class cycle {
    static boolean safe(int v,int[][] g,int[] p,int pos){
        if(g[p[pos-1]][v]==0) return false;
        for(int i=0;i<pos;i++) if(p[i]==v) return false;
        return true;
    }
    static boolean hamUtil(int[][] g,int[] p,int pos,int n){
        if(pos==n) return g[p[pos-1]][p[0]]==1;
        for(int v=1;v<n;v++){
            if(safe(v,g,p,pos)){
                p[pos]=v;
                if(hamUtil(g,p,pos+1,n)) return true;
                p[pos]=-1;
            }
        }
        return false;
    }
    static int[] hamCycle(int[][] g){
        int n=g.length,p[]=new int[n]; Arrays.fill(p,-1); p[0]=0;
        return hamUtil(g,p,1,n)?p:new int[]{-1};
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of vertices: "); int V=sc.nextInt();
        int[][] g=new int[V][V];
        System.out.println("\nEnter the adjacency matrix (use 0 for no edge, 1 for edge):");
        for(int i=0;i<V;i++) for(int j=0;j<V;j++) g[i][j]=sc.nextInt();
        int[] p=hamCycle(g);
        System.out.println("\nResult:");
        if(p[0]==-1) System.out.println("No Hamiltonian Cycle exists for this graph.");
        else {
            System.out.println(" Hamiltonian Cycle found: ");
            for(int i:p) System.out.print(i+" ");
            System.out.println(p[0]);
        }
        sc.close();
    }
}
