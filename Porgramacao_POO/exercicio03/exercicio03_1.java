package Porgramacao_POO.exercicio03;

public class exercicio03_1 {
    public static void main(String[] args) {
        String nome = ("bem vindo ao");
        if (nome.length() > 50) {
            System.out.println("Frase longa");

        } else if (nome.length() < 50) {
            System.out.println("Frase curta");

        }
    }
}