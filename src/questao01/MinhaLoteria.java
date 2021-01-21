package questao01;

import java.util.ArrayList;

public class MinhaLoteria {
	public static void main(String[] args) {
		BilheteLoteria bilhetePremiado = new BilheteLoteria(6);
		
		   
	    int x = 6;
		  
		System.out.println("O bilhete que voce escolheu \n"+bilhetePremiado.toString());
		
		int qtdDeSorteios = 0;
		int qtdDeQuina = 0;
		int qtdDeQuadra = 0;
		
		while(x>=6 && x<=15) {
			BilheteLoteria sorteado = new BilheteLoteria(x);
			ArrayList<BilheteLoteria> bilhetes =  new ArrayList<>();
			bilhetes.add(sorteado);
			
			
			
			if(bilhetePremiado.qtdNumerosContidos(bilhetes.get(0).getBilhete()) >= 6) {
				System.out.println("\n\njogo de "+x+" Numeros: Voce apostou "+qtdDeSorteios+" para ganhar na mega-sena. Dentre esses jogos, voce acertou  "+qtdDeQuadra+" quadras e "+qtdDeQuina+" quinas.");
				System.out.println(bilhetes.get(0).toString());
			    
				qtdDeQuina = 0;
				qtdDeQuadra = 0;
				qtdDeSorteios = 0;
				x++;
				
			}
			if(bilhetePremiado.qtdNumerosContidos(bilhetes.get(0).getBilhete()) == 5) {
				qtdDeQuina++;
			}
			if(bilhetePremiado.qtdNumerosContidos(bilhetes.get(0).getBilhete()) == 4) {
				qtdDeQuadra++;
			}
			 qtdDeSorteios++;
		}
		
	}
}
