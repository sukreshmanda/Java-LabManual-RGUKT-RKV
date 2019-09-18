public class AgeException extends RuntimeException{
	int age;
	public AgeException(int a){age = a;}
	public String toString(){
		return "AgeException Age("+age+") is not Greater than or Equals to 18";
	}
}
