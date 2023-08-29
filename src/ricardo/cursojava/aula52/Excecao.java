package ricardo.cursojava.aula52;

public class Excecao {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 17, 32, 64, 128};
        int[] demon = {2, 0, 4, 8, 0};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(1, 2);
                }
                System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i]/demon[i]));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
