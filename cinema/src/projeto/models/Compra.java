
package projeto.models;

public class Compra {

    int quantidadeIngressos;
    Double valor;
    String formaPagamento;
    Cliente cliente;
    Sessao sessao;
    Funcionario funcionario;

    public Compra(int quantidadeIngressos, Double valor, String formaPagamento, Cliente cliente, Sessao sessao, Funcionario funcionario) {
        this.quantidadeIngressos = quantidadeIngressos;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.sessao = sessao;
        this.funcionario = funcionario;
    }

    public int getQuantidadeIngressos() {
        return quantidadeIngressos;
    }

    public void setQuantidadeIngressos(int quantidadeIngressos) {
        this.quantidadeIngressos = quantidadeIngressos;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Compra{" + "quantidadeIngressos=" + quantidadeIngressos + ", valor=" + valor 
                         + ", formaPagamento=" + formaPagamento + ", cliente=" + cliente 
                         + ", sessao=" + sessao + ", funcionario=" + funcionario + '}';
    }
}
