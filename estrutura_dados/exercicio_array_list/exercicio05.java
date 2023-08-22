package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        Scanner leia = new Scanner(System.in);

        vetorA.add(7);
        vetorA.add(21);
        vetorA.add(15);
        vetorA.add(12);
        vetorA.add(82);

        System.out.print("Informe um número para verificar se existe no Vetor: ");
        int num = leia.nextInt();

        boolean encontrado = false;
        int posicao = -1;

        for (int i = 0; i < vetorA.size(); i++) {
            if (vetorA.get(i) == num){
                encontrado = true;
                posicao = i;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O número " + num + " foi encontrado na posição " + posicao);
        } else {
            System.out.println("O elemento não foi encontrado");
        }
    }
}
