package ricardo.cursojava.aula47;

public class Excecao {
    public static void main(String[] args) {
        int[] vetor = new int[4];

        try {
            System.out.println("Antes da exception");

            vetor[4] = 1;

            System.out.println("Foo");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Bee");
        }

        System.out.println("pee");
            

        
    }
}
