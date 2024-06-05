package models;

public class Matricula {

    private String ra;
    private String turno;
    private double valor;
    private String formaPagamento;
    private double bolsa;
    private Turma turma;
    private Aluno aluno;

    public Matricula(String ra, String turno, double valor, String formaPagamento, double bolsa, Turma turma, Aluno aluno) {
        this.ra = ra;
        this.turno = turno;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.bolsa = bolsa;
        this.turma = turma;
        this.aluno = aluno;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    @Override
    public String toString() {
        return "Matricula{" + "ra=" + ra + ", turno=" + turno + ", valor=" + valor 
                + ", formaPagamento=" + formaPagamento + ", bolsa=" + bolsa + ", turma=" + turma + ", aluno=" + aluno + '}';
    }
}
