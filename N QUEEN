import java.util.*;
public class NQueens {
    static int solCount=0;
    static void printBoard(int[][] b,int n){
        solCount++;
        System.out.println("SoluƟon " + solCount + ":");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(b[i][j]>0?"Q"+b[i][j]+" ":"- ");
            System.out.println();
        }
        System.out.println();
    }
    static boolean isSafe(int[][] b,int r,int c,int n){
        for(int i=0;i<r;i++) if(b[i][c]>0) return false;
        for(int i=r,j=c;i>=0&&j>=0;i--,j--) if(b[i][j]>0) return false;
        for(int i=r,j=c;i>=0&&j<n;i--,j++) if(b[i][j]>0) return false;
        return true;
    }
    static boolean solveNQ(int[][] b,int r,int n){
        if(r==n){ printBoard(b,n); return true; }
        boolean res=false;
        for(int c=0;c<n;c++){
            if(isSafe(b,r,c,n)){
                b[r][c]=r+1;
                res=solveNQ(b,r+1,n)||res;
                b[r][c]=0;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of queens (N): ");
        int n=sc.nextInt();
        int[][] b=new int[n][n];
        if(!solveNQ(b,0,n)) System.out.println("No soluƟon exists");
    }
}
