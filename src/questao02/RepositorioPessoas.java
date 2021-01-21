package questao02;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class RepositorioPessoas {
	
	private ArrayList<Pessoa> pessoas;
     public RepositorioPessoas() {
    	 this.pessoas = new ArrayList<>();
     }
     
     public void cadastrarPessoa(Pessoa p) {
    	 if(p != null) {
    		 boolean pessoaExiste = true;
    		 
    		 for(Pessoa todas : pessoas) {
    			 if(todas.equals(p)) {
    				  pessoaExiste = false;
    			 }
    		 }
    		 if(pessoaExiste) {
    			 this.pessoas.add(p);
    		 }
    	 }
     }
     
     public ArrayList<Pessoa> listarPessoasMaioresIdade(){
    	 ArrayList<Pessoa> resultado = new ArrayList<>();
    	 
    	 for(Pessoa todas: this.pessoas) {
    		 if(todas.getDataNascimento().until(LocalDate.now(),ChronoUnit.YEARS) >= 18) {
    			 resultado.add(todas);
    		 }
    	 }
    	 return resultado;
     }
     
     public ArrayList<Cliente> listarClientesMaioresIdade(){
    	 ArrayList<Cliente> resultado = new ArrayList<>();
    	 
    	 for(Pessoa todas: this.pessoas) {
    		 if(todas.getDataNascimento().until(LocalDate.now(),ChronoUnit.YEARS) >= 18 && todas instanceof Cliente) {
    			 resultado.add((Cliente)todas);
    		 }
    	 }
    	 return resultado;
     }
     
     public ArrayList<Funcionario> listarFuncionariosComSalarioMaiorQue(double salario){
    	 ArrayList<Funcionario> resultado = new ArrayList<>();
    	 for(Pessoa todas: this.pessoas) {
    		 if(todas instanceof Funcionario && ((Funcionario) todas).getSalario() > salario) {
    			 resultado.add((Funcionario)todas);
    		 }
    	 }
    	 return resultado;
    	 
     }
     
     public ArrayList<Gerente> listarGerentesDaArea(String area){
    	 ArrayList<Gerente> resultado = new ArrayList<>();
    	 for(Pessoa todas: this.pessoas) {
    		 if(todas instanceof Gerente && ((Gerente) todas).getArea().equals(area)) {
    			 resultado.add((Gerente)todas);
    		 }
    	 }
    	 return resultado;
    	 
     }

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}
}
