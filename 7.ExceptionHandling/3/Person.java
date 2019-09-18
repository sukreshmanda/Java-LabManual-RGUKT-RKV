import java.io.*;
import java.util.*;
class Person{
	public String name;
	public int age;
	public static boolean isCharHavingNum(String s){
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if((int)c >=48 && (int)c <=57 ){
				return true;
			}
		}
		return false;
	}
	public Person(String name,int age){
		if(!isCharHavingNum(name)){
			this.name = name;
			this.age = age;
		}else{
			throw new NumericException(name);
		}
	}
	public String toString(){
		return this.name+" "+this.age;
	}
	public static void main(String args[])throws IOException{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fr = new FileWriter("data.txt");
		BufferedWriter br = new BufferedWriter(fr);
		int i=0;
		System.out.println("Welcome to Dumb Minds \n\t\tFrom M.Sukresh.\n\n");
		System.out.println("Enter no of times to iterate the loop : ");
		int u = Integer.parseInt(sc.readLine());
		while(i++<u){
			try{
				System.out.print("\n\nEnter String Name: ");
				String n = sc.readLine();
				System.out.print("\nEnter int Age: ");
				int k = Integer.parseInt(sc.readLine());
				Person p = new Person(n,k);
				System.out.println(p.name+" "+p.age);
				br.write(p+"\n");
			}catch(Exception e){
				System.out.println("Error : "+e);
			}
		}
		br.close();
		fr.close();
	}
}
