import java.u l.*;
public class Op malStorage
{
public sta c void main(String[] args)
{
Scanner sc = new Scanner(System.in);
// Take number of programs
System.out.print("Enter number of programs: ");
int n = sc.nextInt();
int[] lengths = new int[n];
System.out.println("Enter lengths of programs:");
for (int i = 0; i < n; i++)
{
lengths[i] = sc.nextInt();
}
// Sort program lengths
Arrays.sort(lengths);
int totalRetrievalTime = 0;
int cumula veTime = 0;
// Calculate total retrieval me
for (int i = 0; i < n; i++)
{cumula veTime += lengths[i];
totalRetrievalTime += cumula veTime;
}
// Calculate MRT
double mrt = (double) totalRetrievalTime / n;
// Print only MRT
System.out.println("Mean Retrieval Time (MRT) = " + mrt);
sc.close();
}
}
