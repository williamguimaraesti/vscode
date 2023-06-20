import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = showInputDialog(null, "Informe seu nome: ");
        JOptionPane.showMessageDialog(null, "Seja bem vindo" + nome + "!");
    }    
}
