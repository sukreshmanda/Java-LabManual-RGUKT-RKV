/*
	Author : M.Sukresh
	Class : DataRead
	Description : Read data from file and sort accordingly.
*/
import java.io.*;
import java.util.*;
class DataRead{
	public static void main(String args[])throws IOException{
		FileReader fr = new FileReader("Data.txt");
		BufferedReader br = new BufferedReader(fr);
		String line="";
		Student[] web = new Student[5];
		int i=0;
		while((line= br.readLine())!=null){
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				String name = st.nextToken();
				String c = st.nextToken();
				double cgpa = Double.parseDouble(c);
				String course = st.nextToken();
				String id = st.nextToken();
				String a = st.nextToken();
				int age = Integer.parseInt(a);
				web[i++] = new Student(name,cgpa,course,id,age);
			}
		}
		br.close();
		fr.close();
		for(int k=0;k<web.length;k++){
			for(int j=0;j<web.length-1;j++){
				if(web[j].getName().compareTo(web[j+1].getName()) > 0){
					Student str = web[j];
					web[j] = web[j+1];
					web[j+1] = str;
				}
			}
		}
		FileWriter fw = new FileWriter("sort.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int k=0;k<web.length;k++){
			bw.write(web[k].name+"\t"+web[k].cgpa+"\t"+web[k].course+"\t"+web[k].id+"\t"+web[k].age+"\n");
		}
		bw.close();
		fw.close();
		for(int k=0;k<web.length;k++){
			web[k].display();
		}
	}
}
