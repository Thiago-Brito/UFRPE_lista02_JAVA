package questao02;

import java.time.LocalDate;

public class Funcionario extends Pessoa {
     private double salario;
     private static final double SALARIO_TETO_IMPOSTO = 100;
     
     public Funcionario(String nome,LocalDate dataNascimento,double salario) {
    	 super(nome,dataNascimento);
    	 this.salario = salario;
     }
     
     public double calcularImpostoDevido() {
    	 if(this.salario <= SALARIO_TETO_IMPOSTO) {
    		 return this.salario * 0.05;
    	 }else {
    		 return this.salario * 0.075;
    	 }
     }

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public static double getSalarioTetoImposto() {
		return SALARIO_TETO_IMPOSTO;
	}
	
	@Override
	public String toString() {
		return super.toString() + String.format("o salario dele eh %.2f e o teto do imposto eh %.2f ", this.getSalario(),this.calcularImpostoDevido());
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
}
