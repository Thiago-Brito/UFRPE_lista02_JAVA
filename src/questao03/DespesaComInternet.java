package questao03;

import java.time.LocalDate;


public class DespesaComInternet extends Despesa{
        private double dadosTrafegados;
        
        public DespesaComInternet(LocalDate data,String descricao, double dadosTrafegados) {
        	super(data,descricao);
        	this.dadosTrafegados = dadosTrafegados;
        }
        @Override
        public double calcularTotal() {
        	double despesa = 0;
        	if(this.dadosTrafegados >= 20 && this.dadosTrafegados <100) {
        		despesa = 90.9;
        		while(this.dadosTrafegados >20) {
        			despesa = despesa + 3.9;
        			this.dadosTrafegados--;
        		}
        	}else if(this.dadosTrafegados >=100 && this.dadosTrafegados <500){
        		despesa = 240.9;
        		while(this.dadosTrafegados >100) {
        			despesa = despesa + 4.4;
        			this.dadosTrafegados--;
        		}
        	}else {
        		despesa = 590.9;
        		while(this.dadosTrafegados >500) {
        			despesa = despesa +5.1;
        			this.dadosTrafegados--;
        		}
        	}
        	return despesa;
        }
        
        public String toString() {
        	return super.toString() + String.format("a data foi %s e foi usado %f de dados", this.getData(),this.dadosTrafegados);
        }
       
}
