package projeto.models;

public class Diretor extends Pessoa {
    
    int quantidadePremios;
    String nacionalidade;

    public Diretor(int quantidadePremios, String nacionalidade) {
        this.quantidadePremios = quantidadePremios;
        this.nacionalidade = nacionalidade;
    }

    public int getQuantidadePremios() {
        return quantidadePremios;
    }

    public void setQuantidadePremios(int quantidadePremios) {
        this.quantidadePremios = quantidadePremios;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public String toString() {
        return "Diretor{" + Diretor.class.getName() + "quantidadePremios=" + quantidadePremios 
                          + ", nacionalidade=" + nacionalidade + '}';
    }
}
