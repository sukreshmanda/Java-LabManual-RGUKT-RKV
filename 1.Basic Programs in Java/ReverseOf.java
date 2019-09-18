/*
	Author      : M.Sukresh
	Class       : ReverseOf
	Description : Find the Reverse of given.
	Language    : Java
	Question    : Write a java program to find Reverse of the given.
*/
import java.util.Scanner;
public class ReverseOf{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int len = n.length();
		String result="";
		for(int i=len-1;i>=0;i--){
				result=result+n.charAt(i);
		}
		System.out.println("Reverse of "+n+" is : "+result);
	}
}
