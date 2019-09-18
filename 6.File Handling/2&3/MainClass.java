/*
	Author : M.Sukresh
	Class  : MainClass
	Description : Read data from file apply ceaser cipher encryption for alphabets and write into another file.
*/
import java.io.*;
import java.util.*;
class MainClass{
	public static void main(String args[])throws IOException{
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("output.txt");
		String s = br.readLine();
		String r="";
		while(s!=null){
			for(int i=0;i<s.length();i++){
				int temp = (int)s.charAt(i);
				if(temp>=65&&temp<=90){
					int se = temp+3;
					if(se>90){
						se = 65+temp-90-1;					
					}
					r+=(char)se;
				}
				else if(temp>=97&&temp<=122){
					int se = temp+3;
					if(se>122){
						se = 97+se-122-1;
					}
					r+=(char)se;
				}
				else{
					r+=(char)temp;
				}
			}
			fw.write(r+"\n");
			r = "";
			s = br.readLine();
		}
		fw.close();
		br.close();
		fr.close();
	}
}
