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
    
    Sofas S1 = new Sofas(4, "cinza", 1699.00, 4);
    Sofas S2 = new Sofas(4, "bege", 1449.00, 5);
    Sofas S3 = new Sofas(2, "marrom", 1199.0, 4);
    Sofas S4 = new Sofas(3, "preto", 542.79, 3);

    public String mostrarSofas() {
        System.out.format(
            "S1 \nnumero de lugares: %d \ncor: %s \npreço: %d \nnumero de estrelas: %d \n\nS2 \nnumero de lugares: %d \ncor: %s \npreço: %d \nnumero de estrelas: %d \n\nS3 \nnumero de lugares: %d \ncor: %s \npreço: %d \nnumero de estrelas: %d \n\nS4 \nnumero de lugares: %d \ncor: %s \npreço: %d \nnumero de estrelas: %d",
            S1.numeroLugares, S1.cor, S1.preco, S1.estrelas, S2.numeroLugares, S2.cor, S2.preco, S2.estrelas, S3.numeroLugares, S3.cor, S3.preco, S3.estrelas, S4.numeroLugares, S4.cor, S4.preco, S4.estrelas 
        );
        return mostrarSofas();
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
