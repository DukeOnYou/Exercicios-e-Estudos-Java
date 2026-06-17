package duke.projeto.estudos.colecionaveis.calculos;

import duke.projeto.estudos.colecionaveis.modelos.Item;
import duke.projeto.estudos.colecionaveis.modelos.Mansao;
import duke.projeto.estudos.colecionaveis.modelos.Sala;

public class Propriedades {
    public void chamaNome(Mansao mansao) {
        System.out.println(mansao.getNome());
    }

    public void filtro(Avaliacao avaliacao) {
        if (avaliacao.avalia() > 4) {
            if (avaliacao instanceof Sala sala && sala.getNome().equals("Gallery")) {
                System.out.println("A Sala chamada " + sala.getNome() + " é maneira!");
            } else if (avaliacao instanceof Item item) {
                System.out.println("O Item chamado " + item.getNome() + " é maneiro!");
            }
        }
    }
}
