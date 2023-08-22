package estrutura_dados.exercicio_array_list;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        ArrayList<Integer> vetorX = new ArrayList<Integer>();
        Scanner leia = new Scanner(System.in);
        int num;
        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o numero: ");
            num = leia.nextInt();
            vetorX.add(num);
        }
        int menornumero = vetorX.get(0);
        for (int i = 0; i < 10; i++) {
            if (vetorX.get(i) < menornumero) {
                menornumero = vetorX.get(i);
            }
        }
        int maiornumero = vetorX.get(0);
        for (int i = 0; i < 5; i++) {
            if (vetorX.get(i) > maiornumero) {
                maiornumero = vetorX.get(i);
            }
        }
        int posicaomaior = vetorX.indexOf(maiornumero);
        int posicaomenor = vetorX.indexOf(menornumero);
        System.out.println("menor numero digitado: "+ menornumero);
        System.out.println("maior numero digitado: " +maiornumero);
        System.out.println("Diferença do maior pelo menor: " +(maiornumero-menornumero));
        System.out.println("A posição do menor numero esta na: " + (posicaomenor+1) + " e o maior na " + (posicaomaior+1));
    }
}