package ricardo.exercicios_aula43.exer1;

public class ContaPoupanca extends ContaBancaria {
    private String diaRendimento;

    public String getDiaRendimento() {
        return diaRendimento;
    }
    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public void calcularNovoSaldo(double taxaRendPoup) {
        super.setSaldo(getSaldo() * taxaRendPoup);
    }
}
