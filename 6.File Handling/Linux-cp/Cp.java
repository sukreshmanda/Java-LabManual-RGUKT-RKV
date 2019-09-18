/*
	Author : M.Sukresh
	Class  : Cp
	Description : Copy all contents of the file as a first arguement into file as second arguement.
*/
import java.util.*;
import java.io.*;
class Cp{
	public static void main(String args[])throws IOException{
		if(args[0]==null){
			System.out.println("Please enter file name as first arguement.");
			return;
		}else if(args[1]==null){
			System.out.println("Please enter output file as second arguement.");
		}
		FileReader fr ;
		BufferedReader br ;
		String str ;
		try{
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			str="";
			FileWriter fw ;
			try{
				fw = new FileWriter(args[1]);
				while((str=br.readLine())!=null){
					fw.write(str+"\n");
				}
				fw.close();
				br.close();
				fr.close();
			}catch(Exception e){
				System.out.println("File not possible to write.");
			}
		}catch(Exception e){
			System.out.println("File not possible to read.");
		}
	}
}
