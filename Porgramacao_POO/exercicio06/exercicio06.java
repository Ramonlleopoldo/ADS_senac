package Porgramacao_POO.exercicio06;
import com.sun.jdi.Value;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class exercicio06 {
    public static void main(String[] args) {
        List<Integer> Lista = new ArrayList<>();
        int menor = 999999999;
        int maior=0;
        int media;
        int soma=0;
        for (int i=0; i<10 ; i++){
            Integer valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do " + (i + 1) + "º número", "Valores", JOptionPane.QUESTION_MESSAGE));

            Lista.add(valor);
            soma+=valor;
            if (valor>maior){
                maior=valor;
            }
            if (valor<menor){
            menor=valor;
            }
        }
        media = soma/Lista.size();

        JOptionPane.showMessageDialog(null, "Menor valor: "+ menor + "\n Maior valor: "+ maior + "\n Media dos valores: " + media, "Resultados", JOptionPane.QUESTION_MESSAGE);
    }
}
