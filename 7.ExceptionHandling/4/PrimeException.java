class PrimeException extends RuntimeException{
	int n;
	public PrimeException(int n){
		this.n = n; 
	}
	public String toString(){
		return "PrimeException : "+this.n+" is not a prime number .";
	}
}
