
public class AsteriskLadder {
	public static void main(String args[])
	{
		int x = 5;
		descenedingBuild(x);
		ascenedingBuild(x);
	}
	
	public static void descenedingBuild(int x)
	{
		int count = 1;
		for(int j=0;j<x;j++)
		{
			for(int i=0;i<count;i++)
			{
				System.out.print("*");
			}
			count++;
			System.out.print("\n");
		}	
	}
	
	public static void ascenedingBuild(int x)
	{
		int count = 1;
		for(int j=0;j<x;j++)
		{
			for(int i=0;i<x-count;i++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<count;k++)
			{
				System.out.print("*");
			}
			count++;
			System.out.print("\n");
		}
	}
}
