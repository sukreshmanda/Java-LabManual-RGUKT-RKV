/*
	Author : M.Sukresh
	Class  : MainClass
	Description : Read data from file and display no of alphabets,numbers,spaces,special characters, lines and words.
*/
import java.io.*;
import java.util.*;
class MainClass{
	public static void main(String args[])throws IOException{
		long total_word=0;
		long total_char=0;
		long total_lines=0;
		long toal_digits=0;
		long total_spaces=0;
		long total_specialchar=0;
		FileReader fr = new FileReader("input.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		while(s!=null){
			for(int i=0;i<s.length();i++){
				int temp = (int)s.charAt(i);
				if(temp>=48 && temp<=57){
					toal_digits++;
				}else if((temp>=65 && temp<=90)||(temp>=97 && temp<=122)){
					total_char++;
				}else if(temp == 32){
					total_spaces++;
				}else if((temp>=33 && temp<=47)||(temp>=58 && temp<=64)||(temp>=91 && temp<96)||(temp<=123 && temp>=126)){
					total_specialchar++;
				}
			}
			StringTokenizer st = new StringTokenizer(s);
			total_word+=st.countTokens();
			total_lines++;
			s = br.readLine();
		}
		br.close();
		fr.close();
		System.out.println("Total Words : "+total_word+"\nTotal Alphabets : "+total_char+"\nTotal Lines : "+total_lines+"\nTotal Numbers : "+toal_digits+" \nTotal Spaces : "+total_spaces+"\nTotal Special Characters : "+total_specialchar);
	}
}
