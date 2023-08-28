package ricardo.exercicios_aula43.exer1;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (this.saldo > valor) { this.saldo -= valor; }
    }

    public void depositar(double valor) { saldo += valor; }
}
