/*
	Author      : M.Sukresh
	Class       : PrintASCIIFromBufferedReader
	Description : Find all the ASCII values of given input.
	Language    : Java
	Question    : Write a java program to find all the ASCII values of given input.
*/
import java.io.*;
import java.util.*;
public class PrintASCIIFromBufferedReader{
	public static void printASCII(String n){
		for(int i=0;i<n.length();i++){
			System.out.println(n.charAt(i)+" : "+(int)n.charAt(i));
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		printASCII(n);
	}
}
