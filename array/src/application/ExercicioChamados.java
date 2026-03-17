package application;

public class ExercicioChamados {

    public static void main(String[] args) {


        int[] tempoChamados = {5, 12, 8, 22, 14, 30, 18};
        int maior = tempoChamados[0];
        int estouro = 0;

        for (int num : tempoChamados) {
            if (num > 15) {
                estouro++;
            }
        }

        for (int i = 0; i < tempoChamados.length; i++) {
            if (tempoChamados[i] > maior) {
                maior = tempoChamados[i];
            }
        }

        System.out.println("Quantidade de chamados que passaram de 15 minutos: " + estouro);
        System.out.println("O pior tempo de resposta foi de: " + maior + " minutos");

        if (estouro > 2) {
            System.out.println("ALERTA: Equipe de suporte sobrecarregada!");
        }


    }


}
