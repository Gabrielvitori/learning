package application;


import entities.Desenvolvedor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Desenvolvedor> equipe = new ArrayList<>();
        equipe.add(new Desenvolvedor("Gabriel", 3500.0, "Java"));
        equipe.add(new Desenvolvedor("Alexia", 4200.0, "Python"));
        equipe.add(new Desenvolvedor("Astarion", 2800.0, "JavaScript"));
        equipe.add(new Desenvolvedor("Joseph", 5000.0, "Java"));

        equipe.removeIf(desenvolvedor -> desenvolvedor.getLinguagemPrincipal().equals("JavaScript"));

        double bonus = 500.00;
        equipe.forEach(desenvolvedor -> desenvolvedor.setSalario(desenvolvedor.getSalario() + bonus));

        List<String> nome = equipe.stream().map(desenvolvedor -> desenvolvedor.getNome().toUpperCase()).collect(Collectors.toList());

        System.out.println("--- Equipe Atualizada ---");
        equipe.forEach(d -> System.out.println(d.getNome() + " - " + d.getSalario()));

        System.out.println("\n--- Nomes para o Crachá ---");
        nome.forEach(System.out::println);


    }
}
