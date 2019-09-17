/*
	Author      : M.Sukresh
	Class       : LCM
	Description : Find the Perfect Numbers up to n.
	Language    : Java
	Question    : Write a java program to Perfect Numbers upto n.
*/
import java.util.Scanner;
public class PerfectUpTo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		if(n<=1){
			return ;
		}else{
			for(int i=2;i<=n;i++){
				for(int j=1;j<i;j++){
					if(i%j==0){
						sum+=j;
					}
				}
				if(sum == i){
					System.out.println(i);
				}
				sum = 0;
			}
		}
	}
}
