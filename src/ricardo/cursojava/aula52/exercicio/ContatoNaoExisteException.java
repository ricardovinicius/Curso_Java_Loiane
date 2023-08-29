package ricardo.cursojava.aula52.exercicio;

public class ContatoNaoExisteException extends Exception {
    public ContatoNaoExisteException() {};

    public String toString() {
        return "Contato Consultado Não Existe";
    }
}
