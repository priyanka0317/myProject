import java.util.Scanner;
class TrianglePattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==1 || i==n || i==j || j==1)
				{
					System.out.print("*");
				}
				else if(i>j)
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
