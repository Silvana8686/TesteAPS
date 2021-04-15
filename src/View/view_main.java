
package View;

import Model.BebidaGelada;
import Model.Produto;
import Model.Lanche;
import Model.Cigarro;


public class view_main {

    public static void main(String[] args) {
        
   
   BebidaGelada pr = new BebidaGelada(1,"Refrigerante", 18, 8.50, 3,"Litros");
   pr.Dados();
   
   
   Lanche prp = new Lanche (2, "HotDog", 30, 9.50,"0", "Tipo: Salgado");
   prp.Dados();
   
   
   Cigarro prc = new Cigarro (3, "Cigarro", 15, 12.30, "Marca FREE");
   prc.Dados();
  
    }
}