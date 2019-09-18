/*
	Author      : M.Sukresh
	Class       : SumOfDigitsOfNum
	Description : Find the sum of digits of a number.
	Language    : Java
	Question    : Write a java program to find the sum of digits of a number.
*/
import java.util.Scanner;
public class SumOfDigitsOfNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=0,k=n;
		while(n!=0){
			m=m+(n%10);
			n=(int)n/10;
		}
		if(k<0){
			System.out.println("Sum is :"+(-m));
			return;
		}
		System.out.println("Sum is :"+m);
		return ;
	}
}
