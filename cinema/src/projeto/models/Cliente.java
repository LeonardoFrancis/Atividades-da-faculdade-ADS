
package projeto.models;

public class Cliente extends Pessoa {

    int cpf;
    String endereco;

    public Cliente(int cpf, String endereco) {
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", endereco=" + endereco + '}';
    }
}
