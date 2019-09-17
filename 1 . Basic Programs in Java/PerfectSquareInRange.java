/*
	Author      : M.Sukresh
	Class       : PerfectSuqareInRange
	Description : Find all the Perfect Squares in the range.
	Language    : Java
	Question    : Write a java program to find all the Perfect Squares in the given range.
*/
import java.util.Scanner;
public class PerfectSquareInRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(m<n){
			int temp = m;
			m = n;
			n = temp;
		}
		for(int i=n;i<=m;i++){
			double s = Math.sqrt(i);
			if((s-Math.floor(s))==0){
				System.out.println(i);
			}
		}
	}
}
