package application;

import entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioAlturaMedia {
    public static void main(String[] args) {

        //esse foi resolvido em POO, utilizando a classe Pessoa
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serão digitadas?");
        int n = scanner.nextInt();

        Pessoa[] vetor = new Pessoa[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.println("Mome: ");
            String nome = scanner.nextLine();
            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            System.out.println("Altura: ");
            double altura = scanner.nextDouble();

            vetor[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0;
        int contMenores = 0;

        for (int i = 0; i < n; i++) {
            somaAlturas += vetor[i].getAltura();
            if (vetor[i].getIdade() < 16) {
                contMenores++;
            }
        }

        double mediaAltura = somaAlturas / n;
        double percentualMenores = ((double) contMenores / n) * 100.0;

        System.out.printf("\nAltura média: %.2f\n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }
        scanner.close();
    }
}
