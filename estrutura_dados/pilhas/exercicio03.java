package estrutura_dados.pilhas;

import java.util.Stack;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Stack<Integer> P1 = new Stack<>();
        Stack<Integer> P2 = new Stack<>();
        Scanner leia= new Scanner(System.in);

        for (int i=0;i<5; i++){
            System.out.print("Digite o " + (i+1) + "ª numero da primeira pilha: ");
            int num1= leia.nextInt();
            P1.push(num1);
        }
        for (int i=0;i<5; i++){
            System.out.print("Digite o " + (i+1) + "ª numero da segunda pilha:");
            int num1= leia.nextInt();
            P2.push(num1);
        }
        if (P1.size() == P2.size()){
            for (int cont=0; cont<5 ; cont++) {
                if (P1.peek() == P2.peek()) {
                    System.out.println("O numero " + P1.peek() + " São iguais");
                    P1.pop();
                    P2.pop();
                }else System.out.println("O numero " + P1.peek() + P2.peek() + " São diferentes");
            }
        }
    }
}
