package Porgramacao_POO.exercicio04;
import javax.swing.*;

public class exercicio04_1 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobrenome = JOptionPane.showInputDialog("Digite o sobre nome");
        JOptionPane.showMessageDialog(null, "Nome completo: "+ (nome +" "+ sobrenome),"Confirme seu nome",JOptionPane.INFORMATION_MESSAGE );

    }
}
