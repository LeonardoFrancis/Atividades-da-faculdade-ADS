package models;

public class Curso {

    private String nome;
    private int ch;
    private Area area;

    public Curso(String nome, int ch, Area area) {
        this.nome = nome;
        this.ch = ch;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Curso{" + "nome=" + nome + ", ch=" + ch + ", area=" + area + '}';
    }
}
