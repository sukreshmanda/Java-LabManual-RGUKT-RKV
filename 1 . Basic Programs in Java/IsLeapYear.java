/*
	Author      : M.Sukresh
	Class       : IsLeapYear
	Description : Checks whether the given Year is Leap or not.
	Language    : Java
	Question    : Write a java program to Check the given year is Leap year or not.
*/
import java.util.Scanner;
public class IsLeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%100==0){
			if(n%400==0){
				System.out.println("Yes it is leap year.");
				return ;
			}
			else{
				System.out.println("No it is not leap year.");
				return ;
			}
		}
		else if(n%4==0){
			System.out.println("Yes it is leap year.");
			return ;
		}
		System.out.println("No it is not leap year.");
		return ;
	}
}
