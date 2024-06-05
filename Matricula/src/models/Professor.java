package models;

public class Professor extends Pessoa {

    private String formacao;
    private String areaAtuacao;

    public Professor(String formacao, String areaAtuacao, String nome, String dataNascimento, String cpf, String email, String cep) {
        super(nome, dataNascimento, cpf, email, cep);
        this.formacao = formacao;
        this.areaAtuacao = areaAtuacao;
    }
    
    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public String toString() {
        return "Professor{" + "formacao=" + formacao + ", areaAtuacao=" + areaAtuacao + '}';
    }
}
