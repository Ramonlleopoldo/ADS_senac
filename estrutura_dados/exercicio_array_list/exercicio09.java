package estrutura_dados.exercicio_array_list;

import java.util.ArrayList;

public class exercicio09 {

    public static void main(String[] args) {
        ArrayList<Integer> logica = new ArrayList<Integer>();
        ArrayList<Integer> programacao = new ArrayList<Integer>();
        logica.add(2513);
        logica.add(2134);
        logica.add(5412);
        logica.add(4217);
        logica.add(2121);
        logica.add(3749);
        logica.add(4012);
        logica.add(5122);
        logica.add(2387);
        logica.add(3888);
        logica.add(3122);
        logica.add(5551);
        logica.add(5432);
        logica.add(2122);
        logica.add(2098);
        programacao.add(3444);
        programacao.add(2121);
        programacao.add(4331);
        programacao.add(2387);
        programacao.add(5551);
        programacao.add(4335);
        programacao.add(2766);
        programacao.add(2098);
        programacao.add(4775);
        programacao.add(3749);
        int contador = 0;
        for (int num1 : logica) {
            for (int num2 : programacao) {
                if (num1 == num2) {
                    contador++;
                    break;
                }
            }
        }
        System.out.print("A quantidade ne alunos cursando a mesma disciplina são: "+contador);
    }
}