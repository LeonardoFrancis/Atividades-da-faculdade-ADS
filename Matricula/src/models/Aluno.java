
package models;

public class Aluno extends Pessoa {

    private String comprovanteResidencia;
    private String comprovanteRenda;

    public Aluno(String comprovanteResidencia, String comprovanteRenda, String nome, String dataNascimento, String cpf, String email, String cep) {
        super(nome, dataNascimento, cpf, email, cep);
        this.comprovanteResidencia = comprovanteResidencia;
        this.comprovanteRenda = comprovanteRenda;
    }

    public String getComprovanteResidencia() {
        return comprovanteResidencia;
    }

    public void setComprovanteResidencia(String comprovanteResidencia) {
        this.comprovanteResidencia = comprovanteResidencia;
    }

    public String getComprovanteRenda() {
        return comprovanteRenda;
    }

    public void setComprovanteRenda(String comprovanteRenda) {
        this.comprovanteRenda = comprovanteRenda;
    }

    @Override
    public String toString() {
        return "Aluno{" + "comprovanteResidencia=" + comprovanteResidencia + ", comprovanteRenda=" + comprovanteRenda + '}';
    }
}
