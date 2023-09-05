package ricardo.cursojava.aula55;

public class Teste {
    public static void main(String[] args) {
        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia);
        }


        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        System.out.println(dia);
    }
}
