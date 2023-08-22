package estrutura_dados.pilhas;
import java.util.Stack;
import java.util.Scanner;
public class exercicio01 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack();
        Stack<Integer> p2 = new Stack<>();
        Stack<Integer> transferencia1 = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int num;
        for (int i=0; i<5; i++){
            System.out.print("Digite o " + (i+1) +"ª numero: ");
            num = leia.nextInt();
            p1.push(num);
        }
        System.out.println( "p1 antes da transferencia " + p1);

        while(!p1.isEmpty()){
            transferencia1.push(p1.pop());
        }

        System.out.println();
        System.out.println("Essa é a pilha de transferencia " + transferencia1);

        while (!transferencia1.isEmpty()){
            int elemento = transferencia1.pop();
            p1.push(elemento);
            p2.push(elemento);
        }

        System.out.println(transferencia1.size());
        System.out.println("PILHA P1 " + p1);
        System.out.println("PILHA P2 " + p2);
    }
}