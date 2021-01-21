package questao03;

import java.time.LocalDate;


public class DespesaComEnergia extends Despesa {
	
	private double kWh;
	
	 public DespesaComEnergia(LocalDate data,String descricao, double kWh) {
     	super(data,descricao);
     	this.kWh = kWh;
     }
	 
	 public double getkWh() {
		return kWh;
	}

	public void setkWh(double kWh) {
		this.kWh = kWh;
	}

	@Override
	 public double calcularTotal() {
		 double despesa;
		 if(this.kWh >= 0 && this.kWh <=50) {
			 despesa = 2 + this.kWh *0.5;
		 }else if (this.kWh <=200) {
			 despesa = 15 + this.kWh*0.5+(int)this.kWh/100 *1.2;  
		 }else {
			 despesa = 35 + this.kWh*0.5+(int)this.kWh/100 *1.2; 
		 }
		 return despesa;
	 }
	 
	 public String toString() {
	    	return super.toString() + String.format("a data foi %s e foi usado %f de kwh", this.getData(),this.getkWh());
	    }
	

}
