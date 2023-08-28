package ricardo.cursojava.aula41;

public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno() {
        super(); // chama o construtor vazio de Pessoa
    }

    public Aluno(String nome, String endereco, String telefone, String curso) {
        super(nome, endereco, telefone); // chama este construtor de Pessoa
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double[] getNotas() {
        return notas;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia() {
        return 0;
    }

    public boolean verificarAprovado() {
        return true;
    }

    @Override
    public void imprimirEtiquetaEndereco() {
        System.out.println("Endereco do Professor: " + this.getEndereco());
    }

    


}