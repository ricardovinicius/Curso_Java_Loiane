package ricardo.cursojava.aula52.exercicio;

public class Contato {
    private String nome;
    private String telefone;
    private static int contador = 0;
    private int id;

    public Contato() { 
        this.id = contador; 
        contador += 1; 
    }
    
    public int getId() {
        return id;
    }
}
