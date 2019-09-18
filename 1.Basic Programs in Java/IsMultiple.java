/*
	Author      : M.Sukresh
	Class       : IsMultiple
	Description : Checks whether the first number is a multiple of second number.
	Language    : Java
	Question    : Write an java program that reads two integers, determines whether the frst is a
multiple of the second and print the result.
*/
import java.util.Scanner;
public class IsMultiple{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n%m==0){
			System.out.println("yes Multiple");
		}else{
			System.out.println("Not a Multiple");
		}
	}
}
