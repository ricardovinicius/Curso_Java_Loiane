package ricardo.cursojava.aula41;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalarioLiquido() {
        return 0;
    }
    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Endereco do Professor: " + this.getEndereco());
    }
}
