package estrutura_dados.pilhas;
import java.util.Stack;
import java.util.Scanner;


public class exercicio02 {
    public static void main(String[] args) {
        Stack<Integer>P = new Stack<>();
        Stack<Integer>transferencia1 = new Stack<>();
        Stack<Integer>transferencia2 = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int num;
        for (int i=0 ; i<5; i++){
            System.out.print("Digite o " + (i+1) + " numero: ");
            num = leia.nextInt();
            P.push(num);
        }
        System.out.println("Essa é a P inicial " + P);
        while (!P.isEmpty()){
            transferencia1.push(P.pop());
        }
        while (!transferencia1.isEmpty()){
            transferencia2.push(transferencia1.pop());
        }
        while (!transferencia2.isEmpty()){
            P.push(transferencia2.pop());

        }
    }
}