/*
	Author      : M.Sukresh
	Class       : ArmstrongUpTo
	Description : Prints all the armstrong numbers upto n.
	Language    : Java
	Question    : Write a java program to Print the Armstrong numbers up to the given.
*/
import java.util.Scanner;
public class ArmstrongUpTo{
	public static boolean isArmstrong(int n){
		int temp=n,sum=0;
		if(n == 1){
			return false;
		}
		while(n!=0){
			sum=sum+(int)Math.pow((n%10),3);
			n=(int)n/10;
		}
		if(sum==temp){
			return true;
		}
		return false;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i>408){
				return;
			}
			if(isArmstrong(i)){
				System.out.println(i);
			}
		}
	}
}
