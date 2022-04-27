import javax.swing.JOptionPane;

public class Sofas {
   private int numeroLugares;
   private String cor;
   private double preco;
   private int estrelas;

    public Sofas(int numeroLugares, String cor, double preco, int estrelas) {
    this.numeroLugares = numeroLugares;
    this.cor = cor;
    this.preco = preco;
    this.estrelas = estrelas;
    }
    
    public String mostrarSofas(Sofas nomeSofa) {
        return mostrarSofas(nomeSofa);
    }

    public void comprarSofa() {
        String qualSofa = JOptionPane.showInputDialog(null, "Qual seu filme preferido?", "Sofas", JOptionPane.QUESTION_MESSAGE);
        if(qualSofa != "S1" || qualSofa != "S2" || qualSofa != "S3" || qualSofa != "S4") {
            JOptionPane.showMessageDialog(null, "Compra feita com sucesso", "sucesso", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "Sofa não encontrado", "erro", JOptionPane.DEFAULT_OPTION);
        };
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }
    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstrelas() {
        return estrelas;
    }
    public void setEstrelas(int estrelas) {
        this.estrelas = estrelas;
    }
}
