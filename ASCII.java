import java.util.Scanner;

public class AsciiValueInput
{
	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a character");
		char ch= scanner.next().charAt(0);
		int ascii = (int) ch;
		System.out.println("the ASCII value of '" + ch + "' is: " + ascii);
	}
}