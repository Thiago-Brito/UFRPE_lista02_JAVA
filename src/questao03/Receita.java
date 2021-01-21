package questao03;

import java.time.LocalDate;


public abstract class Receita implements Transacao {
	private LocalDate data;
    private String descricao;
    
    public Receita(LocalDate data,String descricao) {
  	  this.data = data;
  	  this.descricao = descricao;
    }

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
  	  return  "RECEITA";
    }
    
    public double calcularTotal() {
  	  return this.calcularTotal();
    }
    public String toString() {
    	return String.format("tipo :%s ", this.getTipo());
    }
}
