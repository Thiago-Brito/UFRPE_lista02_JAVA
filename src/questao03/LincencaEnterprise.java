package questao03;

import java.time.LocalDate;

public class LincencaEnterprise extends Receita {
private int totalContas;
	
	public LincencaEnterprise(LocalDate data,String descricao,int totalContas) {
   	 super(data,descricao);
   	 this.totalContas = totalContas;
    }
	
	@Override
	public double calcularTotal() {
		double despesa = 150 * this.totalContas;
		return despesa;
	}
	
	public String toString() {
     	return super.toString() + String.format("a data foi %s e possui %d de contas", this.getData(),this.getTotalContas());
     }

	public int getTotalContas() {
		return totalContas;
	}

	public void setTotalContas(int totalContas) {
		this.totalContas = totalContas;
	}
	
}
