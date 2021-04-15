
package Model;

import javax.swing.JOptionPane;

public class Cigarro extends Produto {
    
 public String marca;
    
    public Cigarro() {
        super();
    
    }
    
    public Cigarro(int id, String nome, int quantidade, double precoUnitario, String marca) {
        super(id, nome, quantidade, precoUnitario);
        this.marca=marca;
        }
    
    @Override
     public void Dados() {
        //super.cadastrar(); 
        String texto = "Id: " + this.id + "\n"+ "Nome:"+this.nome+"\n"+"Quantidade"+this.quantidade+"\n"+"Preço"+precoUnitario+"\n"+marca;
                
       JOptionPane.showMessageDialog(null, texto);
                
                      
     }
      
}
