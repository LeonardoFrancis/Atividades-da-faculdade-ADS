package models;

public class Instituicao {
    
    private String nome;
    private String cnpj;
    private String cep;
    private int telefone;

    public Instituicao(String nome, String cnpj, String cep, int telefone) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Instituicao{" + "nome=" + nome + ", cnpj=" + cnpj + ", cep=" + cep + ", telefone=" + telefone + '}';
    }
}
