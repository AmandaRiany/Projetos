package model;

public class Calculo {
	
	private Double var1, var2;
	private int oper;

	public Calculo() {
	}

	public Calculo(Double var1, Double var2, int oper) {
		this.var1 = var1;
		this.var2 = var2;
		this.oper = oper;
	}

	public Double getVar1() {
		return var1;
	}

	public void setVar1(Double var1) {
		this.var1 = var1;
	}

	public Double getVar2() {
		return var2;
	}

	public void setVar2(Double var2) {
		this.var2 = var2;
	}

	public int getOper() {
		return oper;
	}

	public void setOper(int oper) {
		this.oper = oper;
	}

}