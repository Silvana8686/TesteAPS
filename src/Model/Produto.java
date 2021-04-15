
package Model;

import javax.swing.JOptionPane;

public class Produto {

    
    public int id;
    public String nome;
    protected int quantidade;
    double precoUnitario;
    
    
    public Produto(){
        
    }
    
    public Produto(int id, String nome, int quantidade, double precoUnitario){
        this.id = id;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        
    }

    
    
    public void Dados() {
        
        String texto = "Id: " + this.id + "\n"+ "Nome:"+this.nome+"\n"+"Quantidade"+this.quantidade+"\n"+"Preço"+this.precoUnitario;
                
       JOptionPane.showMessageDialog(null, texto);
                
                      
     }

   
    
}
