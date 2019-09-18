/*
	Author : M.Sukresh
	Class  : FileFirst
	Description : Read data from file write all words into another file with new line.
*/
import java.io.*;
import java.util.*;
class FileFirst{
	public static void main(String args[])throws IOException{

		FileReader fp = new FileReader("rgukt.txt");
		BufferedReader br = new BufferedReader(fp);
		String line = "";
		String[] array = new String[200];
		int len = 0;


		while((line=br.readLine())!=null){
			StringTokenizer st = new StringTokenizer(line);
			while(st.hasMoreTokens()){
				array[len++] = st.nextToken();
			}	
			
		}
		br.close();
		fp.close();
		for(int i=0;i<len;i++){
			for(int j=0;j<(len-1);j++){
				if(array[j].compareTo(array[j+1]) > 0){
					String temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		/*for(int i=0;i<len;i++){
			System.out.println(array[i]);
		}*/
		FileWriter fw = new FileWriter("out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i=0;i<len;i++){
			bw.write(array[i]+"\n");
		}
		bw.close();
		fw.close();
	}
}
