
package projeto.models;

public class Sala {

    String identificacao, tipo;
    int capacidade;

    public Sala(String identificacao, String tipo, int capacidade) {
        this.identificacao = identificacao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "Sala{" + "identificacao=" + identificacao + ", tipo=" + tipo + ", capacidade=" + capacidade + '}';
    }
    
}
