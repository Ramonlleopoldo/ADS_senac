package Porgramacao_POO.exercicio05;
import javax.swing.*;
public class exercicio05_01 {
    public static void main(String[] args) {

        Integer num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro numero"));
        Integer num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro numero"));

        try {
            int soma = num1+num2;
            int sub = num1-num2;
            int div = num1/num2;
            int mult= num1*num2;
            System.out.println("soma " + soma);
            System.out.println("sub " + sub);
            System.out.println("div " + div);
            System.out.println("mult " + mult);
        }catch (ArithmeticException e){
            System.out.println("Impossivel fazer esse calculo");
        }
    }
}
