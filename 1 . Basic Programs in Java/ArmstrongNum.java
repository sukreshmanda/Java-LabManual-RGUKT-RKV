/*
	Author      : M.Sukresh
	Class       : ArmstrongNum
	Description : Checks whether the given number is Armstrong or not.
	Language    : Java
	Question    : Write a java program to Check the given number is Armstrong or not.
*/
import java.util.Scanner;
public class ArmstrongNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp=n,sum=0;
		if(n == 1){
			System.out.println("Number is not palindrome .");
			return;
		}
		while(n!=0){
			sum=sum+(int)Math.pow((n%10),3);
			n=(int)n/10;
		}
		if(sum==temp){
			System.out.println("Number is palindrome .");
			return;
		}
		System.out.println("Number is not palindrome .");
	}
}
