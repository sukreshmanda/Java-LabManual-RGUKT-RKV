import java.io.*;
import java.util.*;
class NumberCheck {
	public static void checkNum(int n){
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%i==0){
				throw new PrimeException(n);
			}
		}
		System.out.println(n+" is a Prime number .");
	}
	public static void main(String args[])throws IOException{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter no of times to iterate the loop : ");
			int n = Integer.parseInt(br.readLine());
			int i=0;
			while(i++<n){
				try{
					System.out.print("Enter number to check :");
					int k = Integer.parseInt(br.readLine());
					checkNum(k);
				}catch(Exception e){
					System.out.println("Error "+e);
				}
			}
		}catch(Exception e){
			System.out.println("Error "+e);
		}
	}
}
