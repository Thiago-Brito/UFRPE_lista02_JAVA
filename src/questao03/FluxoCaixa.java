package questao03;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class FluxoCaixa {
    private String nomeEmpresa;
    private String cnpj;
    
    public FluxoCaixa(String nomeEmpresa,String cnpj) {
    	this.nomeEmpresa = nomeEmpresa;
    	this.cnpj = cnpj;
    }
    
    ArrayList<Transacao> transacoes = new ArrayList<>();
    
    public void adicionarTransacao(Transacao transacao) {
    	transacoes.add(transacao);
    }
    public double calcularDespesas(LocalDate inicio,LocalDate fim) {
    	double despesas = 0;
    	long dia = inicio.until(fim,ChronoUnit.DAYS);
    	for(Transacao d: this.transacoes) {
    		
    		if(d instanceof Despesa) {
    			for(int i = 0;i<=dia;i++) {
    				if(d.getData().equals(inicio.plusDays(i))){
    					despesas = despesas +d.calcularTotal();
    				}
    			}
    		}
    	}
    	return despesas;
    }
    
    public double calcularReceitas(LocalDate inicio,LocalDate fim) {
    	double despesas = 0;
    	long dia = inicio.until(fim,ChronoUnit.DAYS);
    	for(Transacao d: this.transacoes) {
    		
    		if(d instanceof Receita) {
    			for(int i = 0;i<=dia;i++) {
    				if(d.getData().equals(inicio.plusDays(i))){
    					despesas = despesas +d.calcularTotal();
    				}
    			}
    		}
    	}
    	return despesas;
    }
    
    public double percentualReceitasNoMes(int mes,int ano) {
    	double anoR = 0;
    	double mesR = 0;
            for(Transacao d: this.transacoes) {
    		
    		if(d instanceof Receita) {
    			if(d.getData().getYear() == ano) {
    				anoR++;
    				if(d.getData().getMonthValue() == mes) {
    					mesR++;
    				}
    			}
    		}
    	}
        return mesR*100/anoR;
    }
    
    public double percentualDespesasNoMes(int mes,int ano) {
    	double anoR = 0;
    	double mesR = 0;
            for(Transacao d: this.transacoes) {
    		
    		if(d instanceof Despesa) {
    			if(d.getData().getYear() == ano) {
    				anoR++;
    				if(d.getData().getMonthValue() == mes) {
    					mesR++;
    				}
    			}
    		}
    	}
        return mesR*100/anoR;
    }
    
    public double saldoatual() {
    	double resultado = 0;
    	for(Transacao d: this.transacoes) {
    		resultado = resultado + d.calcularTotal();
    	}
    	return resultado;
    }
    
    public List<Transacao> listarTransacoesNoMes(int mes,int ano){
    	ArrayList<Transacao> mesTransacao = new ArrayList<Transacao>();
    	for(Transacao d: this.transacoes) {
    		if(d.getData().getYear() == ano && d.getData().getMonthValue() == mes) {
    			mesTransacao.add(d);
    		}
    	}
    	return mesTransacao;
    }
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
   
}
