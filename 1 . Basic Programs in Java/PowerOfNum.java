import java.util.Scanner;
public class PowerOfNum{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int e = sc.nextInt();
		if((b==0 && e<0)|| (b==0 && e==0)){
			System.out.println(0.0);
		}
		else if(e==0){
			System.out.println(1.0);
		}
		else{
			int exp=e;
			double f=1;
			if(e<1){
				exp=-e;
			}
			for(int i=1;i<=exp;i++){
				f=f*b;	
			}
			if(e<0){
				f=1/f;
			}
			System.out.println(f);
		}
	}
}
