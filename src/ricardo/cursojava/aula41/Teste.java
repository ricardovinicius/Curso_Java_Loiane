package ricardo.cursojava.aula41;

public class Teste {
    public static void main(String[] args) {
        // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        aluno.setEndereco("Rua 1");
        aluno.imprimirEtiquetaEndereco();
    }
}
