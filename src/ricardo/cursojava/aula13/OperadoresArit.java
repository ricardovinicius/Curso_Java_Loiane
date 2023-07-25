package ricardo.cursojava.aula13;

public class OperadoresArit {
    public static void main(String[] args) {
        int res = 1 + 2;
        System.out.println(res);

        res = res - 1;
        System.out.println(res);

        res = res * 2;
        System.out.println(res);

        String primeiroNome = "Ricardo";
        String segundoNome = "Vinicius";

        String terceiroNome = primeiroNome + segundoNome;

        System.out.println(terceiroNome);

        int abc = 1;
        System.out.println(abc++);
        System.out.println(++abc);
    }
}
