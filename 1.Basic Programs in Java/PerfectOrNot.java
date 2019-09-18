/*
	Author      : M.Sukresh
	Class       : PerfectOrNot
	Description : Checks whether the given number is Perfect or not.
	Language    : Java
	Question    : Write a java program to check Perfect Number.
*/
import java.util.Scanner;
public class PerfectOrNot{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		if(n==0){
			System.out.println("Not a perfect Number.");
			return;
		}
		for(int i=1;i<=((int)n/2);i++){
			if(n%i==0){
				sum=sum+i;
			}
		}
		if(sum==n){
			System.out.println("Perfect Number.");
			return;
		}
		System.out.println("Not a perfect Number.");
	}
}
