
package Model;

import javax.swing.JOptionPane;

public class Lanche extends Produto {
    
  public String Qdoce;
  public String Qsalgado;
          
          
    public Lanche() {
        super();
    
    }
    
    public Lanche(int id, String nome, int quantidade, double precoUnitario, String Qdoce, String Qsalgado) {
        super(id, nome, quantidade, precoUnitario);
       this.Qdoce=Qdoce;
       this.Qsalgado=Qsalgado;
    }
    @Override
    public void Dados() {
        //super.cadastrar(); 
        String texto = "Id: " + this.id + "\n"+ "Nome:"+"\n"+this.nome+"\n"+"Quantidade"+"\n"+this.quantidade+"\n"+"Preço"+"\n"+precoUnitario+"\n"+Qdoce+"\n"+Qsalgado;
                
       JOptionPane.showMessageDialog(null, texto);
                
                      
     }
}
