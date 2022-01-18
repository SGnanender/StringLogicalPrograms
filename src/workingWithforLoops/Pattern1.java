package workingWithforLoops;

public class Pattern1 {
	
	public void pattern1()
	{
		for(int i=1;i<10;i++)
		{
			
			for(int j=i;j>0;j--)
			{
			System.out.print("*");		
			}
			System.out.println();
		}
		
	}
	
	public void pattern2()
	{
		for(int i=10;i>0;i--)
		{
			
			for(int j=1;j<i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void pattern3()
	{
		for(int i=1;i<10;i++)
		{
			
			for(int j=i;j>0;j--)
			{
			System.out.print("*");		
			}
			System.out.println();
		}
		for(int i=9;i>0;i--)
		{
			
			for(int j=1;j<i;j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void pattern4()
	{
		for(int i=1;i<9;i++)
		{
			for(int j=8;j>i;j--)
			{
			System.out.print(" ");		
			}
			for(int k=0;k<i;k++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void pattern5()
	{
		for(int i=9;i>1;i--)
		{
			for(int j=i;j<9;j++)
			{
			System.out.print(" ");		
			}
			for(int k=i;k>1;k--)
			{
			System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	
	public void pattern6() //Exact like 4th method just need to add space before each Star
	{
		for(int i=1;i<9;i++)
		{
			for(int j=8;j>i;j--)
			{
			System.out.print(" ");		
			}
			for(int k=0;k<i;k++)
			{
			System.out.print(" *"); //Added space before the Star
			}
			System.out.println();
		}
		
	}
	
	public void pattern7()
	{
		int Alpha=65;
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print((char)(Alpha+j)+" ");		
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		Pattern1 p= new Pattern1();
//p.pattern5();
//p.pattern4();
//p.pattern3();
//p.pattern2();
//p.pattern1();
//p.pattern6();
p.pattern7();
	}

}
