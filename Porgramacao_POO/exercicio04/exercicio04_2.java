package Porgramacao_POO.exercicio04;
import javax.swing.*;
public class exercicio04_2 {
    public static void main(String[] args) {
        Integer dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia que deseja verificar de 1 até 7"));
        if (dia==1){
            JOptionPane.showMessageDialog(null,"Segunda-feira", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==2) {
            JOptionPane.showMessageDialog(null,"Terça-feira", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==3) {
            JOptionPane.showMessageDialog(null,"Quarta-feira", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==4) {
            JOptionPane.showMessageDialog(null,"Quinta-feira", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==5) {
            JOptionPane.showMessageDialog(null,"Sexta-feira", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==6) {
            JOptionPane.showMessageDialog(null,"Sabado", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else if (dia==7) {
            JOptionPane.showMessageDialog(null,"Domingo", "Dia da semana",JOptionPane.INFORMATION_MESSAGE);
        } else{
            JOptionPane.showMessageDialog(null,"Dia invalido, você deve digitar entre 1 e 7", "ERRO",JOptionPane.ERROR_MESSAGE);
        }

    }
}
