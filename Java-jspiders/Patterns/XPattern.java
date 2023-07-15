import java.util.Scanner;
class XPattern 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number for the range");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j || (j+i)==(n+1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
