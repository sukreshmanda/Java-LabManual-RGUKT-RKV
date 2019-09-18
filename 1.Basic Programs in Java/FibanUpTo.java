/*
	Author      : M.Sukresh
	Class       : FibanUpTo
	Description : Prints all the Fibanacci numbers upto n.
	Language    : Java
	Question    : Write a java program to print the Fibonacci series up to the given range n.
*/
import java.util.Scanner;
public class FibanUpTo{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = 0;
		int b = 1;
		if(n == 0){
			return;
		}else if(n == 1){
			System.out.println(a);
		}else if(n == 2){
			System.out.println(b);
		}else{
			while(b<=n){
				System.out.println(a);
				int temp = a;
				a = b;
				b = b+temp;
			}
			System.out.println(a);
		}
	}
}
