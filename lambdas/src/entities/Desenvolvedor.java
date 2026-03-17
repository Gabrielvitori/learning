package entities;

public class Desenvolvedor {

    private String nome;
    private Double salario;
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, Double salario, String linguagemPrincipal) {
        this.nome = nome;
        this.salario = salario;
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }
}
