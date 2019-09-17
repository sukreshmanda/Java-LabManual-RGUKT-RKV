/*
	Author      : M.Sukresh
	Class       : LCM
	Description : Find the LCM of two numbers.
	Language    : Java
	Question    : Write a java program to find the LCM of two numbers.
*/
import java.util.Scanner;
public class LCM{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int lcm = (n>m)?n:m;
		while(true){
			if(lcm%n == 0 && lcm%m == 0){
				System.out.println(lcm);
				return;
			}
			lcm++;
		}
	}
}
