package application;


import entities.Aluno;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Aluno> alunoQtd = new HashSet<>();

        String[] nomesDosCursos = {"A", "B", "C"};

        for(String cursoAtual: nomesDosCursos) {
            System.out.print("How many students for course " + cursoAtual + "?");
            int quantidade = scanner.nextInt();
            for (int i = 0; i < quantidade; i++) {
                int idAluno = scanner.nextInt();
                Aluno aluno = new Aluno(idAluno);
                alunoQtd.add(aluno);
            }
        }

        System.out.println("Total studenst: " + alunoQtd.size());


    }
}
