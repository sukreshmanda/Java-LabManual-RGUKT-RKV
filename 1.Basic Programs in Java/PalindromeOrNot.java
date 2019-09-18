/*
	Author      : M.Sukresh
	Class       : PalindromeOrNot
	Description : Checks whether the given number is palindrome or not.
	Language    : Java
	Question    : Write a java program to Check the given is palindrome or not..
*/
import java.util.Scanner;
public class PalindromeOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		String r = "";
		for(int i=n.length()-1;i>=0;i--){
			r+=n.charAt(i);
		}
		if(n.equals(r)){
			System.out.println("String is palindrome.");
			return;
		}
		System.out.println("String is not palindrome.");
	}
}
