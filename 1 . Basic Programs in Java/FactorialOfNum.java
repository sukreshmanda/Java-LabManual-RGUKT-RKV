/*
	Author      : M.Sukresh
	Class       : FactorialNum
	Description : Find the Factorial of a numbers.
	Language    : Java
	Question    : Write a java program to find the factorial of a numbers.
*/
import java.util.Scanner;
public class FactorialOfNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m=1,k=n;
		while(n!=0){
			m=m*n;
			n--;
		}
		System.out.println("Factorial of "+k+" is : "+m);
	}
}
