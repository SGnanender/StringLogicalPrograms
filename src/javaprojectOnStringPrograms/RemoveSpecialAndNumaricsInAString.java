package javaprojectOnStringPrograms;

public class RemoveSpecialAndNumaricsInAString {

	public static void main(String[] args) {
		
		String str="@12$J*9)%a3v6(#a";
		
		String plainString=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(plainString);

	}

}
