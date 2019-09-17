/*
	Author      : M.Sukresh
	Class       : IsPrime
	Description : Checks whether the given number is Prime or not.
	Language    : Java
	Question    : Write a java program to Check the given number is Prime or not.
*/
import java.util.Scanner;
public class IsPrime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0 || a==1){
			System.out.println("Not a prime number !");
			return ;
		}
		for(int i=2;i<=(a/2);i++){
			if(a%i==0){
				System.out.println("Not a prime number !");
				return ;
			}
		}
		System.out.println("It is a prime number ");
	}
}
