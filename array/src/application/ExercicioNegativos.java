package application;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioNegativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros você vai digitar? Maximo de 10 ");
        int n = scanner.nextInt();

        int[] vect = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            vect[i] = scanner.nextInt();
        }

        System.out.println("Numeros negativos: ");
        for(int i = 0; i < n; i++){
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        scanner.close();

    }


}

