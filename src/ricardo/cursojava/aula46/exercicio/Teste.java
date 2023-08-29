package ricardo.cursojava.aula46.exercicio;

public class Teste {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro();
        Cubo cubo = new Cubo();
        Piramide piramide = new Piramide();

        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        FiguraGeometrica[] figuras = {cilindro, cubo, piramide, circulo, quadrado, triangulo};

        for (FiguraGeometrica figura : figuras) {
            if (figura instanceof Figura2D) {
                System.out.println(((Figura2D)figura).calcularArea());
            }

            if (figura instanceof Figura3D) {
                System.out.println(((Figura3D)figura).calcularVolume());
            }
        }
    }
}
