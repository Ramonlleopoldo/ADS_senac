package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        String[] nomesalunos = new String[7];
        double[] mediasalunos = new double[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7 ; i++) {
            System.out.print("Digite o nome do aluno : ");
            nomesalunos[i] = scanner.next();
            System.out.print("Digite a média final do aluno ");
            mediasalunos[i] = scanner.nextDouble();
        }
        int maiormedia = 0;
        for (int i = 1; i < 7; i++) {
            if (mediasalunos[i] > mediasalunos[maiormedia]) {
                maiormedia = i;
            }
        }
        System.out.println("Aluno com maior média: " + nomesalunos[maiormedia]);
        for (int i = 0; i < 7 ; i++) {
            if (mediasalunos[i] < 7.0) {
                double notaExame = 10 - (mediasalunos[i] * 0.6);
                System.out.println("Aluno: " + nomesalunos[i] + ", precisa tirar " + notaExame + " no exame para ser aprovado.");
            }
        }
    }
}