package questao03;

import java.time.LocalDate;


public class LincencaPlus extends Receita {
	private int totalContas;
	
	public LincencaPlus(LocalDate data,String descricao,int totalContas) {
   	 super(data,descricao);
   	 this.totalContas = totalContas;
    }
	
	@Override
	public double calcularTotal() {
		double despesa = 35 * this.totalContas;
		return despesa;
	}
	public int getTotalContas() {
		return totalContas;
	}

	public void setTotalContas(int totalContas) {
		this.totalContas = totalContas;
	}

	public String toString() {
     	return super.toString() + String.format("a data foi %s e possui %d de contas", this.getData(),this.getTotalContas());
     }
}
