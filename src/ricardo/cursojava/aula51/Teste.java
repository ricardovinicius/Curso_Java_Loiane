package ricardo.cursojava.aula51;
import java.util.List;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        int i = 0;
        List<Integer> foo = new ArrayList<>();
        while(true) {
            i += 1;
            foo.add(i);
        }
    }
}
