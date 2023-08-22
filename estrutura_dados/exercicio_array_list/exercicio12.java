package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;
public class exercicio12 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> vendasList = new ArrayList<Integer>();
        ArrayList<Integer> comissaoList = new ArrayList<Integer>();
        ArrayList<String> nomeList = new ArrayList<String>();

        int numv;
        int numc;
        String nome;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome do: " + (i + 1) + "ª vendedor ");
            nome = leia.nextLine();
            nomeList.add(nome);

            System.out.print("Digite o total de vendas do : " + (i + 1) + "ª vendedor ");
            numv = leia.nextInt();
            vendasList.add(numv);

            System.out.print("Digite a total comissão: " + (i + 1) + "ª vendedor ");
            numc = leia.nextInt();
            comissaoList.add(numc);

            leia.nextLine();
        }
        int maiorvalor= Integer.MIN_VALUE;
        int menorvalor= Integer.MAX_VALUE;
        int somavendas = 0;
        int posicaom=0;
        int posicaomenor=0;
        for (int i = 0; i<10; i++){
            int valorreceber= (vendasList.get(i)*comissaoList.get(i));
            System.out.println("Vendedor " + nomeList.get(i) + "$"  +valorreceber);
            somavendas += (vendasList.get(i));
            if (valorreceber>maiorvalor){
                maiorvalor=valorreceber;
                posicaom = i;
            }
            if (valorreceber<menorvalor){
                menorvalor=valorreceber;
                posicaomenor = i;
            }
        }
        System.out.println("Total de vendas dos vendedores = "+ (somavendas));
        System.out.println("O maior valor a receber é " + nomeList.get(posicaom) + " Total = " + maiorvalor);
        System.out.println("O menor valor a receber é " + nomeList.get(posicaomenor) + " Total = " + menorvalor);

    }
}