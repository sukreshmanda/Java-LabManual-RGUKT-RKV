/*
	Author      : M.Sukresh
	Class       : MaxOfThree
	Description : Finds the max of three numbers.
	Language    : Java
	Question    : Write a java program to Find maximum of three numbers.
*/
import java.util.Scanner;
public class MaxOfThree{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max=a;
		if(b>=max){
			max=b;
		}
		if(c>=max){
			max=c;
		}
		System.out.println("Max among "+a+", "+b+", "+c+" is : "+max);
	}
}
