package main;

public class pattern1 {
//	   *
//	   **
//	   ***
//	   ****
//	   *****
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//i determines rows
		{
			for(int j=1;j<=i;j++)//j determines columns
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
