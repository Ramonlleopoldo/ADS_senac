package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import  java.util.Scanner;
public class exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<Integer>();
        int num;
        for (int i=0;i<5;i++){
            System.out.print("Digite o "+(i+1)+"ª numero: ");
            num= leia.nextInt();
            vetorA.add(num);
        }
        for (int i=0;i<5;i++){
            int indice;
            int local;
            if (vetorA.get(i) < 0)  {
                indice = vetorA.get(i);
                local= (i+1);
                System.out.println("negativo encontrado " + indice + " na posição " + local);
            }

        }
    }
}
