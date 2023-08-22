package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        ArrayList<Integer> vetorA=new ArrayList<Integer>();
        ArrayList<Integer> vetorT=new ArrayList<Integer>();
        Scanner leia = new Scanner(System.in);
        int num;

        for (int i=0; i<5; i++){
            System.out.print("Informe um numero: ");
            num = leia.nextInt();
            vetorA.add(num);
            vetorT.add(3*num);
        }
        System.out.println(vetorA);
        System.out.println(vetorT);
    }
}
