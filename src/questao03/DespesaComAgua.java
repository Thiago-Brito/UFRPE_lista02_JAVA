package questao03;

import java.time.LocalDate;


public class DespesaComAgua extends Despesa {
    private double totalM3;
    public DespesaComAgua(LocalDate data,String descricao, double totalM3) {
    	super(data,descricao);
    	this.totalM3 = totalM3;
    }
    
    public double getTotalM3() {
		return totalM3;
	}

	public void setTotalM3(double totalM3) {
		this.totalM3 = totalM3;
	}

	@Override
    public double calcularTotal() {
    	double total = 0;
    	double despesa = 0;
    	despesa = despesa +45;
    	total = this.totalM3 - 10;
    	
    	if(total >= 0 && total <= 10) {
    		despesa= despesa + total*5; 
    	}else if(total >10){
    		despesa =95;
    		total = total-10;
    		despesa = despesa + total*6;
    	}
    	return despesa;
    }
    public String toString() {
    	return super.toString() + String.format("a data foi %s e foi usado %f de m3", this.getData(),this.getTotalM3());
    }
    
}
