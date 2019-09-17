/*
	Author      : M.Sukresh
	Class       : PrimeNumbersRange
	Description : Find all the prime numbers in the range.
	Language    : Java
	Question    : Write a java program to find all the prime numbers in the range.
*/
import java.util.Scanner;
public class PrimeNumbersRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numbers seperated by space : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<b){
			int temp = a;
			a = b;
			b = temp;			
		}
		for(int i=b;i<=a;i++){
			int flag = 1;
			for(int j=2;j<(i/2);j++){
				if(i%j==0){
					flag = 0;
				}
			}
			if(flag == 1){
				System.out.println(i);
			}
		}
	}
}
