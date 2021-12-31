package javaprojectOnStringPrograms;

public class Remove_Spaces_In_A_String {
	
	String S="Java is a programing language";
	

	public void Method1()
	{
		System.out.println("Method 1 Convering String to Char array and adding "
				+ "to characters to string using the Array Index");
		char[] c=S.toCharArray();
		String NoSpace="";
		
		for(int i=0; i<=c.length-1;i++)
		{
			if(c[i]!=' ')
			{
				NoSpace=NoSpace+c[i];
			}
		}
		System.out.println(NoSpace);
		System.out.println("");
	}
	
	public void Method2()
	{
		System.out.println("Method 2 Convering String to Char array and adding "
				+ "characters to string using the 'charAt(Index)' method of String class");
		char[] c=S.toCharArray();
		String NoSpace="";
		
		for(int i=0; i<=c.length-1;i++)
		{
			if(c[i]!=' ')
			{
				NoSpace=NoSpace+S.charAt(i);
			}
		}
		System.out.println(NoSpace);
		System.out.println("");
	}
	
	
	
	public void Method3()
	{
		System.out.println("Method 3 using 'replaceAll(regex, replacement)' method of String class");
		String NoSpace="";
		NoSpace=S.replaceAll(" ", "");
		System.out.println(NoSpace);
	}

	public static void main(String[] args) {
		Remove_Spaces_In_A_String RSIAS=new Remove_Spaces_In_A_String();
		RSIAS.Method1();
		RSIAS.Method2();
		RSIAS.Method3();
	}

}
