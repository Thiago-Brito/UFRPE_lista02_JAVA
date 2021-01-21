package questao03;

import java.time.LocalDate;


public class Main {
	public static void main(String[] args) {
		FluxoCaixa caixa = new FluxoCaixa("ufrpe","1234");
		Transacao d1 = new DespesaComAgua(LocalDate.parse("2001-12-01"),"agua",23);
		Transacao d2 = new DespesaComEnergia(LocalDate.parse("2001-10-01"),"agua",207);
		Transacao d3 = new DespesaComInternet(LocalDate.parse("2001-10-01"),"agua",500);
		
		caixa.adicionarTransacao(d1);
		caixa.adicionarTransacao(d2);
		caixa.adicionarTransacao(d3);
		
		Transacao r1 = new LincencaBasica(LocalDate.parse("2001-10-01"),"descriacao",2);
		Transacao r2 = new LincencaPlus(LocalDate.parse("2001-12-01"),"descriacao",4);
		Transacao r3 = new LincencaEnterprise(LocalDate.parse("2011-12-01"),"descriacao",6);
		
		caixa.adicionarTransacao(r1);
		caixa.adicionarTransacao(r2);
		caixa.adicionarTransacao(r3);
		System.out.println("Nome da empresa eh "+caixa.getNomeEmpresa()+" e o cnpj eh "+caixa.getCnpj());
		
		System.out.println("\nfuncao para calcular as despesas em um certo intervalo");
		System.out.println(caixa.calcularDespesas(LocalDate.parse("2000-12-01"), LocalDate.parse("2010-12-01")));
		
		System.out.println("\n\nfuncao para calcular as receitas em um certo intervalo");
		System.out.println(caixa.calcularReceitas(LocalDate.parse("2000-12-01"), LocalDate.parse("2010-12-01")));
		
		System.out.println("\n\nfuncao para o percentual de receitas daquele ano que foi feita em tal mes");
		System.out.println(caixa.percentualReceitasNoMes(10, 2001)+"%");
		
		System.out.println("\n\nfuncao para o percentual de despesas daquele ano que foi feita em tal mes");
		System.out.println(caixa.percentualDespesasNoMes(10, 2001)+"%");
		
		System.out.println("\n\nfuncao que soma todos os gatos sem limete de tempo ");
		System.out.println(caixa.saldoatual());
		
		System.out.println("\n\nTransacoes feitas no mes 10 de 2001");
		
		
		for(int i = 0;i<caixa.listarTransacoesNoMes(10, 2001).size();i++) {
			System.out.println(caixa.listarTransacoesNoMes(10, 2001).get(i));
		}
		
		
	}
}
 