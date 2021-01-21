package questao01;

import java.util.Arrays;
import java.util.Random;

public class BilheteLoteria {
   private int bilhete[];
   
  

Random gerador = new Random();
   
   public BilheteLoteria(int tamanho) {
		geradorDeBilhete(tamanho);
		
	}
   
   
   public void geradorDeBilhete(int tamanho){
	  bilhete = new int[tamanho];
	  for(int i = 0;i<tamanho;i++) {
		  bilhete[i] = gerador.nextInt(59) +1;
		  for(int j =0;j<i;j++) {
			  while(bilhete[i] == bilhete[j]) {
				  bilhete[i] = gerador.nextInt(59) +1;
				  j =0;
			  }
		  }
	  }
	  
	  
	  Arrays.sort(bilhete);
	  
	   
   }

   public String toString() {
	   
	   
	   return Arrays.toString(bilhete);
   }

   public int qtdNumerosContidos(int[] outroBilhete) {
	   int qtd =0;
	   for(int i = 0;i<bilhete.length;i++) {
		   for(int j =0;j< outroBilhete.length ;j++) {
			   if(bilhete[i]==outroBilhete[j]) {
				   qtd++;
			   }
		   }
	   }
	   return qtd;
   }


public int[] getBilhete() {
	return bilhete;
}


public void setBilhete(int[] bilhete) {
	this.bilhete = bilhete;
}
  
   
   
   
}
