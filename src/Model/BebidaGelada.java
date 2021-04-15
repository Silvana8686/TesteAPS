
package Model;

import javax.swing.JOptionPane;


public class BebidaGelada extends Produto {
    
    public double ml;
    public String qtd;
  
    public BebidaGelada() {
        super();
    
    }
    
     public BebidaGelada(int id, String nome, int quantidade, double precoUnitario, double ml,String qtd){
        super(id, nome,quantidade,precoUnitario);
        this.ml = ml;
        this.qtd =qtd;
    }
     
     @Override
      public void Dados() {
        //super.cadastrar(); 
        String texto = "Id: " + this.id + "\n"+ "Nome:"+"\n"+this.nome+"\n"+"Quantidade"+"\n"+this.quantidade+"\n"+"Preço"+"\n"+precoUnitario+"\n"+ml+"\n"+qtd;
                
       JOptionPane.showMessageDialog(null, texto);
                
          }             
     }
