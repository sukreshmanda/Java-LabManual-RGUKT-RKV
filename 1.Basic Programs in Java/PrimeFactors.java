/*
	Author      : M.Sukresh
	Class       : PrimeFactors
	Description : Find all the prime factors of a number.
	Language    : Java
	Question    : Write a java program to find all the prime factors of the given number.
*/
import java.util.Scanner;
public class PrimeFactors{
	public static boolean isPrime(int a){
		for(int i=2;i<(a/2);i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			if(n%i==0){
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
	}
}
