package models;

public class Sala {

    private String disponibilidade;
    private Instituicao instituicao;

    public Sala(String disponibilidade, Instituicao instituicao) {
        this.disponibilidade = disponibilidade;
        this.instituicao = instituicao;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Instituicao getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(Instituicao instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public String toString() {
        return "Sala{" + "disponibilidade=" + disponibilidade + ", instituicao=" + instituicao + '}';
    }
}
