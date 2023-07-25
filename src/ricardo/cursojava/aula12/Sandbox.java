package ricardo.cursojava.aula12;

import java.util.Scanner;
public class Sandbox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("nome = ");
        String nome = scan.nextLine();

        System.out.print("primeiroNome = ");
        String primeiroNome = scan.next();

        System.out.print("idade = ");
        int idade = scan.nextInt();

        System.out.print("altura = ");
        double altura = scan.nextDouble();

        System.out.println("nome = " + nome);
        System.out.println("primeiroNome = " + primeiroNome);
        System.out.println("idade = " + idade);
        System.out.println("altura = " + altura);

    }
}
