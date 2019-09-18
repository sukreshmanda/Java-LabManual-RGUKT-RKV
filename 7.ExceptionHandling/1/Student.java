public class Student{
	private String name;
	private int age;
	private double percentage;
	Student(String name,int age,double percentage){
		if(age < 0 || age >130){
			throw new NewException("AgeException");			
		}else{
			this.age = age;
		}
		if(percentage < 50){
			throw new NewException("PercentageException");
		}
		this.name = name;
	}
	public static void main(String args[]){
			try{	
				Student s = new Student("madhan",0,34);
				System.out.println(s.name+" "+s.age+" "+s.percentage);
			}catch(Exception e){
				System.out.println("\u001B[31;1m"+"Error:"+"\u001B[0m"+"\u001B[33;1m"+" Caught new Exception: "+"\u001B[0m"+e);
			}
	}
}
