package projeto.models;

public class Pessoa {
    
    String nome;
    int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", anoNascimento=" + anoNascimento + '}';
    }
    
    
}
