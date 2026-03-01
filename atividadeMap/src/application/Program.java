package application;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Usuario\\Documents\\atividadeMap.txt");
        Scanner scanner = null;
        Map<String, Integer> votos = new HashMap<>();

        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] campos = linha.split(",");

                String candidato = campos[0].trim();
                int votosNovos = Integer.parseInt(campos[1].trim());

                if(votos.containsKey(candidato)){
                    int votosAtuais = votos.get(candidato);
                    votos.put(candidato, votosAtuais + votosNovos);
                }
                else{
                    votos.put(candidato, votosNovos);
                }
            }
        }catch(IOException e){
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
        for (String chave : votos.keySet()) {
            System.out.println(chave + ": " + votos.get(chave));
        }
    }
}
