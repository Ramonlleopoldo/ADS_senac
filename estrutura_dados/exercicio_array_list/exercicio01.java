package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<Integer>();

        int num;
        int soma=0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            num = leia.nextInt();
            vetorA.add(num);
            soma += vetorA.get(i);
        }
        int maiornumero = vetorA.get(0);
        for (int i = 0; i < 5; i++) {
            if (vetorA.get(i) > maiornumero) {
                maiornumero = vetorA.get(i);
            }
        }
        int menornumero = vetorA.get(0);
        for (int i = 0; i < 5; i++) {
            if (vetorA.get(i) < menornumero) {
                menornumero = vetorA.get(i);

            }
        }
        System.out.println("Todos os numeros digitados: "+ vetorA);
        System.out.println("Maior numero digitado: "+ maiornumero);
        System.out.println("Menor numero digitado: "+ menornumero);
        System.out.println("A média dos numeros digitados: "+soma / vetorA.size());
    }
}
