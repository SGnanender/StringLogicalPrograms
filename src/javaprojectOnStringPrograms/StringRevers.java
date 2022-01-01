package javaprojectOnStringPrograms;

public class StringRevers {
	
	String S="Java is a good programing language";
	String Rev="";
	
	public void Reversing_A_Srting()
	{
		char[] a=S.toCharArray();
		
		for(int i=a.length-1; i>=0;i--)
		{
			Rev=Rev+a[i];
		}
		System.out.println(Rev);
	}

	public static void main(String[] args) {
		StringRevers SR=new StringRevers();
		SR.Reversing_A_Srting();	
	}
}
