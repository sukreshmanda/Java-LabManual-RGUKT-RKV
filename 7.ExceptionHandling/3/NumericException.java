class NumericException extends RuntimeException{
	String n;
	NumericException(String n){
		this.n = n;
	}
	public String toString(){
		return "NumericException: Name "+n+" is having numbers ";
	}
}
