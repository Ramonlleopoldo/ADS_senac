package estrutura_dados.exercicio_array_list;

import java.util.Scanner;
public class exercicio07 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[20];
        double[] salarios = new double[20];
        double[] novosalario = new double[20];
        double aumento = 0.08;

        for (int i = 0; i < 20; i++) {
            System.out.print("Informe o seu nome: ");
            nomes[i] = leia.nextLine();

            System.out.print("Informe o seu sálario: ");
            salarios[i] = leia.nextDouble();

            leia.nextLine();
        }
        for (int i = 0; i < 20; i++) {
            novosalario[i] = salarios[i] * (1 + aumento);
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("Sr(a): "+ nomes[i] +" o seu aumento foi para : "+ novosalario[i]);
        }
    }
}