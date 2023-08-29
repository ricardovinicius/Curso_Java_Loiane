package ricardo.cursojava.aula50;

import java.util.Scanner;

public class UsandoThrows {
    public static void main(String[] args) {
        try {
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }
    }

    public static double leNumero() throws Exception {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
}


