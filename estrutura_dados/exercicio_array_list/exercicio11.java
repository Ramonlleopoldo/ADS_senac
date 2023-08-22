package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio11{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> codigosProdutos = new ArrayList<>();
        ArrayList<Integer> estoqueProdutos = new ArrayList<>();

        // Definindo códigos de produtos e estoques iniciais
        int[] codigosIniciais = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};
        int[] estoqueInicial = {50, 30, 25, 40, 20, 15, 10, 5, 35, 45};

        for (int i = 0; i < codigosIniciais.length; i++) {
            codigosProdutos.add(codigosIniciais[i]);
            estoqueProdutos.add(estoqueInicial[i]);
        }

        while (true) {
            System.out.print("Digite o código do cliente (ou 0 para sair): ");
            int codigoCliente = scanner.nextInt();
            if (codigoCliente == 0) {
                System.out.println("Fim do programa.");
                break;
            }

            System.out.print("Digite o código do produto desejado: ");
            int codigoProduto = scanner.nextInt();
            System.out.print("Digite a quantidade desejada: ");
            int quantidadeDesejada = scanner.nextInt();

            int index = codigosProdutos.indexOf(codigoProduto);

            if (index != -1) {
                if (estoqueProdutos.get(index) >= quantidadeDesejada) {
                    System.out.println("Pedido atendido. Obrigado e volte sempre.");
                    estoqueProdutos.set(index, estoqueProdutos.get(index) - quantidadeDesejada);
                } else {
                    System.out.println("Não temos estoque suficiente dessa mercadoria.");
                }
            } else {
                System.out.println("Código inexistente.");
            }
        }

        System.out.println("\nEstoque atualizado:");
        for (int i = 0; i < codigosProdutos.size(); i++) {
            System.out.println("Código: " + codigosProdutos.get(i) + " | Estoque: " + estoqueProdutos.get(i));
        }

        scanner.close();
    }
}