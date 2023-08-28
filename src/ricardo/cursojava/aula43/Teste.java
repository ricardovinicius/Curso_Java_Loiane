package ricardo.cursojava.aula43;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setCurso("CS");
        double[] notas = {10, 9, 8 , 7};

        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "teste";
        String s2 = "Teste";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        System.out.println(aluno.equals(aluno2));
    }
}
