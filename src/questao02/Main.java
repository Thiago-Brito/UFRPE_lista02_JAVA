package questao02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    	RepositorioPessoas pessoas = new RepositorioPessoas();
    	
    	Cliente c1 = new Cliente("thiago",LocalDate.parse("2001-12-01"),1234);
    	Cliente c2 = new Cliente("bruno",LocalDate.parse("2000-01-01"),1254);
    	Cliente c3 = new Cliente("leornado",LocalDate.parse("2004-01-01"),1434);
    	Cliente c4 = new Cliente("alana",LocalDate.parse("2005-10-10"),1334);
    	Cliente c5 = new Cliente("gabriela",LocalDate.parse("2000-10-11"),0234);
    	
    	Cliente c6 = new Cliente("thiago",LocalDate.parse("2001-12-01"),1234);
    	
    	
    	pessoas.cadastrarPessoa(c1);
    	pessoas.cadastrarPessoa(c2);
    	pessoas.cadastrarPessoa(c3);
    	pessoas.cadastrarPessoa(c4);
    	pessoas.cadastrarPessoa(c5);
    	pessoas.cadastrarPessoa(c6);
    	
    	Funcionario f1 = new Funcionario("joão",LocalDate.parse("2001-12-01"),1500);
    	Funcionario f2 = new Funcionario("cleber",LocalDate.parse("2001-12-01"),900);
    	Funcionario f3 = new Funcionario("italo",LocalDate.parse("2001-12-01"),3000);
    	Funcionario f4 = new Funcionario("adão",LocalDate.parse("2001-12-01"),4000);
    	Funcionario f5 = new Funcionario("ronaldo",LocalDate.parse("2001-12-01"),5000);
    	
    	Funcionario f6 = new Funcionario("ronaldo",LocalDate.parse("2001-12-01"),5000);
    	
    	
    	pessoas.cadastrarPessoa(f1);
    	pessoas.cadastrarPessoa(f2);
    	pessoas.cadastrarPessoa(f3);
    	pessoas.cadastrarPessoa(f4);
    	pessoas.cadastrarPessoa(f5);
    	pessoas.cadastrarPessoa(f6);
    	
    	Gerente g1 = new Gerente("amanda",LocalDate.parse("2001-12-01"),10000,"RH");
    	Gerente g2 = new Gerente("joana",LocalDate.parse("2001-12-01"),20000,"Vendas");
    	Gerente g3 = new Gerente("frida",LocalDate.parse("2001-12-01"),50000,"Vendas");
    	Gerente g4 = new Gerente("nilce",LocalDate.parse("2001-12-01"),40000,"Vendas");
    	Gerente g5 = new Gerente("clarice",LocalDate.parse("2001-12-01"),5000,"RH");
    	
    	Gerente g6 = new Gerente("amanda",LocalDate.parse("2001-12-01"),10000,"RH");
    	
    	
    	pessoas.cadastrarPessoa(g1);
    	pessoas.cadastrarPessoa(g2);
    	pessoas.cadastrarPessoa(g3);
    	pessoas.cadastrarPessoa(g4);
    	pessoas.cadastrarPessoa(g5);
    	pessoas.cadastrarPessoa(g6);
    	
       
    	System.out.println("Pessoas maiores de idade");
    	
    	for(Pessoa pessoa : pessoas.listarPessoasMaioresIdade()) {
    		System.out.println("\n"+pessoa.toString());
    	}
    	System.out.println("\n\nClientes maiores de idade");
    	for(Pessoa pessoa : pessoas.listarClientesMaioresIdade()) {
    		System.out.println("\n"+pessoa.toString());
    	}
    	System.out.println("\n\nFuncinarios com salario maior que 5000");
    	for(Pessoa pessoa : pessoas.listarFuncionariosComSalarioMaiorQue(5000)) {
    		System.out.println("\n"+pessoa.toString());
    	}
    	System.out.println("\n\nGerentes da area de Vendas");
    	for(Pessoa pessoa : pessoas.listarGerentesDaArea("Vendas")) {
    		System.out.println("\n"+pessoa.toString());
    	}
    	
    	
    	
    	
	}
}
