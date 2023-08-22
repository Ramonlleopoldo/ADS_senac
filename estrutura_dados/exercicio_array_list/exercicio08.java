package estrutura_dados.exercicio_array_list;

import  java.util.ArrayList;
import java.util.Scanner;


public class exercicio08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        int num;
        for (int i = 0 ; i<=6 ; i++){
            System.out.print("Digite o " + (i+1) + "ª numero ");
            num = leia.nextInt();
            vetorA.add(num);
        }
        System.out.println("Numeros pares ");
        int somapar=0;
        for (int i = 0 ; i<=6 ; i++){
            if (vetorA.get(i) % 2 == 0 ){
                System.out.println(vetorA.get(i));
                somapar += 1;
            }
        }
        System.out.println( " Total de numeros pares " + somapar);
        System.out.println("Numeros impares ");
        int somaimpar=0;
        for (int i = 0 ; i<=6 ; i++){
            if (vetorA.get(i) % 2 != 0 ){
                System.out.println(vetorA.get(i));
                somaimpar += 1;
            }
        }
        System.out.println("Total de numeros impares " + somaimpar);
    }
}