package estrutura_dados.exercicio_array_list;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            vetorA[i] = leia.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            vetorB[5 - 1 - i] = vetorA[i];
        }
        System.out.print("Os números do vetorA são: ");
        for (int num : vetorA) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        System.out.print("Os números do vetorB : ");
        for (int num : vetorB) {
            System.out.print(num + " ");
        }
    }
}