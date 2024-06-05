package models;

public class Turma {

    private String identificacao;
    private String observacoes;
    private Sala sala;
    private Matricula matricula;
    private Professor professor;
    private Curso curso;

    public Turma(String identificacao, String observacoes, Sala sala, Matricula matricula, Professor professor, Curso curso) {
        this.identificacao = identificacao;
        this.observacoes = observacoes;
        this.sala = sala;
        this.matricula = matricula;
        this.professor = professor;
        this.curso = curso;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Turma{" + "identificacao=" + identificacao + ", observacoes=" + observacoes + ", sala=" + sala + ", matricula=" + matricula + ", professor=" + professor + ", curso=" + curso + '}';
    }
}
