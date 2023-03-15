package model;

public class CustoVenda {

	private Double custo, venda, dif, luc;

	public CustoVenda() {
	}

	public CustoVenda(Double custo, Double venda, Double dif, Double luc) {
		this.custo = custo;
		this.venda = venda;
		this.dif = dif;
		this.luc = luc;
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		this.custo = custo;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}

	public Double getDif() {
		return dif;
	}

	public void setDif(Double dif) {
		this.dif = dif;
	}

	public Double getLuc() {
		return luc;
	}

	public void setLuc(Double luc) {
		this.luc = luc;
	}
	
}