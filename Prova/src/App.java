import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Sofas S1 = new Sofas(4, "cinza", 1699.00, 4);
        Sofas S2 = new Sofas(4, "bege", 1449.00, 5);
        Sofas S3 = new Sofas(2, "marrom", 1199.0, 4);
        Sofas S4 = new Sofas(3, "preto", 542.79, 3);

        System.out.println(Sofas.mostrarSofas(S4));

        Sofas.comprarSofa();
    } 
}
