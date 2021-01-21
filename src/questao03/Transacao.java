package questao03;

import java.time.LocalDate;


public interface Transacao {
     LocalDate getData();
     
     String getTipo();
     
     String getDescricao();
     
     double calcularTotal();
}
