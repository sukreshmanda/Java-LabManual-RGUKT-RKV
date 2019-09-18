/*
	Author      : M.Sukresh
	Class       : GCD
	Description : Find the GCD of two numbers.
	Language    : Java
	Question    : Write a java program to find the GCD of two numbers.
*/
import java.util.Scanner;
public class GCD{
	public static int findGCD(int n, int m){
		if(m==0){
			return n;
		}
		return findGCD(m,n%m);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers seperated with space : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(findGCD(n,m));
	}
}
