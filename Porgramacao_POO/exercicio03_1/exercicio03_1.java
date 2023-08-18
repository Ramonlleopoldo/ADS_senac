package Porgramacao_POO.exercicio03_1;
import javax.swing.*;

public class exercicio03_1 {
    public static void main(String[] args) {
        Integer inteiro1 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));
        Integer inteiro2 = Integer.parseInt(JOptionPane.
                showInputDialog(null, "Digite um inteiro:", "Entrada", JOptionPane.QUESTION_MESSAGE));

        JOptionPane.showMessageDialog(null, (inteiro1+inteiro2), "Calculadora", JOptionPane.INFORMATION_MESSAGE);
    }
}
