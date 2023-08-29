package ricardo.cursojava.aula52.exercicio;

public class Agenda {
    Contato[] contatos = new Contato[3];
    int contadorContatos = 0;

    public void adicionarContato(Contato c) throws AgendaCheiaException {
        if (contadorContatos > contatos.length) {
            throw new AgendaCheiaException();
        }

        contatos[contadorContatos] = c;
        contadorContatos += 1;
    }

    public void consultarContato(Contato c) {
        for (Contato contato : contatos) {
            if (contato.getId() == c.getId()) {
                System.out.println("Contato encontrado");
            }
        }

        
    }
}
