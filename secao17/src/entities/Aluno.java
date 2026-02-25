package entities;

import java.util.Objects;

public class Aluno{

    private Integer idAluno;
    private String curso;

    public Aluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public Aluno(Integer idAluno, String curso) {
        this.idAluno = idAluno;
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(idAluno, aluno.idAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idAluno);
    }

}
