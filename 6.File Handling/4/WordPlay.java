/*
	Author : M.Sukresh
	Class  : WordPlay
	Description : Having methods to change characters in string and identifying vowels and emphasise accordingly.
*/
public class WordPlay{
	//checks whether given is a vowel or not.
	public static boolean isVowel(char r){
		switch(r){
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				return true;
			default:
				return false;
		}
	}
	//replace all vowels with the given character
	public static String replaceVowel(String str, char c){
		String r = "";
		for(int i=0;i<str.length();i++){
			if(isVowel(str.charAt(i))){
				r+=c;
			}else{
				r+=str.charAt(i);
			}
		}
		return r;
	}
	//emphasize string if given character occurs in string change it to * if at even position and + if odd position.
	public String emphasize(String str, char c){
		String r="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == c){
				if(i%2==0){
					r+='*';
				}else{
					r+='+';
				}
			}else{
				r+=str.charAt(i);
			}
		}
		return r;
	}
	public static void main(String args[]){
		WordPlay p = new WordPlay();
		System.out.println(" {IsVowel method } > a "+p.isVowel('a'));
		System.out.println(" {Emphasize method } > sukresh is a hero : "+p.emphasize("sukresh is a hero",'s'));
		System.out.println(" {ReplaceVowel method } > sukresh is a hero : "+p.replaceVowel("sukresh is a hero",'s'));
	}
}
