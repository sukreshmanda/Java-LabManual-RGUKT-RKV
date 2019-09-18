class Voter{
	int age;
	String name;
	public Voter(int a,String s){
		if(a < 18){
			throw new AgeException(a);
		}else{
			this.age = a;
			this.name = s;
		}
	}
	public static void main(String args[]){
		Voter p;
		try{
			p = new Voter(17,"sukresh");
			System.out.println("Name : "+p.name+" Age : "+p.age);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
