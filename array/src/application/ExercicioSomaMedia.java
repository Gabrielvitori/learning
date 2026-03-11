package application;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioSomaMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quanto numeros você vai digitar?");
        int n = scanner.nextInt();

        double[] vect = new double[n];

        for(int i=0; i<n; i++) {
            System.out.println("Digite um numero: ");
            vect[i] = scanner.nextDouble();
        }

        double soma = 0;

        System.out.print("VALORES = ");
        for(int i= 0; i < n; i++){
            System.out.println(vect[i]);
            soma += vect[i];
        }

        System.out.println();
        double media = soma / n;

        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);


        scanner.close();


    }
}
