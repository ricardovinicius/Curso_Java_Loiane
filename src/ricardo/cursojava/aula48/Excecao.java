package ricardo.cursojava.aula48;

public class Excecao {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i]/demon[i]));
            }
            catch (ArithmeticException e1) {
                System.out.println("div zero");
            }
            catch (Throwable exc) {
                System.out.println("aconteceu um erro");
            }
        }
    }
}
