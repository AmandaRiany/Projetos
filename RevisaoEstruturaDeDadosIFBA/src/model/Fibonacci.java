package model;

public class Fibonacci {
	
	private int zero, num;
	
	public Fibonacci() {
	}
	
	public Fibonacci(int zero, int num) {
		this.zero = zero;
		this.num = num;
		
	}
	
	public int getZero() {
		return zero;
	}
	public void setZero(int zero) {
		this.zero = zero;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}