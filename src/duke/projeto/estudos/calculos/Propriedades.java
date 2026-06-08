package duke.projeto.estudos.calculos;

import duke.projeto.estudos.modelos.Item;
import duke.projeto.estudos.modelos.Mansao;
import duke.projeto.estudos.modelos.Sala;

public class Propriedades {
    public void chamaNome (Mansao mansao) {
        System.out.println(mansao.getNome());
    }

    public void filtro (Avaliacao avaliacao) {
        if (avaliacao.avalia() > 4) {
            if (avaliacao instanceof Sala) {
                System.out.println("A Sala chamada " + avaliacao.getNome() + " é maneira!");
            }

            else if (avaliacao instanceof Item) {
                System.out.println("O Item chamado " + avaliacao.getNome() + " é maneiro!");
            }
        }
    }
}
