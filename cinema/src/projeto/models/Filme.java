
package projeto.models;

public class Filme extends Diretor {
     
    String titulo, genero;
    int duracao;
    Diretor diretor;

    public Filme(String titulo, String genero, int duracao, Diretor diretor, int quantidadePremios, String nacionalidade) {
        super(quantidadePremios, nacionalidade);
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
        this.diretor = diretor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", genero=" + genero 
                        + ", duracao=" + duracao + ", diretor=" + diretor + '}';
    }
}
