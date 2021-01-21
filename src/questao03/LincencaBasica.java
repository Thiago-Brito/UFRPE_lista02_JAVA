package questao03;

import java.time.LocalDate;


public class LincencaBasica extends Receita {
     private int totalContas;
     
     public LincencaBasica(LocalDate data,String descricao,int totalContas) {
    	 super(data,descricao);
    	 this.totalContas = totalContas;
     }
     
     public int getTotalContas() {
		return totalContas;
	}

	public void setTotalContas(int totalContas) {
		this.totalContas = totalContas;
	}

	@Override
     public double calcularTotal() {
    	 double despesa = 20*this.totalContas;
    	 return despesa;
     }
     public String toString() {
     	return super.toString() + String.format("a data foi %s e possui %d de contas", this.getData(),this.getTotalContas());
     }

	
}
