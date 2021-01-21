package questao02;

import java.time.LocalDate;

public class Gerente extends Funcionario {
   private String area;
   
   public Gerente(String nome,LocalDate dataNascimento,double salario,String area) {
	   super(nome,dataNascimento,salario);
	   this.area = area;
   }
   
   @Override
   public String toString() {
	   return super.toString() + String.format("A area eh %s", this.getArea());
   }

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((area == null) ? 0 : area.hashCode());
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
	Gerente other = (Gerente) obj;
	if (area == null) {
		if (other.area != null)
			return false;
	} else if (!area.equals(other.area))
		return false;
	return true;
}

public String getArea() {
	return area;
}

public void setArea(String area) {
	this.area = area;
}
}
