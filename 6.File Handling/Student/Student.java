/*
	Author : M.Sukresh
	Class : Student
	Description : Used to store student data like name,cgpa,id,age.
*/
class Student{
	String name;
	double cgpa;
	String course;
	String id;
	int age;
	Student(String a, double b, String c, String d, int e){
		name = a;
		cgpa = b;
		course = c;
		id = d;
		age = e;
	}
	String getName(){
		return name;
	}
	void display(){
		System.out.println(name+"\t"+cgpa+"\t"+course+"\t"+id+"\t"+age);
	}
}
